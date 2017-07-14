package com.servlet;

import com.sun.jmx.snmp.Enumerated;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import static java.awt.Color.red;

/**
 * Created by gadalaya on 7/14/2017.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("btn");
        PrintWriter out = response.getWriter();
        Enumeration<String> e1=request.getParameterNames();int i =0;
        out.println("<table border=2><tr><td>Param Name></td><td>Value</td></tr>");
        while(e1.hasMoreElements())
        {
            if(i %2 == 0)
            {i++;
                out.println("<tr style='background-color:red;'><td>" +  e1.nextElement()+"</td>");
                out.println("<td>"+request.getParameter(e1.nextElement())+"</td></tr>");
            }
            else
            {i++;
                out.println("<tr><td>" +  e1.nextElement()+"</td>");
                out.println("<td>"+request.getParameter(e1.nextElement())+"</td></tr>");
            }


        }

   //   out.println("This is first srvlet with get"+(Integer.parseInt(request.getParameter("txt1"))+Integer.parseInt(request.getParameter("txt1")));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
     //   out.println("This is first srvlet with gettt:: "+request.getParameter("txt1"));
    }
}
