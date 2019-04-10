
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERT NEW COUNTRY</title>
    </head>
    <body>
        <h1>INSERT NEW COUNTRY</h1>
        
        <s:form action="insertCountry">            
            <table>
                <tr>
                    <td><b>CountryId:</b></td>
                    <td><s:textfield name="countryBean.countryId"/> </td>
                    <td><b>CountryName:</b></td>
                    <td><s:textfield name="countryBean.countryName"/> </td>
                    <td><b>Position:</b></td>
                    <td><s:textfield name="countryBean.position"/> </td>
                    <td><b>Area:</b></td>
                    <td><s:textfield name="countryBean.area"/> </td>
                    <td><b>Population:</b></td>
                    <td><s:textfield name="countryBean.population"/> </td>
                    <td><b>Image url:</b></td>                    
                    <td><s:textfield name="countryBean.imageUrl"/> </td>
                </tr>
                
            </table>
            
            
            <s:submit name="submit" type="submit" value="Add Country"/>
            <s:submit name="submit" type="submit" value="Reset"/>            
            <a href='listCountries.jsp'>go home</a>
        </s:form>
    </body>
</html>
