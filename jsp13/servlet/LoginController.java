package web.jsp13.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. 클래스 생성 + HttpServlet 상속
public class LoginController extends HttpServlet {
	// 2. service 메서드 오버라이딩
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("login Form page 요청!!");
		
		
		//view로 이동 : form 페이지 보이도록 view페이지 포워딩
		request.getRequestDispatcher("/jsp13/loginForm.jsp").forward(request, response);
		
	}
	
	
	
}
