<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <c:forEach items="${users }" var="rs">
       <c:set value="${rs.email }" var="email"/>
       <c:set value="${rs.username }" var="username"/>
       <c:set value="${rs.id }" var="id"/>
 </c:forEach>

  <table border="2px">
    <th>Email</th>
    <th>Username</th>
    <th>Id</th>
   <tr>
     <td><c:out value="${email }"/></td>
        <td><c:out value="${username }"/></td>
           <td><c:out value="${id }"/></td>
   </tr>
  </table>
 
</body>
</html>