<%@ page import="java.util.Set" %>
<%@ page import="com.example.User" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<div style="margin-left:10px; margin-top:5px;">
    <div class="w3-container ">
        <h2 class="title w3-text-black">Users</h2>
        <%
            Set<User> users = (Set<User>) request.getAttribute("users");
            if (users != null && !users.isEmpty()) {
                out.println("<ol>");
                for (User user : users) {
                    out.println("<li>" + user.getFirstName() + " " + user.getLastName() + "</li>");
                }
                out.println("</ol>");
            } else out.println("<p>There are no users yet!</p>");
        %>
        <br>
        <div>
            <button class="w3-btn w3-green w3-round-large" onclick="location.href='/add'">Add User</button>
            <button class="w3-btn w3-red w3-round-large" onclick="location.href='/remove'">Remove User</button>
            <button class="w3-btn w3-light-blue w3-round-large" onclick="location.href='/'">Home</button>
        </div>
    </div>
</div>
</body>
</html>
