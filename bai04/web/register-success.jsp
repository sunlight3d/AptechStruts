<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register successful</title>
    </head>
    <body>
        <h1>Thanks for registering</h1>
        <p>Registration information: <s:property value="personBean" /></p>        
        <p><a href="<s:url action='index' />">Return to homepage</a></p>
    </body>
</html>
