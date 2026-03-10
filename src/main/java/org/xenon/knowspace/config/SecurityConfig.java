package org.xenon.knowspace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception{
        return config.getAuthenticationManager();
    }
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .sessionManagement(c-> c.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .csrf((AbstractHttpConfigurer::disable))
                .authorizeHttpRequests(
                        c->c.requestMatchers("/auth/**").permitAll()
                );

        return http.build();
    }
}
