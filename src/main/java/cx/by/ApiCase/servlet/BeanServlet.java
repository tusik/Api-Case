package cx.by.ApiCase.servlet;

import org.springframework.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class BeanServlet extends HttpServlet {
    private String name;
    private String address;
    private HttpStatus status;
    private String contentType;
    private String returnType;
    private String message;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        resp.setHeader("content-type", contentType);

    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
