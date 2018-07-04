package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dao.ProductSearchDAO;
import com.internousdev.pixpress.dto.PaginationDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.Pagination;
import com.internousdev.pixpress.util.StringHandle;

/*
 * @author yazaki
 */

import com.opensymphony.xwork2.ActionSupport;

public class ProductSearchAction extends ActionSupport implements SessionAware{

	private int categoryId;
	private String searchWord;
	private String searchWordKana;
	private String[] searchWords;
	private String[] keywords;
	private String pageNo;
	private int searchProducts;
	private ArrayList<String> messageList = new ArrayList<String>();
	private Map<String, Object> session;
	private ProductSearchDAO dao = new ProductSearchDAO();
	public ArrayList<ProductListDTO> productList = new ArrayList<>();
	private ProductListDAO productListDAO = new ProductListDAO();

	public String execute() throws SQLException{

		StringHandle sh = new StringHandle();
		session.remove("productList");

		String result = ERROR;


	if(searchProducts ==1) {
		if(searchWord.length() > 16){
			messageList.add("16文字以内で検索してください！");
			result = SUCCESS;
			return result;
		}else{
			messageList.add(searchWord);
		}

		// 検索値を適切な値に加工
		searchWordKana = Normalizer.normalize(searchWord,  Normalizer.Form.NFKC);

		searchWordKana = sh.toHiragana(searchWordKana);

		searchWordKana = searchWordKana.trim();

		if (searchWordKana.matches("^[\\p{Punct}]+$")) {
			messageList.add("一般的な検索ワードを使ってください");
			result = SUCCESS;
			return result;
		}

		// 検索値が複数あった場合
		int space = searchWordKana.indexOf(" ");

		if(space > 0){
			keywords = searchWord.replace("　", " ").split("[\\s]+");
			searchWords = searchWordKana.replace("　", " ").split("[\\s]+");
		}

		// 検索
		//カテゴリー選択なしの場合
		if (categoryId == 1) {
			if(!(searchWord.isEmpty())){
				//検索ワードを入力した場合
				if(space > 0){
					//検索ワードが複数あった場合
					productList = dao.multiple(searchWords, keywords, categoryId);
				}else{
					//検索ワードが一つだった場合
					productList = dao.bySearchWord(searchWord, searchWordKana, categoryId);
					}
			}else{
				//検索ワードを入力しなかった場合
				productList = productListDAO.getProductInfo();
			}
			result = SUCCESS;

		}else if(categoryId > 1 && categoryId < 9){
			//「全てのカテゴリー」以外を選択した場合
			if(!(searchWord.isEmpty())){
				//検索ワードを入力した場合
				if(space > 0){
					//検索ワードが複数あった場合
					productList = dao.multiple(searchWords, keywords, categoryId);
				}else{
					//検索ワードが一つだった場合
					productList = dao.bySearchWord(searchWord, searchWordKana, categoryId);
				}
			}else{
				//検索ワードを入力しなかった場合
				productList = dao.byProductCategory(categoryId);

			}

			result = SUCCESS;

		}else{
			categoryId = 1;
			productList = dao.byProductCategory(categoryId);

		}

	}else{
			ProductListDAO productListDAO = new ProductListDAO();

			productList = productListDAO.getProductInfo();
		}

	if(productList == null) {
		return ERROR;
	}


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

	public ProductSearchDAO getDao() {
		return dao;
	}

	public void setDao(ProductSearchDAO dao) {
		this.dao = dao;
	}

	public List<ProductListDTO> getDto() {
		return productList;
	}

	public void setDto(ArrayList<ProductListDTO> dto) {
		this.productList = dto;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String[] getSearchWords() {
		return searchWords;
	}

	public void setSearchWords(String[] searchWords) {
		this.searchWords = searchWords;
	}

	public String getSearchWordKana() {
		return searchWordKana;
	}

	public void setSearchWordKana(String searchWordKana) {
		this.searchWordKana = searchWordKana;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public ArrayList<String> getMessageList() {
		return messageList;
	}

	public void setMessageList(ArrayList<String> messageList) {
		this.messageList = messageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public int getSearchProducts() {
		return searchProducts;
	}

	public void setSearchProducts(int searchProducts) {
		this.searchProducts = searchProducts;
	}



}
