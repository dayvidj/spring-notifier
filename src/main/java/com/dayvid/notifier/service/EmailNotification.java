package com.dayvid.notifier.service;

import com.dayvid.notifier.model.User;

public class EmailNotification implements NotificationStrategy{

	@Override
	public void send(User user, String message) {
		System.out.println("[EMAIL] Sending to " + user.getEmail() + ": " + message);
	}

}
