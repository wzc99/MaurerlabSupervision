package sys.spvisor.core.util;

import java.io.Serializable;

/**
 * page 分页对象
 *
 * @copyright {@link 9iu.org}
 * @author dazhou<Auto generate>
 * @version 2013-03-19 11:08:15
 * @see com.dazhou.frame.util.Page
 */
public class Page implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int DEFAULT_PAGE_SIZE = 20;

	/** 页码,从1开始 */
	private int pageIndex;
	/** 每页多少行 */
	private int pageSize = 20;
	/** 数据总行数 */
	private int totalCount = 0;
	/** 总共可以分多少页 */
	private int pageCount;

	/** 是否有上一页 */
	private boolean hasPrev = false;
	/** 是否有下一页 */
	private boolean hasNext = false;

	public Page(int pageIndex, int pageSize, int totalCount) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;

		setTotalCount(totalCount);
		hasPrev = getHasPrev();
		hasNext = getHasNext();
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * 获取当前页页码
	 * 
	 * @return
	 */
	public int getPageIndex() {
		if (pageIndex < 1)
			pageIndex = 1;
		if (pageSize < 1)
			pageSize = DEFAULT_PAGE_SIZE;
		return pageIndex;
	}

	/**
	 * 获取每页多少行
	 * 
	 * @return
	 */
	public int getPageSize() {
		if (pageSize == 0)
			pageSize = DEFAULT_PAGE_SIZE;
		return pageSize;
	}

	/**
	 * 获取总共有多少页
	 * 
	 * @return
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * 获取起始行数
	 * 
	 * @return
	 */
	public int getFirstResult() {
		return (pageIndex - 1) * pageSize;
	}

	/**
	 * 获取总记录数
	 * 
	 * @return
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * 设置总记录数
	 * 
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		pageCount = totalCount / getPageSize() + (totalCount % getPageSize() == 0 ? 0 : 1);
		/*
		 * // 调整页码信息,防止出界 if (totalCount == 0) { if (pageIndex != 1) pageIndex =
		 * 1; } else { if (pageIndex > pageCount) pageIndex = pageCount; }
		 */
	}

	/**
	 * 是否有数据
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return totalCount == 0;
	}

	/**
	 * 设置页面大小
	 * 
	 * @param pageSize
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 是否有上一页
	 * 
	 * @return boolean
	 */
	public boolean getHasPrev() {
		if (getPageIndex() > 1)
			return true;

		return hasPrev;
	}

	/**
	 * 是否有下一页
	 * 
	 * @return boolean
	 */
	public boolean getHasNext() {
		if (pageIndex > (pageCount - 1)) {
			return false;
		}
		return true;
	}

}
