package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dto.PaginationDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class MasterPaginationAction extends ActionSupport implements SessionAware{
	
	private String pageNo;
	private int type;
	public ArrayList<ProductListDTO> productList = new ArrayList<>();
	public Map<String,Object> session;
	
	public String execute() throws SQLException{
		String result = ERROR;
		if(type==1) {
			result = "change";
		}
		if(type==2) {
			result = "delete";
		}
		
		ProductListDAO productListDAO = new ProductListDAO();
		
		productList = productListDAO.getProductInfo();
		session.put("productList", productList);
		

		
		if(!(productList==null)) {
			Pagination pagination = new Pagination();
			PaginationDTO paginationDTO = new PaginationDTO();
			if(pageNo==null || pageNo.equals("1")) {
				paginationDTO = pagination.initialize(productList, 9);

				session.put("totalPageSize", paginationDTO.getTotalPageSize());
				session.put("currentPageNumber", paginationDTO.getCurrentPageNo());
				session.put("totalRecordSize", paginationDTO.getTotalPageSize());
				session.put("startRecordNo", paginationDTO.getStartRecordNo());
				session.put("endRecordNo", paginationDTO.getEndRecordNo());
				session.put("pageNumberList", paginationDTO.getPageNumberList());
				session.put("productList", paginationDTO.getCurrentProductInfoPage());
				session.put("hasNextPage", paginationDTO.getHasNextPage());
				session.put("hasPreviousPage", paginationDTO.getHasPreviousPage());
				session.put("nextPageNo", paginationDTO.getNextPageNo());
				session.put("previousPageNo", paginationDTO.getPreviousPageNo());
			}else {
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
				}
			}else {
				session.put("productList", null);
			}
		return result;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public ArrayList<ProductListDTO> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<ProductListDTO> productList) {
		this.productList = productList;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}



}
