package com.example.SalesSavvy.Entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(name = "otp")
public class OTP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int otpid;

    @Column(nullable = false)
    private int otpvalue;

    @Column(nullable = false)
    private LocalDateTime createdat;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public OTP() {
    }

    public OTP(int otpvalue, LocalDateTime createdat, User user) {
        this.otpvalue = otpvalue;
        this.createdat = createdat;
        this.user = user;
    }

    // Getters & setters
    public int getOtpid() {
        return otpid;
    }

    public int getOtpvalue() {
        return otpvalue;
    }

    public void setOtpvalue(int otpvalue) {
        this.otpvalue = otpvalue;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
