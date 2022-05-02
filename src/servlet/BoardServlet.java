package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Board;

@WebServlet("/board") // 어떤 경로로 들어오는 요청을 처리할건지 정의
public class BoardServlet extends HttpServlet {
	
	// get, post ===> 웹 통신 method=get, method=post
	// 요청하는 방법
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청을 처리
		// 요청의 한글 인코딩
		// 파라미터를 꺼내 와서
		// Board객체를 만들고
		// request의 attribute에 담아서 boardInfo.jsp로 보내기
		req.setCharacterEncoding("utf-8");
		System.out.println("board 에서 post 요청을 받았습니다.");
		
		Board board = new Board();
		board.setTitle(req.getParameter("title"));
		board.setContent(req.getParameter("content"));
		board.setName(req.getParameter("name"));
		board.setPass(req.getParameter("pass"));
		board.setEmail(req.getParameter("email"));
		board.setCreatedTime(new Date());
		
		// request의 속성에 board 객체를 담아서 보내기
		// session에 담지 않는 이유는
		// 이 요청은 게시글 하나만 생성하면 끝나는 요청
		// 게시글 정보를 계속 session에 유지할 필요가 없으니까
		req.setAttribute("board", board);
		
		req.getRequestDispatcher("boardInfo.jsp").forward(req, resp);
		//foward : 요청을 계속 이어나간다.
	}
	
}
