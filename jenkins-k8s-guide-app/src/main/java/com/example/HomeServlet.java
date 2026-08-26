package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Jenkins K8s Tutorial</title></head>");
        out.println("<body style='font-family: Arial, sans-serif; text-align: center; margin-top: 50px;'>");
        out.println("<h1 style='color: #4CAF50;'>🚀 Hello from Jenkins & Kubernetes!</h1>");
        out.println("<p>Your Maven Web App has been successfully built and deployed via Jenkins CI/CD.</p>");
        out.println("</body></html>");
    }
}
