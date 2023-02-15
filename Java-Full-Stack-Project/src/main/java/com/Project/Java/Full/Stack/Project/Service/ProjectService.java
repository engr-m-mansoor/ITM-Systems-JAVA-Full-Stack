package com.Project.Java.Full.Stack.Project.Service;

import com.Project.Java.Full.Stack.Project.Entity.Project;
import com.Project.Java.Full.Stack.Project.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public void save(Project b)
    {
        projectRepository.save(b);
    }
    public List<Project> getAllBook()
    {
        return projectRepository.findAll();
    }
}
