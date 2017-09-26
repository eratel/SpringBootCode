package com.example.demo.servert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 20:24 2017/9/14 0014
 */
@WebServlet("/myservert2")
public class Myservert2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.print("hello servert2");
        writer.flush();
        writer.close();
    }
}
