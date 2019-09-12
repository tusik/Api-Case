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

import cx.by.ApiCase.jpa.repo.URIRepository;
import cx.by.ApiCase.jpa.repo.UserRepository;
import cx.by.ApiCase.model.URI;
import cx.by.ApiCase.servlet.BeanServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.List;
import java.util.Optional;

@Component
public class ServletConfig implements ServletContextInitializer {

    @Autowired
    private URIRepository uriRepository;

    @Override
    /**
    * @description: Loading addition servlet on tomcat context startup
    * @author: Image
    * @params: [servletContext]
    * @returns: void
    * @date: 2019/9/12
    **/
    public void onStartup(ServletContext servletContext)  {
        List<URI> uop = uriRepository.findAll();
        for(URI uri : uop){
            System.out.println(uri.getAddress());
            ServletRegistration init = servletContext.addServlet(uri.getName(), BeanServlet.class);
            init.setInitParameter("uid", String.valueOf(uri.getUid()));
            init.setInitParameter("address",uri.getAddress());
            init.setInitParameter("code", String.valueOf(uri.getScode()));
            init.setInitParameter("name",uri.getName());
            init.setInitParameter("contenttype",uri.getContentType());
            init.setInitParameter("returntype", String.valueOf(uri.getReturnType()));
            init.addMapping(uri.getAddress());
        }

    }
}
