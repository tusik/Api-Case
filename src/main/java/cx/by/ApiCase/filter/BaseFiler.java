package cx.by.ApiCase.filter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Order(0)
@Component
@WebFilter(filterName = "testFilter1", urlPatterns = "/*")
public class BaseFiler implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String uri = ((HttpServletRequest)servletRequest).getRequestURI();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(uri);
    }
}
