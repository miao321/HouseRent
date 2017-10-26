package cn.tedu.service;

import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;

public interface HouseService {
	void insert(House house);
	void delete(Integer id);
	void update(House house);	
	House findById(Integer id);
	PageInfo<House> findByPage(PageInfo<House> pageInfo);
	PageInfo<House> findByPage(PageInfo<House> pageInfo,HouseCondition condition);
}
