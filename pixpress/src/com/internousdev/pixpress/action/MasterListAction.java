package com.internousdev.pixpress.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dto.PaginationDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class MasterListAction extends ActionSupport implements SessionAware{


	private int count;
	private String pageNo;
	public List<ProductListDTO> productList;
	public Map<String,Object> session;
	public String execute() {
		String result = SUCCESS;

		ProductListDAO productListDAO = new ProductListDAO();

		productList = productListDAO.getProductInfo();
		session.put("productList", productList);
		
		if(!(productList==null)) {
			Pagination pagination = new Pagination();
			PaginationDTO paginationDTO = new PaginationDTO();
			
				paginationDTO = pagination.getPage(productList, 9, pageNo);

				session.put("productList", paginationDTO.getCurrentProductInfoPage());
				session.put("totalPageSize", paginationDTO.getTotalPageSize());
				session.put("currentPageNo", paginationDTO.getCurrentPageNo());
				session.put("totalRecordSize", paginationDTO.getTotalRecordSize());
				session.put("startRecordNo", paginationDTO.getStartRecordNo());
				session.put("endRecordNo", paginationDTO.getEndRecordNo());
				session.put("previousPage", paginationDTO.getHasPreviousPage());
				session.put("previousPageNo", paginationDTO.getPreviousPageNo());
				session.put("nextPage", paginationDTO.getHasNextPage());
				session.put("nextPageNo", paginationDTO.getNextPageNo());
			}else {
				session.put("productList", null);
			}

		return result;

	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<ProductListDTO> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductListDTO> productList) {
		this.productList = productList;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}



}
