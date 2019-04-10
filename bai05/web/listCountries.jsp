
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIST COUNTRIES IN THE WORLD</title>
        
    </head>
    <body>
        <h1>LIST COUNTRIES IN THE WORLD</h1>
        <s:form action="CountryAction"> 
        <table>
                <tr>
                    <td><b>CountryId</b></td>
                    <td><b>CountryName</b></td>
                    <td><b>Position</b></td>
                    <td><b>Details</b></td>
                </tr>
                <s:iterator value="countries" status="stat">
                    <tr>                        
                        <td><s:property value="countries[%{#stat.index}].countryId" /></td>
                        <td><s:property value="countries[%{#stat.index}].countryName" /></td>
                        <td><s:property value="countries[%{#stat.index}].position" /></td>
                        <td><s:url value="detailCountry.jsp" /></td>
                    </tr>
                </s:iterator>
            </table>
            <s:submit name="submit" type="submit" value="Insert New Country"/>
        </s:form> 
    </body>
</html>
