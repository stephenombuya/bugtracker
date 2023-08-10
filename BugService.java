package com.Java.Bug.Tracker.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.Bug.Tracker.Models.Bug;
import com.Java.Bug.Tracker.Repositories.BugRepo;

@Service
public class BugService {

    private final BugRepo bugRepo;

    @Autowired
    public BugService(BugRepo bugRepo) {
        this.bugRepo = bugRepo;
    }

    public Bug saveBug(Bug bug) {
        return bugRepo.save(bug);
    }

    public Bug getBugById(int id) {
        Optional<Bug> bugOptional = bugRepo.findById(id);
        return bugOptional.orElse(null);
    }

    public List<Bug> getAllBugs() {
        return bugRepo.findAll();
    }


    public boolean deleteBugById(int id) {
        // Check if the bug with the given ID exists in the database
        Optional<Bug> bugOptional = bugRepo.findById(id);
        if (bugOptional.isPresent()) {
            // Delete the bug from the database
            bugRepo.deleteById(id);
            return true;
        } else {
            // Return false if the bug with the given ID is not found
            return false;
        }
    }


    public Bug updateBug(int id, Bug updatedBug) {
        // Check if the bug with the given ID exists in the database
        Optional<Bug> bugOptional = bugRepo.findById(id);
        if (bugOptional.isPresent()) {
            // Update the bug with the new information
            Bug existingBug = bugOptional.get();
            existingBug.setTitle(updatedBug.getTitle());
            existingBug.setDescription(updatedBug.getDescription());
            existingBug.setReporter(updatedBug.getReporter());
            existingBug.setAssignee(updatedBug.getAssignee());
            existingBug.setProject(updatedBug.getProject());
            // Save the updated bug to the database
            return bugRepo.save(existingBug);
        } else {
            // Return null if the bug with the given ID is not found
            return null;
        }
    }
}
