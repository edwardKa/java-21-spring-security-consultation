package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SpringFilter springFilter;

    @Autowired
    private SpringFilter_2 springFilter_2;

    @Autowired
    private SpringFilter_3 springFilter_3;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/users/all").authenticated()
                .anyRequest().authenticated();

        http.addFilterBefore(springFilter_3, UsernamePasswordAuthenticationFilter.class);
        http.addFilterBefore(springFilter_2, SpringFilter_3.class);
        http.addFilterBefore(springFilter, SpringFilter_2.class);
    }
}
