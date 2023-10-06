<%@page import="java.util.HashSet"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.example.Warehouse"%>
<%@ page import="com.example.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="w3-container" style="margin-left:10px; width:400px;">
    <%
        Warehouse wh = Warehouse.getInstance();
    	Iterator itr = wh.getUsers().iterator();
    	while (itr.hasNext()) {
    		out.println(itr.next());
    	}
    	User user = (User) request.getAttribute("userR");
		if (user!=null) {
			out.println("User "+user.getFirstName()+user.getLastName()+" succesfully removed");
		} else out.println("User not found!");
//      User user = (User) request.getAttribute("userR");
//	   	String u1 = (String) request.getAttribute("u1");
//		if (user!=null&&!u1.equals("User not found")) {
//		out.println("User "+user.getFirstName()+user.getLastName()+" succesfully removed");
//		} else if (user!=null&&u1.equals("User not found")) {
//			out.println("User not found");
//		} else out.println("DB is empty!");
    %>
    <h3 class="title w3-text-black">
        <span>Remove user</span>
    </h3>
    <form action="remove" method="post">
        <input class="w3-input w3-border" required name="firstName" placeholder="Enter First Name">
        <br>
        <input class="w3-input w3-border" required name="lastName" placeholder="Enter Last Name">
        <br>
        <button class="w3-button w3-round btn-block w3-red" type="submit">Remove</button>
    </form>
    <div>
        <button class="w3-btn w3-light-blue w3-round-large" onclick="location.href='/users'">Users</button>
        <button class="w3-btn w3-light-blue w3-round-large" onclick="location.href='/'">Home</button>
    </div>
</div>
</body>
</html>
