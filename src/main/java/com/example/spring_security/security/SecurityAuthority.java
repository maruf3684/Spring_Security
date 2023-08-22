package com.example.spring_security.security;

import com.example.spring_security.entities.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;
    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
