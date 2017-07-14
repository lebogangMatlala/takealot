/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.takealotProject.servece.impl;

import com.takealotProject.dao.impl.UserDao;
import com.takealotProject.model.User;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class UserServiceImpl implements UserService
{

    private UserDao userdao;
    
    private UserDao userdao(UserDao userdao)
    {
        
        return this.userdao = userdao;
    }
    
    @Override
    @Transactional
    public void addPerson(User u) {
        this.userdao.addPerson(u);
    }

    @Override
    @Transactional
    public void updatePerson(User u) {
        this.userdao.updatePerson(u);
    }

    @Override
    @Transactional
    public List<User> listPersons() {
        
        return this.userdao.listPersons();
    }

    @Override
    @Transactional
    public User getPersonById(int id) {
        return this.userdao.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        this.userdao.removePerson(id);
    }
    
}
