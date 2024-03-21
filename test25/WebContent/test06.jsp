<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 8 객체</title>
</head>
<body>
<h2> Jsp 내장객체 </h2>
<p>out: 브라우저에 출력할 경우 사용</p>
<p>request: 요청정보를 담는 객체</p>
<p>response: 응답정보를 담는 객체</p>
<p>session : 세션 정보를 담는 객체</p>
<p>application : 웹 애플리케이션 정보를 담는 객체</p>
<p>config : 웹 페이지 정보를 담는 객체</p>
<p>page : 세션 정보를 담는 객체</p>
<p>exception : 에외 처리정보를 담는 객체</p>

<%
	// Servlet에서 page 객체 생성하기
	// HttpServlet spageContext = new HttpServlet();
	// Object page = spageContext.getPage();
	
	// Servlet에서 out 객체 생성하기
	// PrintWriter out = response.getWriter();
	
	// Servlet에서 request 객체 생성하기
	// ServletRequest request = pageContext.getRequest();

	// SErvlet에서 response 객체 생성하기
	// ServletResponse response = pageContext.getResponse();

	// SErvlet에서 session 객체 생성하기
	// HttpSession session = pageContext.getSession();

	// SErvlet에서 aplication 객체 생성하기
	// ServletContext aplication = pageContext.getServletContext();
	
	// SErvlet에서 config 객체 생성하기
	//ServletConfig config = pageContext.getServletConfig();
	
	// SErvlet에서 exception 객체 생성하기
	// Exception exception = pageContext.getException();
	
	// 서블릿에서 jsp 객체 생성하기
	// JspWriter jspOut = pageContext.getOut();
	String name = "김기태";
	out.println("<h2>" + name + "</h2>");
	out.println("<br>");
%>

<h2><%=name %></h2>
<%
	JspWriter jspOut = pageContext.getOut(); // out 객체 만들기
	out.println("<h2>out(출력): 태그를 포함한 내용을 출력할 수 있는 객체</h2>");
	out.println(jspOut == out);
	
	ServletRequest jspReq = pageContext.getRequest();
	out.println("<h2>request(요청): 브라우저를 통하여 요청한 정보를 저장하는 객체</h2>");
	out.println(jspReq== request);
	
	ServletResponse jspRes = pageContext.getResponse();
	out.println("<h2>response(응답): 브라우저를 통하여 반환한 정보를 저장하는 객체</h2>");
	out.println(jspRes == response);
	
	HttpSession jspSes = pageContext.getSession();
	out.println("<h2>session(세션): 인가된 사용자 정보를 저장하는 객체</h2>");
	out.println("<h3>session(세션)은 로그아웃 전 또는 브라우저를 종료하기 전까지 그 정보가 유지된다</h3>");
	out.println(jspSes == response);
	
	ServletContext jspApp = pageContext.getServletContext();
	out.println("<h2>application(앱): 인가된 사용자 정보를 저장하는 객체</h2>");
	out.println("<h3>application(앱)은 브라우저 종료 전까지 정보가 유지 된다.</h3>");
	out.println(jspApp == application);
	
	ServletConfig jspCon = pageContext.getServletConfig();
	out.println("<h2>config(설정): 애플리케이션 설정 정보를 저장하는 객체 </h2>");
	out.println(jspCon == config);
	
	Exception jspExc = pageContext.getException();
	Exception exception = pageContext.getException();
	out.println("<h2>exception(예외)): 예외 처리 정보를 저장하는 객체 </h2>");
	out.println(jspExc == exception);
	
	Object jspPage = pageContext.getPage();
	out.println("<h2>page(페이지)): 현재 페이지 정보를 저장하는 객체</h2>");
	out.println("<h3>page(페이지)는 그 정보가 현재 페이지 내에서만 정보가 유지된다.</h3>");
	
	out.println("<h3>전송된 값은 그 정보가 목적지까지만 유지되며, 다른 페이지에서는 해당 정보를 확인할 수 없다.</h3>");
	out.println("<p>웹 환경에서의 Scope: 그 정보가 어디 또는 언제까지 유지</p>");
	out.println("page< trans < session < application");
	
	// page.setAttribute("name","kkt"); -> 모든 8대 객체에 저장시는 setAttribute("필드명", "값")
	// request.getAttribute("name"); -> ahems 8대 객체에서 값을 가져올 경우는 getAttribute("필드 명")
	// 단, request 객체의 값을 가져올 경우는 getParameter("파라미터명")
	
%>
<div>
	<a href = "test07.jsp">secope</a>	
</div>
</body>
</html>