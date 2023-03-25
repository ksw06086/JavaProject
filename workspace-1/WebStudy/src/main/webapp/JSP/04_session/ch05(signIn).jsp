<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String agree = request.getParameter("agree");
	out.print("stragree : " + agree + "<br>");
	
	String result = "";
	/* 
		동의한 경우 session 값들을 받아온 후 result "SUCCESS"
		동의 안한 경우 result "FAIL"
	*/
	// 동의한 경우
	if(agree.equals("yes")){
		String id = (String)session.getAttribute("id");
		String pwd = (String)session.getAttribute("pwd");
		String name = (String)session.getAttribute("name");
		
		PrintWriter writer = null;
		/* 
			기본경로 => C:\Users\Happy\Downloads\유한대학교 2학년\java programing
			\JavaProject\workspace-1\.metadata\.plugins
			\org.eclipse.wst.server.core\tmp0\wtpwebapps
			\WebStudy
		*/
		
		/* 
			톰캣 환경설정이 locations 2번째 옵션, options 2,3번째 옵션이 설정되어
			있어야 뭐 경로로 설정됨
			server path => C:\apache-tomcat-9.0
			deploy path => wtpwebapps
			톰캣 환경이 위와 같지 않을 경우 톰캣에 지정된 server path 경로에 파일이 저장된다.
			기본경로 => C:\Users\Happy\Downloads\유한대학교 2학년\java programing
			\JavaProject\workspace-1\.metadata\.plugins
			\org.eclipse.wst.server.core\tmp0\wtpwebapps
			\WebStudy\WEB-INF\파일명.txt
		*/
		try{
			System.out.print(application.getRealPath("/WEB-INF/kim.txt"));
			String filepath = application.getRealPath("/WEB-INF/" + name + ".txt");
			writer = new PrintWriter(filepath);
			writer.println("아이디 : " + id);
			writer.println("패스워드 : " + pwd);
			writer.println("이름 : " + name);
			result = "SUCCESS";
		} catch(IOException e){
			result = "FAIL";
		} finally {
			try{
				writer.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	} else {
		result = "FAIL";
	}
	
	// 세션 종료 후, result를 가지고 ch05(result).jsp로 이동
	out.print("result : " + result);
	session.invalidate();
	
	response.sendRedirect("ch05(result).jsp?name=" + result);
%>
</body>
</html>