package com.Project.Java.Full.Stack.Project.Controller;


import com.Project.Java.Full.Stack.Project.Entity.Project;
import com.Project.Java.Full.Stack.Project.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @GetMapping("/")
    public String home()
    {
        return "home";
    }
    @GetMapping("/BookRegister")
    public String newBookRegister()
    {
        return "newBookRegister";
    }
    @GetMapping("/availableBooks")
    public ModelAndView getAllBook()
    {
     List<Project> list=projectService.getAllBook();
        ModelAndView m=new ModelAndView();
        return m;
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute Project b)
    {
      projectService.save(b);
      return "redirect:/availableBooks";
    }

}
