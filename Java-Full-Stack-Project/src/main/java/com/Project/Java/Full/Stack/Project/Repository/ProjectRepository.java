package com.Project.Java.Full.Stack.Project.Repository;

import com.Project.Java.Full.Stack.Project.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <Project,Integer> {
}
