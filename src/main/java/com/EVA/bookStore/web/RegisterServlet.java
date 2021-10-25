package com.EVA.bookStore.web;

import com.EVA.bookStore.pojo.User;
import com.EVA.bookStore.service.UserService;
import com.EVA.bookStore.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    /**
     * Get请求会导致用户的账号和密码显示在浏览器的地址栏上，不安全
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数,根据标签的name属性获取
        String username  = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        //2.调用UserService处理业务
        // 对比验证码。注意：若在前端校验，用户若在浏览器中修改代码，可以绕过验证码校验，产生安全隐患
        //因此，验证码在后端校验
        if("abcd".equalsIgnoreCase(code)){
            //2.2检查用户名是否可用
            if(userService.existsUsername(username)==false){
                //可以注册
               userService.registerUser(new User(null,username,password,email));
               req.getRequestDispatcher("pages/user/regist_success.jsp").forward(req,resp);

            }else {
                //跳回注册页面
                req.getRequestDispatcher("pages/user/regist.jsp").forward(req,resp);
            }

        }else {
            //跳回注册页面
            req.getRequestDispatcher("pages/user/regist.jsp").forward(req,resp);
        }
    }
}
