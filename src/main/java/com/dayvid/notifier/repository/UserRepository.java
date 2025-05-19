package com.dayvid.notifier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dayvid.notifier.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
