package cn.tedu.entity;

import java.util.List;

public class PageInfo<T> {
	private List<T> pageList;    //该页所有数据
	private int count;      //总记录数
	private int totalPages; //总页数
	private int pageIndex;        //当前页
	public final static int PAGE_SIZE = 2;   //常量：每页显示条数	
	
	public PageInfo(){}
	
	public PageInfo(List<T> pageList, int count, int totalPages, int pageIndex) {
		super();
		this.pageList = pageList;
		this.count = count;
		this.totalPages = totalPages;
		this.pageIndex = pageIndex;
	}
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public static int getPageSize() {
		return PAGE_SIZE;
	}

	@Override
	public String toString() {
		return "PageInfo [count=" + count + ", pageIndex=" + pageIndex
				+ ", pageList=" + pageList + ", totalPages=" + totalPages + "]";
	}
	
	
	
}
