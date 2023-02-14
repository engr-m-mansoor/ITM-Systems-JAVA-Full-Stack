package com.example.ViewResolver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ViewResolver.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
