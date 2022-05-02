package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Board;

@WebServlet("/board") // � ��η� ������ ��û�� ó���Ұ��� ����
public class BoardServlet extends HttpServlet {
	
	// get, post ===> �� ��� method=get, method=post
	// ��û�ϴ� ���
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��û�� ó��
		// ��û�� �ѱ� ���ڵ�
		// �Ķ���͸� ���� �ͼ�
		// Board��ü�� �����
		// request�� attribute�� ��Ƽ� boardInfo.jsp�� ������
		req.setCharacterEncoding("utf-8");
		System.out.println("board ���� post ��û�� �޾ҽ��ϴ�.");
		
		Board board = new Board();
		board.setTitle(req.getParameter("title"));
		board.setContent(req.getParameter("content"));
		board.setName(req.getParameter("name"));
		board.setPass(req.getParameter("pass"));
		board.setEmail(req.getParameter("email"));
		board.setCreatedTime(new Date());
		
		// request�� �Ӽ��� board ��ü�� ��Ƽ� ������
		// session�� ���� �ʴ� ������
		// �� ��û�� �Խñ� �ϳ��� �����ϸ� ������ ��û
		// �Խñ� ������ ��� session�� ������ �ʿ䰡 �����ϱ�
		req.setAttribute("board", board);
		
		req.getRequestDispatcher("boardInfo.jsp").forward(req, resp);
		//foward : ��û�� ��� �̾����.
	}
	
}
