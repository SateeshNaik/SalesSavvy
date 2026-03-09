import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function ForgotPassword() {
  const [email, setEmail] = useState("");
  const [otp, setOtp] = useState("");
  const [step, setStep] = useState(1); // 1 = email, 2 = otp
  const [message, setMessage] = useState("");
  const [error, setError] = useState("");

  const navigate = useNavigate();

  // ================= SEND OTP =================
  const sendOtp = async () => {
    setError("");
    setMessage("");

    if (!email.trim()) {
      setError("Email is required");
      return;
    }

    try {
      const res = await fetch("http://localhost:8080/otp/send", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ email }),
      });

      const data = await res.text();

      if (!res.ok) {
        throw new Error(data || "Failed to send OTP");
      }

      setMessage("OTP sent to your email 📧");
      setStep(2);
    } catch (err) {
      setError(err.message);
    }
  };

  // ================= VERIFY OTP =================
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
        throw new Error(data || "Invalid OTP");
      }

      setMessage("OTP verified successfully ✅");

      // Move to reset password page
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
          <h1 className="form-title">Forgot Password</h1>

          {error && <p className="error-message">{error}</p>}
          {message && <p className="success-message">{message}</p>}

          {/* STEP 1: EMAIL */}
          {step === 1 && (
            <>
              <div className="form-group">
                <label className="form-label">Email</label>
                <input
                  type="email"
                  placeholder="Enter your email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  className="form-input"
                />
              </div>

              <button className="form-button" onClick={sendOtp}>
                Send OTP
              </button>
            </>
          )}

          {/* STEP 2: OTP */}
          {step === 2 && (
            <>
              <div className="form-group">
                <label className="form-label">Enter OTP</label>
                <input
                  type="text"
                  inputMode="numeric"
                  maxLength="6"
                  placeholder="6-digit OTP"
                  value={otp}
                  onChange={(e) =>
                    setOtp(e.target.value.replace(/\D/g, ""))
                  }
                  className="form-input"
                />
              </div>

              <button className="form-button" onClick={verifyOtp}>
                Verify OTP
              </button>
            </>
          )}
        </div>
      </div>
    </div>
  );
}
