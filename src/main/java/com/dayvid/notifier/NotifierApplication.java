package com.dayvid.notifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Descrição geral do projeto:
//Projeto "Sistema de Envio de Notificações Multicanal"
//-----------------------------------------
//Este projeto consiste em uma API REST construída com Java e Spring Boot que permite o cadastro de usuários e o envio de notificações via diferentes canais: e-mail, SMS e push notification.
//Foram aplicados na prática os padrões de projeto Singleton, Strategy e Facade

@SpringBootApplication
public class NotifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifierApplication.class, args);
	}

}
