package cx.by.ApiCase.config;

import cx.by.ApiCase.servlet.BeanServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Component
public class ServletConfig implements ServletContextInitializer {
    @Autowired
    private String name;
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration init = servletContext.addServlet("asd", BeanServlet.class);
        init.addMapping("/test/test"+name);
        System.out.println("zzzzzzzzzzzzzzzz"+name);
    }
}
