package com.springboot.app.example2.models;


import lombok.Data;
import lombok.Builder;
import java.io.Serializable;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {

	@Id
	private String id;

	private int empId;
	private String firstName;
	private String lastName;
	private float salary;
	
}
