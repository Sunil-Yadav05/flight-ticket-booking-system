package com.flight.flight_ticket_booking.service;

import java.util.List;

import com.flight.flight_ticket_booking.dao.UserDao;
import com.flight.flight_ticket_booking.dto.User;

public class UserService {

	UserDao userDao = new UserDao();

	/*
	 * save User Details
	 */
	public User saveUser(User user) {

		return userDao.saveUser(user);
	}

	/*
	 * get AllUserDetails Method
	 */
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	/*
	 * 
	 */
	public User getUserByEmail(String userEmail) {
		
		return userDao.getUserByEmail(userEmail);
	}
}
