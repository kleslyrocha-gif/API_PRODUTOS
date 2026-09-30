# API_PRODUTOS
# API de Produtos

API REST desenvolvida com **Spring Boot** para consulta de produtos.

## Tecnologias

* Java 21
* Spring Boot
* Maven
* Postman

## Funcionalidades

* Listar produtos
* Consultar produto pelo ID
* Consultar descrição de um produto

## Endpoints

```text
GET /produtos
GET /produtos/{id}
GET /produtos/{id}/descricao
```

## Como executar

No terminal, dentro da pasta do projeto:

```bash
.\mvnw.cmd spring-boot:run
```

A API será executada em:

```text
http://localhost:8080
```

Os endpoints podem ser testados utilizando o **Postman**.
