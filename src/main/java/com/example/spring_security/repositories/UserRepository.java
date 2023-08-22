package com.example.spring_security.repositories;

import com.example.spring_security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("""
            SELECT obj FROM User obj WHERE obj.username = :username 
            """)
    Optional<User> findUserByUsername(String username);

}
