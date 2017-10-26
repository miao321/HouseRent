package cn.tedu.dao.impl;

import org.junit.Test;

import cn.tedu.dao.HouseDao;
import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;
import cn.tedu.entity.User;

public class HouseDaoImplTest{
	@Test	
	public void testFindById() { 
		HouseDao houseDao = new HouseDaoImpl();
		House house = houseDao.findById(9);
		//System.out.println(house.getId());
		System.out.println(house.getStreet().getName());
		
	}
	
	@Test	
	public void testFindByPage() {
		HouseDao houseDao = new HouseDaoImpl();
		
		PageInfo<House> pageInfo = new PageInfo<House>();
		pageInfo.setPageIndex(2);
		
		HouseCondition houseCondition = new HouseCondition();
		houseCondition.setTitle("中");
		
		houseDao.findByPage(pageInfo,houseCondition);
		
		System.out.println(pageInfo);
	}
	@Test	
	public void testFindByPage2() {
		HouseDao houseDao = new HouseDaoImpl();
		
		PageInfo<House> pageInfo = new PageInfo<House>();
		pageInfo.setPageIndex(2);		
		
		houseDao.findByPage(pageInfo);
		
		System.out.println(11111111);
		//System.out.println(pageInfo.getPageList().get(0).getType().getName());
	}
}
