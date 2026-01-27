import React, { useState} from "react";

function App() {
  const [isLogin, setIsLogin] = useState(true);
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [products, setProducts] = useState([]);

  const [form, setForm] = useState({
    username: "",
    email: "",
    password: "",
    role: "CUSTOMER"
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const submit = async (e) => {
    e.preventDefault();

    const url = isLogin
      ? "http://localhost:8080/api/auth/login"
      : "http://localhost:8080/api/users/register";

    const body = isLogin
      ? { username: form.username, password: form.password }
      : form;

    try {
      const res = await fetch(url, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        credentials: "include",
        body: JSON.stringify(body)
      });

      const data = await res.json();

      if (!res.ok) {
        alert(data.error || "Failed");
      } else {
        alert(isLogin ? "Login Success" : "Register Success");
        console.log(data);
        if (isLogin) {
          setIsAuthenticated(true);
          fetchProducts();
        }
      }
    } catch (err) {
      alert("Backend not reachable");
    }
  };

  const fetchProducts = async () => {
    try {
      const res = await fetch("http://localhost:8080/api/products", {
        credentials: "include"
      });
      const data = await res.json();
      setProducts(data);
    } catch (err) {
      alert("Failed to load products");
    }
  };

  const logout = () => {
    setIsAuthenticated(false);
    setProducts([]);
  };

  // 👇 PRODUCTS VIEW
  if (isAuthenticated) {
    return (
      <div style={{ maxWidth: 600, margin: "50px auto" }}>
        <h2>Products</h2>

        <button onClick={logout}>Logout</button>
        <hr />

        {products.length === 0 ? (
          <p>No products found</p>
        ) : (
          products.map((p) => (
            <div
              key={p.productId}
              style={{
                border: "1px solid #ccc",
                padding: 10,
                marginBottom: 10
              }}
            >
              <h4>{p.productName}</h4>
              <p>Price: ₹{p.price}</p>
              <p>Category: {p.category?.categoryName}</p>
            </div>
          ))
        )}
      </div>
    );
  }

  // 👇 LOGIN / REGISTER VIEW
  return (
    <div style={{ maxWidth: 400, margin: "50px auto" }}>
      <h2>{isLogin ? "Login" : "Register"}</h2>

      <form onSubmit={submit}>
        <input
          name="username"
          placeholder="Username"
          onChange={handleChange}
          required
        /><br /><br />

        {!isLogin && (
          <>
            <input
              name="email"
              placeholder="Email"
              onChange={handleChange}
              required
            /><br /><br />
          </>
        )}

        <input
          type="password"
          name="password"
          placeholder="Password"
          onChange={handleChange}
          required
        /><br /><br />

        {!isLogin && (
          <>
            <select name="role" onChange={handleChange}>
              <option value="CUSTOMER">Customer</option>
              <option value="ADMIN">Admin</option>
            </select><br /><br />
          </>
        )}

        <button type="submit">
          {isLogin ? "Login" : "Register"}
        </button>
      </form>

      <p
        style={{ cursor: "pointer", color: "blue" }}
        onClick={() => setIsLogin(!isLogin)}
      >
        {isLogin ? "Create account" : "Already have account?"}
      </p>
    </div>
  );
}

export default App;
