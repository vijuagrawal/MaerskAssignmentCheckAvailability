package com.maersk.assignment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maersk.assignment.controller.dao.BookingAvailablility;
import com.maersk.assignment.service.MaerskAvailabilityService;

@RestController
public class MaerskAvailabilityController {

	@Autowired
	MaerskAvailabilityService maerskAvailabilityService;
	
	@PostMapping("/api/bookings")
	public ResponseEntity<BookingAvailablility> getAllTutorials() throws Exception {
	
		return new ResponseEntity<BookingAvailablility>(maerskAvailabilityService.checkAvailability(), HttpStatus.OK);

	}
}
