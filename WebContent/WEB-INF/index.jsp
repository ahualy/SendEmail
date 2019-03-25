<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>发送邮件</title>
</head>
<body>


  <h1>SSM发送邮件的四种姿势</h1>

   <div>
     <a href="${pageContext.request.contextPath}/mail/send">1.点击发送text格式的邮件！！！</a>
   <br>
   <a href="${pageContext.request.contextPath}/mail/send2">2.点击发送HTML格式的邮件！！！</a>
   <br>
   <a href="${pageContext.request.contextPath}/mail/send3">3.点击发送基于FreeMarker模板引擎的邮件！！！</a>
   <br>
   <a href="${pageContext.request.contextPath}/mail/send4">4.点击发送基于Velocity模板引擎的邮件！！！</a>
   </div>
  

</body>
</html>