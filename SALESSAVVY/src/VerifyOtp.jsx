import React, { useState } from "react";
import { useLocation, useNavigate } from "react-router-dom";

export default function VerifyOtp() {
  const [otp, setOtp] = useState("");
  const [error, setError] = useState("");
  const [message, setMessage] = useState("");

  const navigate = useNavigate();
  const location = useLocation();

  // email passed from forgot-password page
  const email = location.state?.email;

  const verifyOtp = async () => {
    setError("");
    setMessage("");

    if (!otp.trim()) {
      setError("OTP is required");
      return;
    }

    try {
      const res = await fetch("http://localhost:8080/otp/verify", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          email,
          otp: Number(otp),
        }),
      });

      const data = await res.text();

      if (!res.ok) {
        throw new Error(data);
      }

      setMessage("OTP verified successfully ✅");

      // go to reset password page
      setTimeout(() => {
        navigate("/reset-password", { state: { email } });
      }, 1000);
    } catch (err) {
      setError(err.message);
    }
  };

  return (
    <div className="page-layout">
      <div className="page-container">
        <div className="form-container">
          <h1 className="form-title">Verify OTP</h1>

          {error && <p className="error-message">{error}</p>}
          {message && <p className="success-message">{message}</p>}

          <div className="form-group">
            <label className="form-label">Enter OTP</label>
            <input
              type="text"
              placeholder="Enter 6-digit OTP"
              value={otp}
              maxLength={6}
              onChange={(e) =>
                setOtp(e.target.value.replace(/\D/g, ""))
              }
              className="form-input"
            />
          </div>

          <button className="form-button" onClick={verifyOtp}>
            Verify OTP
          </button>
        </div>
      </div>
    </div>
  );
}
