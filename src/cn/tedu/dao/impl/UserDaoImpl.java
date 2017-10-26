package cn.tedu.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import cn.tedu.dao.HibernateDao;
import cn.tedu.dao.UserDao;
import cn.tedu.entity.House;
import cn.tedu.entity.User;
import cn.tedu.exception.DaoException;
import cn.tedu.exception.ServiceException;
import cn.tedu.util.HibernateUtils;

public class UserDaoImpl extends HibernateDao<User, Integer> implements UserDao {
	
	public User findByName(String name) {		
		try {
			Session session = HibernateUtils.getSession();
			/*Query query = session.createQuery("from User where name=?");
			Query qeury = query.setParameter(0, name);
			User user = (User)query.uniqueResult();*/
			
			Object o = session.createQuery("from User where name=?")
									.setParameter(0, name)
									.uniqueResult();			
			//System.out.println(o.getClass());			
			return (User)o;			
		} catch (HibernateException e) {
			throw e;
		} 
	}	
}
