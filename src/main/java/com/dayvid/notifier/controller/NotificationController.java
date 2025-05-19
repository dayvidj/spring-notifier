package com.dayvid.notifier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dayvid.notifier.dto.NotificationDTO;
import com.dayvid.notifier.service.NotificationFacade;
import com.dayvid.notifier.service.UserService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private NotificationFacade facade;
	
	@PostMapping("/{userID}")
	public ResponseEntity<String> send(@PathVariable Long userID, @RequestBody NotificationDTO request){
		var user = userService.searchById(userID);
		
		facade.sendNotification(user, request.message());
		
		return ResponseEntity.ok("Notification sent successfully!");
	}

}
