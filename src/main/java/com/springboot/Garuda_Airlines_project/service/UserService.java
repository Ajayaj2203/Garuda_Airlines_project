/**
 * 
 */
package com.springboot.Garuda_Airlines_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.Garuda_Airlines_project.dao.UserRepository;
import com.springboot.Garuda_Airlines_project.model.User;

/**
 * @author kudum
 *
 */
public class UserService {
    @Autowired
    private UserRepository repository;
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public int getId(int id) {
		// TODO Auto-generated method stub
		return repository.findId(id);
	}

	public String getName(String name) {
		// TODO Auto-generated method stub
		return repository.findName(name);
	}

	public String getProfession(String profession) {
		// TODO Auto-generated method stub
		return repository.findProfession(profession);
	}

	public String getAge(int age) {
		// TODO Auto-generated method stub
		return repository.findAge(age);
	}
	

}
