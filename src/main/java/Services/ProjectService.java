package com.Java.Bug.Tracker.Services;

import com.Java.Bug.Tracker.Models.Project;
import com.Java.Bug.Tracker.Repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }

    public Project getProjectById(int id) {
        return projectRepo.findById(id).orElse(null);
    }

    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public boolean deleteProjectById(int id) {
        Optional<Project> projectOptional = projectRepo.findById(id);
        if (projectOptional.isPresent()) {
            projectRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Project updateProject(int id, Project updatedProject) {
        Optional<Project> projectOptional = projectRepo.findById(id);
        if (projectOptional.isPresent()) {
            Project existingProject = projectOptional.get();
            existingProject.setName(updatedProject.getName());

            return projectRepo.save(existingProject);
        } else {
            return null;
        }
    }
}
