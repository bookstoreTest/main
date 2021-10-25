package com.EVA.bookStore.web;

import com.EVA.bookStore.pojo.User;
import com.EVA.bookStore.service.UserService;
import com.EVA.bookStore.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数,根据标签的name属性获取
        String username  = req.getParameter("username");
        String password = req.getParameter("password");
        //2.调用UserService处理业务
        if (userService.login(new User(null,username,password,null))== null){
            req.getRequestDispatcher("pages/user/login.jsp").forward(req,resp);

        }else {

            req.getRequestDispatcher("pages/user/login_success.jsp").forward(req,resp);
        }
    }
}
