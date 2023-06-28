<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <style>
        /* CSS styling for the dashboard */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        .container {
            display: flex;
            justify-content: space-around;
            align-items: center;
            height: 400px;
        }

        .widget {
            background-color: #f1f1f1;
            padding: 20px;
            width: 300px;
            text-align: center;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Dashboard</h1>
    </div>
    <div class="container">
        <div class="widget">
            <h2>Widget 1</h2>
            <p>This is the content of Widget 1.</p>
        </div>
        <div class="widget">
            <h2>Widget 2</h2>
            <p>This is the content of Widget 2.</p>
        </div>
        <div class="widget">
            <h2>Widget 3</h2>
            <p>This is the content of Widget 3.</p>
        </div>
        <div class="widget">
            <h2>Widget 3</h2>
            <select name="cities">
               <%
                 List<String> cities  =(List)request.getAttribute("cities");
                 for(String city:cities){
                	 out.println("<option value="+city+"</option>");
                 }
               %>
            </select>
         </div>
    </div>
</body>
</html>
