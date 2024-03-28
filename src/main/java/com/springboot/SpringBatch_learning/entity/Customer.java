package com.springboot.SpringBatch_learning.entity;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Component
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  
	@Id
    private int id;

    private String firstName;

    private String lastName;
  
    private String email;
  
    private String gender;
  
    private String contactNo;
  
    private String country;
 
    private String dob;

    private String age;
}