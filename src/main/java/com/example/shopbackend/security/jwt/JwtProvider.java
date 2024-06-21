package com.example.shopbackend.security.jwt;

import com.example.shopbackend.security.UserPrinciple;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public interface JwtProvider {

    public String generateToken(UserPrinciple auth);

    public UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request);

    public boolean isTokenValid(HttpServletRequest request);
}
