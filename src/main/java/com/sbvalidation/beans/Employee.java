package com.sbvalidation.beans;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Employee {

	
	private int empNo;
	@NotEmpty(message = "Please provide a name:")
	@Size(min=2, max=6, message = "Min 2 and max 6: ")
	private String empName;
	@Range(min = 18, max=58, message ="Invalid age:")
	private int age;
	@JsonFormat(shape =JsonFormat.Shape.STRING, pattern = "yyy/MM/dd")
	private LocalDate doj;
	@Email(message = "Check email address")
	private String email;
	private String check;
	
	
}
