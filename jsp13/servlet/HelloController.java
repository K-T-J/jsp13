package web.jsp13.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//Controller (servlet)
public class HelloController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//uri 분석
		System.out.println("Hello!! Controller run!!!");
		//비지니스 로직처리	(dto, dao, bean())
		
		/*
			request의 속성 (Attribute)를 이용하여 데이터 저장해서 포워딩하기. -> hello.jsp에서 request에서 값 꺼낼수
			있다.
		*/
		
		request.setAttribute("id", "java");	//계속 request와 response는 가지고 이동하니깐 갈때 값을 같이 넣어서 가져가게 해도된다.
		request.setAttribute("num", 1111);
		
		
		//session의 속성을 이용하여 데이터 저장해보자
		HttpSession session = request.getSession();//request에서 세션 꺼내기
		session.setAttribute("memId", "pika");
		
		
		//jsp랑 포워딩 (view 페이지로 이동)
		request.getRequestDispatcher("/jsp13/hello.jsp").forward(request, response); //응답으로 보여줄 jsp 지정해주기. //request와 response 객체 전달
		
	}
	
	
	
	
	
	
	
}
