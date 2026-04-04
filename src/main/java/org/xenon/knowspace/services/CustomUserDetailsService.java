package org.xenon.knowspace.services;

import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.xenon.knowspace.repositories.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        var user = userRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("Username not found"));
       return new User(
               user.getEmail(),
               user.getPassword(),
               List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
       );
    }
}
