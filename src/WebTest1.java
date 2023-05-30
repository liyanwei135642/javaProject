import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(urlPatterns = "/test1")
//@WebServlet({"/test1/*","/123"})
public class WebTest1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        System.out.println(req.getMethod());
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getQueryString());
        System.out.println(req.getRemoteAddr());
        System.out.println(req.getRemoteUser());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getRemotePort());
        System.out.println(req.getProtocol());
        System.out.println("------------------------");
        System.out.println(req.getRemoteHost());
//        Enumeration<String> names= req.getHeaderNames();
//        while(names.hasMoreElements())
//        {
//            String name=names.nextElement();
//            String value=req.getHeader(name);
//            System.out.println(name+":"+value);
//        }
        String ref=req.getHeader("referer");
        System.out.println(ref);
        System.out.println(req.getServerPort());
//        System.out.println(req.getCookies());
        System.out.println(req.getSession());
        System.out.println(req.getRequestedSessionId());
        System.out.println(req.getServerPort());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        req.setAttribute("age",18);
        int age=(int)req.getAttribute("age");
        System.out.println("age:"+age);
//        ÇëÇó×ª·¢
        req.getRequestDispatcher("/test2").forward(req,resp);




    }
}
