<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET방식 데이터 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	int point = Integer.parseInt(request.getParameter("point"));
%>

<h2>요청된 데이터</h2>
<%
	String hak = "";
	if(point >= 90){
		hak = " 수 ";
	} else if(point >=80){
		hak = " 우 ";
	} else if(point >=70){
		hak = " 미 ";
	} else if(point >=60){
		hak = " 양 ";
	} else	
		hak = "가";

	
%>
<ul>
	<li><Strong>이름</Strong> : <span><%=name %></span></li>
	<li><Strong>나이</Strong> : <span><%=age %></span></li>
	<li><Strong>점수</Strong> : <span><%=point %></span></li>
	<li><Strong>학점</Strong> : <span><%=hak %></span></li>
	
</ul>
</body>
</html>