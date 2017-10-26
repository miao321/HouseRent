package cn.tedu.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import cn.tedu.dao.HibernateDao;
import cn.tedu.dao.HouseDao;
import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;
import cn.tedu.entity.User;
import cn.tedu.exception.DaoException;
import cn.tedu.exception.ServiceException;
import cn.tedu.util.HibernateUtils;

public class HouseDaoImpl extends HibernateDao<House,Integer> implements HouseDao {	
	@Override
	public PageInfo<House> findByPage(PageInfo<House> pageInfo ) {
		
		try {
			Session session = HibernateUtils.getSession();
			// 1、总记录数
			Long count = (Long)session.createQuery("select count(*) from House").uniqueResult();
			//2、当前页的所有记录
			String hql = "from House h" +
					" join fetch h.user" +
					" join fetch h.street" +
					" join fetch h.type" +
					" join fetch h.street.district" +
					" order by pubdate asc";
			List<House> list = session.createQuery(hql)
								.setFirstResult(
										(pageInfo.getPageIndex() - 1) * PageInfo.PAGE_SIZE)
								.setMaxResults(PageInfo.PAGE_SIZE)
								.list();			
			//3、设置总记录数，当前页的所有记录和总页数  到  pageInfo对象中
			pageInfo.setCount(count.intValue());
			pageInfo.setPageList(list);
			int totalPages = (int)(count%PageInfo.PAGE_SIZE==0?count/PageInfo.PAGE_SIZE:count/PageInfo.PAGE_SIZE+1);			
			pageInfo.setTotalPages(totalPages);				
			
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	
		return pageInfo;
	}
	public PageInfo<House> findByPage(PageInfo<House> pageInfo,
			HouseCondition condition) {
		StringBuilder sb = new StringBuilder("from House where 1=1");
		if (null != condition.getTitle())
			sb.append(" and title like :title");
			condition.setTitle("%" + condition.getTitle() + "%");
		if (null != condition.getStartPrice())
			sb.append(" and price>:startPrice");
		if (null != condition.getEndPrice())
			sb.append(" and price<:endPrice");
		if (null != condition.getStreetId()) {
			sb.append(" and street.id=:streetId");
		}
		if (null != condition.getTypeId()) {
			sb.append(" and type.id=:typeId");
		}
		if (null != condition.getStartFloorage()) {
			sb.append(" and floorage>:startFloorage");
		}
		if (null != condition.getEndFloorage()) {
			sb.append(" and floorage<:endFloorage");
		}
		try {

			String hql = sb.toString();

			Session session = HibernateUtils.getSession();
			// 1、总条数
			Long count = (Long)session.createQuery("select count(*) " + hql)
					.setProperties(condition).uniqueResult();
			
			// 2、当前页得到的条数
			//假设一共有6条(count), 每页显示2条(PAGE_SIZE)，第pageIndex页。
			//第1页 ：0, 						2
			//第2页 ：2, 						2
			//第3页 ：4, 						2
			//第pageIndex页 ：(pageIndex-1)*2,2
			
			List<House> list = session.createQuery(hql + " order by pubDate desc")
								.setProperties(condition)
								.setFirstResult(
										(pageInfo.getPageIndex() - 1) * PageInfo.PAGE_SIZE)
								.setMaxResults(PageInfo.PAGE_SIZE)
								.list();			
			
			pageInfo.setCount(count.intValue());
			pageInfo.setPageList(list);
			int totalPages = (int)(count%PageInfo.PAGE_SIZE==0?count/PageInfo.PAGE_SIZE:count/PageInfo.PAGE_SIZE+1);			
			pageInfo.setTotalPages(totalPages);				
			
		} catch (HibernateException e) {			
			throw e;
		}

		return pageInfo;
	}


}
