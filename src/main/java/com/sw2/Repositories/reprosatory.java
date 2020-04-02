package com.sw2.Repositories;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  reprosatory extends JpaRepository<User,String> {
	
}