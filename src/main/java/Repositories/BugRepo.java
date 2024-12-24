package com.Java.Bug.Tracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Java.Bug.Tracker.Models.Bug;

public interface BugRepo extends JpaRepository<Bug, Integer> {

}
