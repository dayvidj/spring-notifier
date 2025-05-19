package com.dayvid.notifier.service;

import com.dayvid.notifier.model.User;

public class SmsNotification implements NotificationStrategy{

	@Override
	public void send(User user, String message) {
		System.out.println("[SMS] Sending to " + user.getPhone() + ": " + message);
	}

}
