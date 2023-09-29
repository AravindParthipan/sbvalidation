package com.sbvalidation.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.sbvalidation.beans.ErrorDetails;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorDetails> handleException(MethodArgumentNotValidException ex, WebRequest request){
		
		  List<String> errorMessages = new ArrayList<>();
	        
	      
	        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
	            errorMessages.add(fieldError.getDefaultMessage());
	        }
		ErrorDetails errorDetails = new ErrorDetails(new Date(),errorMessages, request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
		 
      
        
        
     
	}

}
