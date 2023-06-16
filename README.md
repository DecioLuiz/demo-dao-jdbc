
# Java DAO e JDBC

Este é um projeto de demonstração que ilustra o uso do padrão DAO (Data Access Object) com JDBC (Java Database Connectivity).

## Entidades
 - Seller
 - Department

## Banco de Dados utilizado no projeto
 - MySQL

## Stack
 - Java SE-14
 - Eclipse IDE (4.25.0)
 - MySQL Workbench 8.0 CE

## Visão Geral
Este projeto de demonstração visa mostrar a implementação do padrão DAO utilizando JDBC para acesso a um banco de dados relacional. O objetivo é fornecer exemplos práticos e simples de como utilizar o DAO para separar a lógica de acesso aos dados da lógica de negócio em um aplicativo Java.

## Funcionalidades
 - Criação, atualização, remoção e consulta de objetos no banco de dados.
 - Exemplos de consultas utilizando SQL básico.
 - Manipulação de transações para garantir consistência dos dados.

## Pré-requisitos

Antes de prosseguir com a instalação e uso deste projeto, certifique-se de ter o seguinte software instalado em seu ambiente de desenvolvimento:

 - Java Development Kit (JDK) 8 ou superior.
 - Maven (para facilitar a gestão das dependências).


## Configuração do Banco de Dados

    1. Crie um banco de dados com o nome demo_dao_jdbc.
    2. No arquivo src/main/resources/db.properties, configure as propriedades url, user e password de acordo com as informações do seu banco de dados.

## 
## Instalação

Para instalar este projeto, siga as etapas abaixo:

    3. Faça um clone deste repositório para o seu ambiente local.
    4. Navegue até o diretório raiz do projeto.
    5. Execute o seguinte comando no terminal para compilar o projeto e baixar as dependências:

```bash
  mvn clean install
```

## Uso

Para executar este projeto, siga as etapas abaixo:

    6. Certifique-se de que o banco de dados MySQL esteja em execução.
    7. Navegue até o diretório raiz do projeto.
    8. Execute o seguinte comando no terminal para executar o projeto:

```bash
    mvn exec:java -Dexec.mainClass="com.example.demo.Application"
```

Isso irá iniciar a aplicação de demonstração, onde você poderá interagir com o banco de dados por meio de uma interface de linha de comando.
## Authors

- [@DecioLuiz](https://www.github.com/DecioLuiz)


## 🛠 Skills
Java, MySQL, JDBC, Java DAO

