<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
        <s:head/>
    </head>
    <body>
        <h2>Register form</h2>
        <s:form action="register">
            <s:textfield name="personBean.firstName" label="First name:" /> 
            <s:textfield name="personBean.lastName" label="Last name:" /> 
            <s:textfield name="personBean.email" label="Email:" /> 
            <s:textfield name="personBean.age" label="Age:" /> 
            <s:submit name="submit" type="submit"/>
        </s:form>
    </body>
</html>
