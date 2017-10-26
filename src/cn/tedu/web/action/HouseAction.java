package cn.tedu.web.action;

import java.util.List;

import cn.tedu.entity.House;
import cn.tedu.entity.HouseCondition;
import cn.tedu.entity.PageInfo;
import cn.tedu.service.HouseService;
import cn.tedu.service.impl.HouseServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class HouseAction extends ActionSupport{		
	private PageInfo<House> pageInfo;
	private int pageIndex = 1;
	
	private String title;
	private String price;
	private String street_id;
	private String type_id;
	private String floorage;	
	private int id;
	
	private House house;
	
	private HouseService houseService = new HouseServiceImpl();
	
	public String list() {
		//1、接受参数
		//2、简单校验		
		//3、调用业务层	
		pageInfo = new PageInfo<House>();
		pageInfo.setPageIndex(pageIndex);
		houseService.findByPage(pageInfo);
		
		//4、返回结果
		return "success";
	}

	public String search() {
/*		
		//页面传过来的数据
		private String title;
		private String price;
		private String street_id;
		private String type_id;
		private String floorage;
		
		//需要封装的数据 
		private String title;
		private Integer startPrice;
		private Integer endPrice;
		private Integer streetId;
		private Integer typeId;
		private Integer startFloorage;
		private Integer endFloorage;*/
		
		HouseCondition condition = new HouseCondition();
		houseService.findByPage(pageInfo, condition);
		return "success";
	}
	public String detail() {
		house = houseService.findById(id);
		return "success";
	}
	public PageInfo<House> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<House> pageInfo) {
		this.pageInfo = pageInfo;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStreet_id() {
		return street_id;
	}

	public void setStreet_id(String streetId) {
		street_id = streetId;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String typeId) {
		type_id = typeId;
	}

	public String getFloorage() {
		return floorage;
	}

	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public HouseService getHouseService() {
		return houseService;
	}

	public void setHouseService(HouseService houseService) {
		this.houseService = houseService;
	}
	
	
}
