<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹의 객체 전달과 스코프(Scope) 열기</title>

</head>
<body>
<h2>웹의 객체 전달과 스코프(Scope) 알기</h2>
<%
	ArrayList<String> lst = new ArrayList<String>();
	lst.add("이정희");
	lst.add("이원석");
	lst.add("이예린");
	lst.add("이연정");
	lst.add("이성하");
	request.setAttribute("lst",lst);
	
	Set<String> set = new HashSet<String>();
	set.add("김1");
	set.add("김2");
	set.add("김3");
	set.add("김4");
	set.add("김5");
	request.setAttribute("set", set);
	
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "이1");
	map.put(2, "이2");
	map.put(3, "이3");
	map.put(4, "이4");
	map.put(5, "이5");
	map.put(6, "이6");
	request.setAttribute("map", map);
	
	RequestDispatcher rd = request.getRequestDispatcher("test08.jsp"); //목적지 지정
	rd.forward(request, response);
	// 데이터 전달
	response.sendRedirect("test08.jsp");
	// 페이지 이동(화면 이동 X) : URL은 test07.jsp이지만, 화면의 내용은 test08.jsp로 출력됨.

%>
</body>
</html>