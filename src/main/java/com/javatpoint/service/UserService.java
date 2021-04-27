package com.javatpoint.service;

import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;  
import com.javatpoint.model.UserRecord;  
import com.javatpoint.repository.UserRepository;    
@Service    
public class UserService   
{    
@Autowired    
private UserRepository userRepository;    
public List<UserRecord> getAllUsers()  
{    
List<UserRecord>userRecords = new ArrayList<>();    
userRepository.findAll().forEach(userRecords::add);    
return userRecords;    
}    
public void addUser(UserRecord userRecord)  
{  
userRepository.save(userRecord);    
}    
}    
