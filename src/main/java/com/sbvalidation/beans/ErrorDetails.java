package com.sbvalidation.beans;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
	private Date timestamp;
	private List<String>  message;
	private String details;
	
	

}
