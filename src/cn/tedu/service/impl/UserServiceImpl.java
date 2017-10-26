package cn.tedu.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;

import cn.tedu.dao.UserDao;
import cn.tedu.dao.impl.UserDaoImpl;
import cn.tedu.entity.User;
import cn.tedu.exception.DaoException;
import cn.tedu.exception.ServiceException;
import cn.tedu.service.UserService;
import cn.tedu.util.HibernateUtils;

public class UserServiceImpl implements UserService {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	public void register(User user) {			
		UserDao userDao = new UserDaoImpl();	
		User user2 = null;
		
		Transaction tx = null;
		Session session = null;
		try {	
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			
			try {			
				user2 = userDao.findByName(user.getName());			
			} catch (HibernateException e) {	
				logger.error(e);
				throw new ServiceException("数据库繁忙！");
			}
			//用户名重复，返回假
			if (user2 != null) {
				throw new ServiceException("用户名重复！");
			}
			//插入用户
			try{				
				userDao.insert(user);	
			} catch (HibernateException e) {	
				logger.error(e);
				throw new ServiceException("数据库繁忙！");
			} 
			
			tx.commit();
		} catch(ServiceException e) {
			if (tx != null) tx.rollback();
			throw e;
		} 
	}
	
	public void login(String name,String password) {	
			
			UserDao userDao = new UserDaoImpl();	
			User user = null;
			
			try {
				user = userDao.findByName(name);					
			}catch(HibernateException e) {
				e.printStackTrace();//记录
				throw new ServiceException("数据库的出问题");
			}
			
			if (user == null) {
				throw new ServiceException("没有该用户名");
		  	}

			if (!user.getPassword().equals(password)) {
				throw new ServiceException("密码不正确");
		  	}
		}

}
