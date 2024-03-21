<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스코프 데이터 추적하기</title>
</head>
<body>
<h2>스코프 데이터 추적하기</h2>
<%
	String msg = request.getParameter("msg");
	String pageData = (String)pageContext.getAttribute("pageData");
	String reData= (String) request.getAttribute("reData");
	String sesData= (String) session.getAttribute("sesData");
	String appData= (String) application.getAttribute("appData");
%>
<div>
	<p>msg(request on) : <%=msg %></p>
	<p>psgeData(psgeContext) : <%=pageData %></p>
	<p>reData(request off) : <%=reData %></p>
	<p>sesData(session) : <%=sesData %></p>
	<p>appData(application) : <%=appData %></p>	
<%
	 session.invalidate(); // 세션종료 => 로그아웃
	// sesData = (String) session.getAttribute("sesData");
	 // 세션값을 날렸는데 다시 불러 들어 왔음으로 null 오류가 발생함.
%>	
	<p>세션종료후</p>
	<p>sseData(session) : <%=sesData %>
	<p>appData(application) : <%=appData %></p>
	<p>web.xml 전역변수 : <%=application.getInitParameter("admin") %></p>
</div>
<hr>
<div>
	<a href = "index.jsp">홈으로</a>
	<a href = "test06.jsp">테스트 06로 이동</a>	
	</div>
</body>
</html>