

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHellloWorld
 */
@WebServlet("/MyHellloWorld")
public class MyHellloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHellloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html");
		response.setContentType("text/html; charset=UTF-8"); //寫在一起
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>This is my first HelloWorld Servlet Sample</h1>");
		out.println("<h1>This is my first HelloWorld Servlet Sample</h1>");
		out.println("</html></body>");
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
