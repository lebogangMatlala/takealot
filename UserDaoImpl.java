/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.takealotProject.dao.implementation;

import com.takealotProject.dao.impl.UserDao;
import com.takealotProject.model.User;
import java.util.List;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public class UserDaoImpl implements UserDao
{

    
        private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

    @Override
    public void addPerson(User u) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(u);
        logger.info("Person saved successfully, Person Details="+u);
        
    }

    @Override
    public void updatePerson(User u) {
        Session session = this.sessionFactory.getCurrentSession();
	session.update(u);
        logger.info("Person updated successfully, Person Details="+u);
    }

    @Override
    public List<User> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from Person").list();
		for(User u : userList){
			logger.info("Person List::"+u);
		}
		return userList;
    }

    @Override
    public User getPersonById(int id) {
       Session session = this.sessionFactory.getCurrentSession();		
		User u = (User) session.load(User.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+u);
		return u; 
    }

    @Override
    public void removePerson(int id) {
        Session session = this.sessionFactory.getCurrentSession();
		
                User u = (User) session.load(User.class, new Integer(id));
		if(null != u){
			session.delete(u);
		}
		logger.info("Person deleted successfully, person details="+u);
    }   
}
