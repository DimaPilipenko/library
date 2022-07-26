Library
====
This simple web application imitates the work of the book catalogue.

Project structure
-----------
Application is designed according to SOLID, REST principles, using DAO, DI and N-Tier Architecture patterns with next layers:
1. controllers layer;
2. services layer;
3. DAO layer;

Features
-----------
1. Create/update/delete author
2. Display all authors
3. Display author by id
4. Create/update/delete book
5. Display all books
6. Display book by id
7. Display all books by author
8. Display most published book by author
9. Display most selling book by author

Technologies
-----------
* Java 11
* Spring Boot
* Apache Maven
* MySQL

Usage
-----------
1. Install IntelliJ IDEA ultimate version;
2. Clone this project from GitHub and make sure that an absolute path doesn't include any white spaces and/or non-latin
   symbols;
4. Install MySQL and MySQL Workbench;
5. Install Postman
6. Configure application.properties file to make a connection to you DB;
7. Run application;
8. Test application using postman and/or your browser address bar

List of allowed http methods with available endpoints and roles
-----------
```
POST: /authors
PUT: /authors/{id}
GET: /authors
GET: /authors/{id}
DELETE: /authors/{id}
POST: /books
PUT: /books/{id}
GET: /books
GET: /books/{id}
DELETE: /books/{id}
GET: /books/by-author
GET: /books/by-author/most-selling
GET: /books/by-author/most-published
```
_____________________________
* All incoming and outgoing data converted to JSON format.
