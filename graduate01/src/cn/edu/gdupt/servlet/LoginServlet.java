package cn.edu.gdupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * android登录
 * 2013-3-5
 * @author wangjj
 *
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String succesString = "successing";
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(succesString);
		printWriter.close();
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String succesString = "successing";
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(succesString);
		printWriter.close();
		
		super.doPost(req, resp);
	}

		
}
