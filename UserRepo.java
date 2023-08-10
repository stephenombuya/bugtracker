package com.Java.Bug.Tracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Java.Bug.Tracker.Models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
