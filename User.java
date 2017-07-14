package com.takealotProject.model;
// Generated 14 Jul 2017 10:54:18 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Registrationtbl generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer registrationId;
     private String firstName;
     private String lastName;
     private String email;
     private String password;
     private String phoneNumber;
     private String gender;
     private Date birthDate;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String phoneNumber, String gender, Date birthDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.phoneNumber = phoneNumber;
       this.gender = gender;
       this.birthDate = birthDate;
    }
   
    public Integer getRegistrationId() {
        return this.registrationId;
    }
    
    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }




}


