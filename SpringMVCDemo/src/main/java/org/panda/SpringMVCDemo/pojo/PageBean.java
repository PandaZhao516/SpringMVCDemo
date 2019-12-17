/**

*@description TODO
*@author Panda

 */
package org.panda.SpringMVCDemo.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月4日
 */
public class PageBean<T> implements Serializable {
	
	//当前页
	private int pageCode;
	
	//总页数=总记录数/每页显示的记录数
	private int totalPage;
	
	//总记录数
	private int totalCount;
	
	//每页显示的记录数
	private int pageSize;
	
	//每页显示的数据
	private List<T> beanList;
	
	public PageBean(){
		
	}
	
	public PageBean(int pageCode,int totalPage,int totalCount,int pageSize,List<T> beanList){
		this.pageCode = pageCode;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.beanList = beanList;
	}

	/**
	 * @return the pageCode
	 */
	public int getPageCode() {
		return pageCode;
	}

	/**
	 * @param pageCode the pageCode to set
	 */
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the beanList
	 */
	public List<T> getBeanList() {
		return beanList;
	}

	/**
	 * @param beanList the beanList to set
	 */
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
	
	
}
