package com.dayvid.notifier.service;

import com.dayvid.notifier.model.User;

public class PushNotification implements NotificationStrategy {

	@Override
	public void send(User user, String message) {
		System.out.println("[PUSH] Sending notification to " + user.getName() + ": " + message);
	}

}
