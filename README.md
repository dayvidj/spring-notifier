# Notifier API
Projeto desenvolvido com Spring Boot, que possibilita o cadastro de usuários e o envio de notificações personalizadas conforme as preferências individuais de cada usuário, utilizando os canais: **e-mail**, **SMS** e **push**.

Este projeto foi criado como parte do desafio proposto pela plataforma **DIO.me**, focado na aplicação de **Padrões de Projeto com Java**.

## Foram aplicados as seguintes práticas de design e padrões:
- **DTOs** para separar entidades da entrada de dados.
- **Facade** para abstrair a lógica de envio de notificações.
- **Strategy Pattern** para alternar entre canais de notificação (`EmailNotification`, `SmsNotification`, `PushNotification`).
-**Singleton** Utilizando injeção de depêndencia  

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória para testes)
- Maven

## Endpoints principais

### ➕ Cadastrar usuário

`POST /users`  
```json
{
  "name": "João Silva",
  "phone": "11999999999",
  "email": "joao@email.com",
  "channel": "EMAIL"
}
```

### 📢 Enviar notificação

`POST /notifications/{userId}`  
```json
{
  "message": "Sua compra foi confirmada!"
}
```



