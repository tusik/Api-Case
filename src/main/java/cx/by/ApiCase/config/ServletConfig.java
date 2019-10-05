package cx.by.ApiCase.config;
/**
 * Project name: ApiCase
 *
 * Reinject Dynamic Servelet
 *
 * Create by: Image
 *
 * Create at: 2019-09-12
 **/


import cx.by.ApiCase.model.Link;
import cx.by.ApiCase.repo.LinkRepo;

import cx.by.ApiCase.servlet.BeanServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.List;


@Component
public class ServletConfig implements ServletContextInitializer {

    @Autowired
    private LinkRepo linkRepo;

    @Override
    /**
    * @description: Loading addition servlet on tomcat context startup
    * @author: Image
    * @params: [servletContext]
    * @returns: void
    * @date: 2019/9/12
    **/
    public void onStartup(ServletContext servletContext)  {
        List<Link> uop = linkRepo.findAll();
        for(Link link : uop) {
            System.out.println(link.getUri());
            ServletRegistration init = servletContext.addServlet(link.getUri(), BeanServlet.class);
            init.setInitParameter("uid", String.valueOf(link.getUid()));
            init.addMapping("/"+link.getUri());

        }

    }
}
