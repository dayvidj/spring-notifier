package com.dayvid.notifier.service;

import com.dayvid.notifier.model.User;

public interface NotificationStrategy {
	void send(User user, String message);
}