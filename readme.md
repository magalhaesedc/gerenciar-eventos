# Projeto em Spring Boot - Java, Materialize & PostgreSQL

Desenvolvimento de um projeto de Sistema de Cadastro de Eventos com acesso ao banco de dados PostgreSQL e linguagem Java com Spring Boot.

## Assuntos Abordados no Desenvolvimento do Projeto:

- Acesso a banco de dados com o PostgreSQL
- Uso do framework Spring Boot com Maven para estruturar o projeto e gerenciar as dependências.  
- Uso do servidor web Apache Tomcat embutido no Spring Boot.
- Uso do framework Materialize para realização do layout para o projeto.

## Constrído com:

- Java 8
- PostgreSQL 12.8
- Materialize 1.0.0

## Configuração do Projeto:

- Para execução do projeto em servidor local (localhost) necessita descomentar os Bean referente as configurações do banco e comentar o Bean referente as configurações locais que foram usadas para hospedagem no Heroku.
- Editar a classe **DataConfiguration** 
- 
```
dataSource.setUrl("jdbc:postgresql://<nomeDoDominioOuIP>:<porta>/<nomeDaBase>");
dataSource.setUsername(<usuarioDoPostgreSQL>);
dataSource.setPassword("senhaDoUsuario");
```

## Autor:

- Edson Malhães da Costa (A partir das aulas da [Michelli Brito](https://www.youtube.com/watch?v=OHn1jLHGptw&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D))
