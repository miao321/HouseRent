package cn.tedu.entity;

public class HouseCondition {
	private String title;
	private Integer startPrice;
	private Integer endPrice;
	private Integer streetId;
	private Integer typeId;
	private Integer startFloorage;
	private Integer endFloorage;

	public HouseCondition() {
	}

	
	public HouseCondition(String title, Integer startPrice, Integer endPrice,
			Integer streetId, Integer typeId, Integer startFloorage,
			Integer endFloorage) {
		super();
		this.title = title;
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.streetId = streetId;
		this.typeId = typeId;
		this.startFloorage = startFloorage;
		this.endFloorage = endFloorage;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}

	public Integer getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}

	public Integer getStreetId() {
		return streetId;
	}

	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getStartFloorage() {
		return startFloorage;
	}

	public void setStartFloorage(Integer startFloorage) {
		this.startFloorage = startFloorage;
	}

	public Integer getEndFloorage() {
		return endFloorage;
	}

	public void setEndFloorage(Integer endFloorage) {
		this.endFloorage = endFloorage;
	}
	
}
