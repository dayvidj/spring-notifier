package com.dayvid.notifier.dto;

import com.dayvid.notifier.model.NotificationChannel;

public record UserDTO(String name, String phone, String email, NotificationChannel channel) {
}
