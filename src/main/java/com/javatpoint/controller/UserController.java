package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.UserRecord;  
import com.javatpoint.service.UserService;  
import java.util.List;    
@RestController    
public class UserController   
{    
@Autowired    
private UserService userService;     
@RequestMapping("/getalluser")    
public List<UserRecord> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping(value="/adduser", method=RequestMethod.POST)    
public void addUser(@RequestBody UserRecord userRecord)  
{    
	
userService.addUser(userRecord);    
} 
@DeleteMapping("/deleteuser/{id}")  
public String deleteUser(@PathVariable("id") int id) {
	userService.deleteUser(id);
	return "Deleted user "+id;
}
}    