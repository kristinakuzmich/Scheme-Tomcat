package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(name = "HelloWithName", urlPatterns = "/hello_with_name")
public class HelloWithName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("firstName");
        String last = req.getParameter("lastName");

        System.out.println("firstName: " + name);
        System.out.println("lastName: " + last);
    }
}
