package cn.tedu.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.tedu.dao.UserDao;
import cn.tedu.entity.User;
import cn.tedu.util.HibernateUtils;

public class UserDaoImplTest{
	@Test
	public void testFindByName() {
		UserDao userDao = new UserDaoImpl();
		User user = userDao.findByName("test1");
		System.out.println(user);
	}
	
	@Test
	public void testInsert() {
		UserDao userDao = new UserDaoImpl();
		User user = new User(1006, "test6", "123", null,null,null);
		
		Session session = null;
		Transaction tx = null;		
		try {
			session = HibernateUtils.getSession();
			tx = session.beginTransaction();
			userDao.insert(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) try {session.close();}catch(HibernateException e) {e.printStackTrace();};
		}
	}
}
