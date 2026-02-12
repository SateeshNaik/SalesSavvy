package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.OTP;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.OTPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class OTPService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private OTPRepository otpRepository;

    public void sendOTP(Optional<User> user) {

        int otp = new Random().nextInt(100000, 999999);
        System.out.println(otp);

        // Remove old OTP if exists
        OTP oldOtp = otpRepository.findByUser(user);
        if (oldOtp != null) {
            otpRepository.delete(oldOtp);
        }

        User actualUser = user.orElseThrow(() -> new RuntimeException("User not found"));

        OTP newOTP = new OTP(otp, LocalDateTime.now(), actualUser);
        otpRepository.save(newOTP);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.get().getEmail());
        message.setSubject("Your OTP");
        message.setText("Your OTP is: " + otp);

        javaMailSender.send(message);
    }

    public boolean verifyOTP(Optional<User> user, int enteredOtp) {

        OTP savedOtp = otpRepository.findByUser(user);
        if (savedOtp == null) {
            return false;
        }

        // Expiry check (5 minutes)
        if (savedOtp.getCreatedat().plusMinutes(5).isBefore(LocalDateTime.now())) {
            otpRepository.delete(savedOtp);
            return false;
        }

        //  Direct comparison (NO BCrypt)
        if (savedOtp.getOtpvalue() != enteredOtp) {
            return false;
        }

        // OTP valid → delete
        otpRepository.delete(savedOtp);
        return true;
    }
}
