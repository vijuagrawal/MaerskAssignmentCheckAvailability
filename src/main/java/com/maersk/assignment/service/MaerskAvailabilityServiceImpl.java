package com.maersk.assignment.service;

import org.springframework.stereotype.Service;

import com.maersk.assignment.controller.dao.BookingAvailablility;


@Service
public class MaerskAvailabilityServiceImpl implements MaerskAvailabilityService {

	public BookingAvailablility checkAvailability() {
		
		//calling External service
		double number = Math.random()*100;
		if(number >50) {
			return new BookingAvailablility(true);
		}else {
			return new BookingAvailablility(false);
		}
	};
}
