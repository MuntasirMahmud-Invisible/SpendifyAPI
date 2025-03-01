package com.spendify.Spendify.repository;

import com.spendify.Spendify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
import java.util.UUID;
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);
}