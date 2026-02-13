import { useState } from "react";
import Register from "./Register";
import Login from "./Login";

function App() {
  const [showLogin, setShowLogin] = useState(false);

  return (
    <div style={{ textAlign: "center" }}>
      <button onClick={() => setShowLogin(false)}>Register</button>
      <button onClick={() => setShowLogin(true)}>Login</button>

      {showLogin ? <Login /> : <Register />}
    </div>
  );
}

export default App;
