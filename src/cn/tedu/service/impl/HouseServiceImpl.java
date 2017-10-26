package cn.tedu.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import cn.tedu.dao.HouseDao;
import cn.tedu.dao.impl.HouseDaoImpl;
import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;
import cn.tedu.exception.ServiceException;
import cn.tedu.service.HouseService;
import cn.tedu.util.HibernateUtils;

public class HouseServiceImpl implements HouseService {
	private static final Logger logger = Logger.getLogger(HouseServiceImpl.class);
	private HouseDao houseDao = new HouseDaoImpl();
	
	public void insert(House house) {
		try {			
			houseDao.insert(house);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}
	public void delete(Integer id) {
		try {
			houseDao.delete(id);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}
	public void update(House house) {
		try {
			houseDao.update(house);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}
	public House findById(Integer id) {		
		try {
			return houseDao.findById(id);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	public PageInfo<House> findByPage(PageInfo<House> pageInfo) {		
		
		try {			
			return houseDao.findByPage(pageInfo);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		} 
	}

	public PageInfo<House> findByPage(PageInfo<House> pageInfo,
			HouseCondition condition) {
		try {
			return houseDao.findByPage(pageInfo,condition);
		} catch (HibernateException e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

}
