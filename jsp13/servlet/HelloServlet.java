package web.jsp13.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;


@WebServlet("/HelloServlet")//@<--어노테익션으로 주소 매핑 : 매핑해놓은 /HelloServlet 이라고 브라우저에서 요청하면,아래 doGet()또는 doPost가 실행됨.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloServlet() {//기본생성자
        super();
        // TODO Auto-generated constructor stub
    }
	
    //GET 요청이 들어오면 실행될 메서드 : 개발자는 get요청이 들어오면 처리할 내용을 메서드 안에 작성해두기
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//request,resonse 매개변수를 넣어둠
		// TODO Auto-generated method stub
		System.out.println("get 요청함 !!!");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		response.getWriter().append("Served at: helloooooooooooooo ").append(request.getContextPath());//화면에 뿌려지는 글씨
	}
	
	//POST 요청이 들어오면 실행될 메서드 : 개발자는 post요청이 들어오면 처리할 내용을 메서드 안에 작성해두기
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);//doGet 다시 요청 없애고 다른걸 넣어도 된다
	}
	
//	@Override
//	protected void service(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {//서비스로 오버라이딩 해버리면 doGet doPost 사용할수 없다		
//							//reqest, response 내부객체와 동일하게 사용되는 매개변수
//		System.out.println("service 메서드 호출 !!!");
//		
//		/* doGet(reqest,response); 이런식으로 호출하면 sevice 메서드 후 doGet메서드를 호출한다 */
//		
//		//super.service(req, resp); //부모꺼 안쓸거니 주석
//		
//		//웹 브라우저로 전송되어 화면에 출력할 태그들을 메서드를 이용하여 문자열로 토스
//		PrintWriter pw = response.getWriter();
//		
//		pw.println("<html>");
//		pw.println("<head>");
//		pw.println("</head>");
//		pw.println("<body>");
//		pw.println("<h2>Hello servlet!!!</h2>");
//		pw.println("</body>");
//		pw.println("</html>");
//		
//	}
//	
//	
	
	

}
