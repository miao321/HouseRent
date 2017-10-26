package cn.tedu.dao;


import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;


public interface HouseDao {
	void insert(House house);
	void delete(Integer id);
	void update(House house);	
	House findById(Integer id);
	PageInfo<House> findByPage(PageInfo<House> pageInfo);
	/**
	 * 根据房屋的搜索条件进行分页查找
	 * @param pageInfo  分页信息
	 * @param condition 搜索条件信息
	 * @return 分页信息
	 */
	PageInfo<House> findByPage(PageInfo<House> pageInfo,HouseCondition condition);
}