package cn.tedu.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.tedu.dao.UserDao;
import cn.tedu.entity.User;
import cn.tedu.util.HibernateUtils;

public class HibernateDaoImplTest{
	@Test
	public void testConstructor() {
		System.out.println(new HouseDaoImpl().getEntityClass());
		System.out.println(new UserDaoImpl().getEntityClass());
	}
}
