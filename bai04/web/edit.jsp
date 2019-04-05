<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit information</title>
        <s:head />
    </head>
    <body>
        <h1>Edit information </h1>
        <s:form action='save' method="post">
            <s:textfield key='personBean.firstName'/>                            
            <s:textfield key='personBean.lastName'/>                            
            <s:select key='personBean.sport' list='sports'/>
            <s:radio key='personBean.gender' list='genders'/>            
            <s:checkbox key='personBean.over18'/>
            <s:checkboxlist key='personBean.carModels' list='carModels'/>
            <s:submit key='submit'/>
        </s:form>
    </body>
</html>
