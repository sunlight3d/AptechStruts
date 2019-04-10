<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>COUNTRY DETAIL</title>
    </head>
    <body>
        <h1>COUNTRY DETAIL</h1>
        <table>
            <tr>
                <td><img src="country.imageUrl"style="width:500px;height:300px;"></td>
                <td>
                    Country ID: <s:property value="country.countryId" />
                    Country Name <s:property value="country.countryName" />
                    Position: <s:property value="country.position" />
                    Area: <s:property value="country.area" />
                    population <s:property value="country.population" />
                </td>            
            </tr>
            <a href='listCountries.jsp'>go back</a>
        </table>
    </body>
</html>
