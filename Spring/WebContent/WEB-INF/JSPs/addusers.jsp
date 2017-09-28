<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link type="text/css" href="${pageContext.request.contextPath}/static/main.css" rel="stylesheet"/>
</head>
<body>

 <%=request.getAttribute("users") %>
 <form:form action="${pageContext.request.contextPath}/AddUser" method="post" commandName="users">
  <table>
  <tr>
  <td>
  Username : <form:input path="username" name="username" type="text"  class="border text" />
  <form:errors cssClass="error" path="username"/>
  </td>
  </tr>
  <tr><td>
  Email : <form:input name="email" path="email" type="text" class="border text"/><br/><br/>
  <form:errors cssClass="error" path="email"/>
  </td></tr>
  <tr><td>
  Password : <form:input  name="password" path="password" type="text" class="border text"/><br/><br/>
  <form:errors path="password" cssClass="error"/>
  </td></tr><br>
  <input type="submit" />
   </table>
 </form:form>

</body>
</html>