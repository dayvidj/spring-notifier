package com.dayvid.notifier.service;

import org.springframework.stereotype.Service;

import com.dayvid.notifier.model.User;

@Service
public class NotificationFacade {

	public String sendNotification(User user, String message) {
		var notifier = switch (user.getFavoriteChannel()) {
		case EMAIL -> new EmailNotification();
		case SMS -> new SmsNotification();
		case PUSH -> new PushNotification();
		};

		notifier.send(user, message);
		return "Notification sent successfully!";
	}

}
