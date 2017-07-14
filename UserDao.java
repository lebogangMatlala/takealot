/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.takealotProject.dao.impl;

import com.takealotProject.model.User;
import java.util.List;

/**
 *
 * @author hp
 */
public interface UserDao 
{
    

	public void addPerson(User u);
	public void updatePerson(User u);
	public List<User> listPersons();
	public User getPersonById(int id);
	public void removePerson(int id);

}
