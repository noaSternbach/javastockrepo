package com.myorg.javacourse;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class NoasServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {//yarin
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
