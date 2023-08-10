package com.Java.Bug.Tracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Java.Bug.Tracker.Models.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
