
# Eventos microservice

**Se trata de um microserviço para criação de eventos públicos ou virtuais, com envio de email de confirmação ao se registrar no evento.**

# 📁 Acesso ao projeto

**Para baixar o projeto clique <a href="https://github.com/gabriel-afg/EventMicroservice/archive/refs/heads/main.zip">aqui</a>.**

# 🛠️ Guia

**1. Para testar na sua máquina é preciso baixar o microserviço de envio de email clicando <a href="https://github.com/gabriel-afg/EmailMicroservice/archive/refs/heads/main.zip">aqui</a>.**

**2. Após o download, extraia a pasta e coloque na IDE que preferir. E execute ambos os projetos**

# Tecnologias utilizadas

- `Java`
- `SpringBoot`
- `Spring Cloud OpenFeign`

## Documentação da API

#### Buscar eventos

```http
  GET /events
```


#### Buscar eventos que estão por vir

```http
  GET /events/upcoming
```

### Criar evento

```http
  POST /events
```

| Parâmetro   | Tipo       |
| :---------- | :--------- | 
| `maxParticipants`      | `int` | 
| `registeredPaticipants`      | `int` |  
| `date`      | `String` | 
| `title`      | `String` | 
| `description`      | `String` | 

### Registrar no evento

```http
  POST /{eventId}/register
```

| Parâmetro   | Tipo       |
| :---------- | :--------- | 
| `participantEmail`| `String` | 
