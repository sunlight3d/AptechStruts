<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <h1>Login page</h1>
        <s:form action="register">            
            <s:textfield name="personBean.email" label="Email:" /> 
            <s:textfield name="personBean.password" label="Last name:" type='password'/> 
            
            <s:textfield name="personBean.age" label="Age:" /> 
            <s:radio list="{'male', 'female'}" name="personBean.gender" label="Gender:" /> 
            <s:select cssStyle='width:155px' list="{'India', 'US', 'Vietnam', 'other'}"
                name='personBean.country'
            />
            
            <s:submit name="submit" type="submit" value="register"/>
            
        </s:form>
    </body>
</html>
