package com.example.ViewResolver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ViewResolver.Entity.User;
import com.example.ViewResolver.Repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository repo;

	@GetMapping("/index")
	public String showUserList(Model model) {
		model.addAttribute("users", repo.findAll());
		return "index";
	}
	
	@GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }
	
	@PostMapping("/adduser")
    public String addUser(@Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        repo.save(user);
        return "redirect:/index";
    }
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, @Validated User user, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        user.setId(id);
	        return "update-user";
	    }        
	    repo.save(user);
	    return "redirect:/index";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
	    User user = repo.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    
	    model.addAttribute("user", user);
	    return "update-user";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id, Model model) {
	    User user = repo.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    repo.delete(user);
	    return "redirect:/index";
	}

}
