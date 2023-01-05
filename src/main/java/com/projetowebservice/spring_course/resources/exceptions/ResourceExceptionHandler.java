package com.projetowebservice.spring_course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.projetowebservice.spring_course.services.exceptions.DatabaseException;
import com.projetowebservice.spring_course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError erro = new StandardError(Instant.now(), status.value(), error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(erro);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseException(DatabaseException e, HttpServletRequest request){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError erro = new StandardError(Instant.now(), status.value(), error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(erro);
	}
	 
}
