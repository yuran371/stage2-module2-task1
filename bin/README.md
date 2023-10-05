# Servlets

## Materials

- [Download Tomcat](https://tomcat.apache.org/download-10.cgi)

## Description:

An application has a starter page with 2 buttons: "Add User" and "Users". You need to create handlers for them. To achieve that create 2 servlets:

- AddUserServlet
- GetUsersServlet

## Details

**AddUserServlet** should:

1. be placed in `com.example.servlet` package
2. have `/add` url
3. should navigate to `/add` page
4. when adding a new user should:
   - receive 2 params: firstName, lastName
   - save user in [Warehouse](src/main/java/com/example/Warehouse.java)
   - return request attribute "user"
   - navigate to /add page

**GetUsersServlet** should:

1. be placed in `com.example.servlet` package
2. have url `/users`
3. receive users from [Warehouse](src/main/java/com/example/Warehouse.java)
4. as a result should:
   - return request attribute "users"
   - navigate to `/users` page

## Important note

It is important that you use JavaEE, not JakartaEE and Tomcat 9.x or lower.
