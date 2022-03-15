/**
 * 
 */
package com.springboot.Garuda_Airlines_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Garuda_Airlines_project.model.User;
import com.springboot.Garuda_Airlines_project.service.UserService;

/**
 * @author kudu
 *
 */
@RestController
@RequestMapping("/GarudaAirlines")
public class UserController {
	@Autowired
	private UserService service;
	
    @GetMapping("/getUsers")
    public List<User>getAllUsers()
    {
    return service.getUsers();
    }
    @GetMapping("/getUsers/{id}")
    public int getId(@PathVariable int id)
    {
    return service.getId(id);
    }
   @GetMapping("/getUsers/{name}")
    public String getName(@PathVariable String name)
    {
    return service.getName(name);
    }
   @GetMapping("/getUsers/{profession}")
   public String getProfession(@PathVariable String profession)
   {
   return service.getProfession(profession);
   }
   @GetMapping("/getUsers/{age}")
   public String getAge(@PathVariable int age)
   {
   return service.getAge(age);
   }
}

