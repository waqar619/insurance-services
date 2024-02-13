package com.insurance.insuranceservice.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Map> handleNoSuchElementException(NoSuchElementException ex) {
		Map<String, String> test = new HashMap<String, String>();
		test.put("Error message: ", ex.getMessage());
		//test.put("errorCode: ", ex.get);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(test);
    }

	
//	@ExceptionHandler(BusinessException.class)
//    public ResponseEntity<ErrorResponseDto> handleBusinessException(BusinessException ex) {
//		
//		ErrorResponseDto errorResp = new ErrorResponseDto();
//		ErrorResponseDto 
//		
//		HashMap<String, String> errorHandler = new HashMap<>();
//        return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                .body("Error message" + ex.getMessage());
//    }
}
