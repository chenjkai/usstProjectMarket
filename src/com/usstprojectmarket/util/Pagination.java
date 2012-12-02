package com.usstprojectmarket.util;
/*
 * the class to handle pagination
 */
public class Pagination {
/*currentPage ��ǰҳ
 * pageSize ÿҳ��¼��
 * totalSize �ܼ�¼��
 * totalPage ��ҳ��
 * hasFirst �Ƿ��һҳ
 * hasPrevious �Ƿ�����һҳ
 * hasNext �Ƿ�����һҳ
 * hasLast �Ƿ������һҳ
 * 
 */
	private int currentpage;	
	private int pagesize = 10;
	private int  totalsize;
	private int totalpage;
	

	@SuppressWarnings("unused")
	private boolean hasfirst;
	@SuppressWarnings("unused")
	private boolean hasprevious;
	@SuppressWarnings("unused")
	private boolean hasnext;
	@SuppressWarnings("unused")
	private boolean haslast;
	public Pagination(int currentpage,int totalsize) {
		this.currentpage = currentpage;
		this.totalsize = totalsize;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(int totalsize) {
		this.totalsize = totalsize;
	}
	public int getTotalpage() {
		totalpage = totalsize / pagesize;
		if(totalsize % pagesize != 0)
			totalpage++;
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
//		totalPage = totalSize / pageSize;
//		if(totalSize % pageSize != 0)
//			totalPage++;
		this.totalpage = totalpage;
	}
	public boolean isHasfirst() {
//		System.out.print("****");
		if(currentpage==1) return false;
		return true;
	}
	public void setHasfirst(boolean hasfirst) {
		this.hasfirst = hasfirst;
	}
	public boolean isHasprevious() {
//		System.out.print("****");
		if(isHasfirst()) return true;
		return false;
	}
	public void setHasprevious(boolean hasprevious) {
		this.hasprevious = hasprevious;
	}
	public boolean isHasnext() {
		if(isHaslast()) return true;
		return false;
	}
	public void setHasnext(boolean hasnext) {
		this.hasnext = hasnext;
	}
	public boolean isHaslast() {
		if(currentpage == getTotalpage()) return false;
		return true;
	}
	public void setHaslast(boolean haslast) {
		this.haslast = haslast;
	}
}
