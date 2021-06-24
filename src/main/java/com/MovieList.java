package com;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MovieList extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String [] movieList = {"movie 1","movie 2","movie 3"};
    request.setAttribute("movieList", movieList);
    request.setAttribute("abc", "def");

    RequestDispatcher view = request.getRequestDispatcher("index.jsp");
    view.forward(request,response);
  }
}