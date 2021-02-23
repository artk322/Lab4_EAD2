package com.urlrewrite;

import java.io.*;
import javax.servlet.http.*;

public class UrlRewtrite2 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      String n = request.getParameter("uname");
      out.print("Hello " + n);

      out.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}