package cn.tedu.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import cn.tedu.exception.ServiceException;
import cn.tedu.util.HibernateUtils;

public class OpenSessionInViewFilter implements Filter{

	private static final Logger logger = Logger.getLogger(OpenSessionInViewFilter.class);
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			
			chain.doFilter(request, response);	//继续执行后面的程序
			
		} catch (HibernateException e) {
			logger.error(e);
			throw e;
		} finally {
			if (session != null) {
				HibernateUtils.closeSession();
			}
		}
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
