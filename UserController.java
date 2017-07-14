/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.takealotProject.contoller;

import com.takealotProject.model.User;
import com.takealotProject.servece.impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author hp
 */
@Controller
public class UserController 
{
    private UserService userservice;
    
        @Autowired(required=true)
	@Qualifier(value="userservice")
	public void setUserService(UserService us){
		this.userservice = us;
	}
	
        @RequestMapping(value = "/user", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("listPersons", this.userservice.listPersons());
		return "user";
	}
        
        @RequestMapping(value= "/user/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("user") User u){
		
		if(u.getRegistrationId() == 0){
			//new person, add it
			this.userservice.addPerson(u);
		}else{
			//existing person, call update
			this.userservice.updatePerson(u);
		}
		
		return "redirect:/user";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.userservice.removePerson(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userservice.getPersonById(id));
        model.addAttribute("listPersons", this.userservice.listPersons());
        return "user";
    }
        
        
        
}
