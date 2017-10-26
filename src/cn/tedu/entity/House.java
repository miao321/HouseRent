package cn.tedu.entity;



import java.util.Date;

public class House{
	private Integer id;	//oid
	private String title;
	private String description;
	private Integer price;
	private Date pubdate;
	private Short floorage;
	private String contact;

	private User user;
	private Type type;
	private Street street;
	
	public House() {
		super();
	}
	public House(Integer id, User user, Type type, Street street, String title,
			String description, Integer price, Date pubdate, Short floorage,
			String contact) {
		super();
		this.id = id;
		this.user = user;
		this.type = type;
		this.street = street;
		this.title = title;
		this.description = description;
		this.price = price;
		this.pubdate = pubdate;
		this.floorage = floorage;
		this.contact = contact;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public Short getFloorage() {
		return floorage;
	}
	public void setFloorage(Short floorage) {
		this.floorage = floorage;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "House [contact=" + contact + ", description=" + description
				+ ", floorage=" + floorage + ", id=" + id + ", price=" + price
				+ ", pubdate=" + pubdate + ", street=" + street + ", title="
				+ title + ", type=" + type + ", user=" + user + "]";
	}
	
	
		
}