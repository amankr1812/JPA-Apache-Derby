package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;  
import com.javatpoint.model.UserRecord;    
public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
}    