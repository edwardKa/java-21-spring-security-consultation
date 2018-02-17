package com.example.demo;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@Component
public class SpringFilter_3 extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Authentication");

        //kljask512ldj51liajsl123dj11523asd (hash) = admin => in MY database!!
        //UUID = admin
        // (weight * height * cells amount * date now) = hash


        String key_from_the_server_for_java_21 = request.getHeader("key_from_the_server_for_java_21");
        if (key_from_the_server_for_java_21 != null) {

            if (key_from_the_server_for_java_21.equals("kljask512ldj51liajsl123dj11523asd")) {
                UsernamePasswordAuthenticationToken keyFromSpring = new UsernamePasswordAuthenticationToken(
                        "gandalf",
                        null,
                        Collections.emptyList()
                );

                SecurityContextHolder.getContext().setAuthentication(keyFromSpring);
            }
        }

        filterChain.doFilter(request, response);
    }
}
