<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- The taglib directive tells the Servlet container that this page will be using the Struts 2 tags -->
<!-- and that these tags will be preceded by s. -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World.jsp!</title>
  </head>
  <body>
    <h2><s:property value="messageStore.message" /></h2>
    <h3><s:property value="messageStore.message2" /></h3>
    <p></p>
    Hello World, <s:property value = "name"/>
  </body>
</html>
