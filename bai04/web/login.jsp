
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="login">
            <s:textfield label="User's email" key="personBean.email" />
            <s:password label="Password" key="personBean.password"/>
            <s:submit />
        </s:form>
    </body>
</html>
