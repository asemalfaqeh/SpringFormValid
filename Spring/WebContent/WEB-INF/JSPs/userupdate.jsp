<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link type="text/css" href="${pageContext.request.contextPath}/static/main.css" rel="stylesheet"/>
<title>Update Users</title>
</head>

<body>

  <table style="border: 3px black solid;padding: 8px">
   <form:form method="post" action="${pageContext.request.contextPath}/updateuser" commandName="users">
    <tr>
     <td>Usernmae</td><td><form:input type="text" name="usernmae" path="username"/> </td>
     <form:errors cssClass="error" path="username"></form:errors>
    </tr>
    <tr> 
     <td>Email</td><td> <form:input path="email" type="text" name="email"/> </td>
     <form:errors path="email" cssClass="error"></form:errors>
    </tr>
   <tr>
     <td>Password</td><td> <form:input type="text" name="password" path="password"/> </td>
     <form:errors cssClass="error" path="password"/>
   </tr>
    <tr>
     <td>id</td><td> <form:input type="text" name="id" path="id"/> </td>
     <form:errors cssClass="error" path="id"></form:errors>
    </tr>
    <tr>
     <td> <input  type="submit"/> </td>
    </tr>
   </form:form>
 </table>

</body>
</html>