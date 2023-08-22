package com.example.spring_security.services;

import com.example.spring_security.repositories.UserRepository;
import com.example.spring_security.security.SecurityUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private  final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var u = userRepository.findUserByUsername(username);;
        var convertedUser= u.map(SecurityUser::new)
                .orElseThrow(()-> new UsernameNotFoundException("Username not Found" + username));
        return convertedUser;
    }
}
