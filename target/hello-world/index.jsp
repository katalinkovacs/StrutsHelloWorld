<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
    <p></p>
    <form action = "hello">
             <label for = "name">Please enter your name</label><br/>
             <input type = "text" name = "name"/>
             <input type = "submit" value = "Submit"/>
    </form>
    <p></p>
    <p><a href="<s:url action='hello'/>">Hello World</a></p>

  </body>
</html>
