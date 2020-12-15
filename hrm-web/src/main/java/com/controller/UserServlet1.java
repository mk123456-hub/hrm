package com.controller;

import com.service.UserService;
import com.util.SpringIOC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Administrator
 * @create 2020/12/14 0014 22:19
 */
@WebServlet(name = "UserServlet1",urlPatterns = {"/users","/UserServlet"})
public class UserServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService= (UserService) SpringIOC.getCtx().getBean("userService");
        response.getWriter().println(userService.listJson());
    }
}
