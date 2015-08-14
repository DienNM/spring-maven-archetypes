#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="resources/css/app.css">
    <title>Web Status</title>
</head>
    
<body>
    <h2>Web Status</h2>
    <hr>
    <table>
        <tr>
            <td>Statue</td>
            <td class = "${symbol_dollar}{webStatus.status}">${symbol_dollar}{webStatus.status}</td>
        </tr>
        <tr>
            <td>Message</td>
            <td>${symbol_dollar}{webStatus.message}</td>
        </tr>
    </table>
</body>
</html>