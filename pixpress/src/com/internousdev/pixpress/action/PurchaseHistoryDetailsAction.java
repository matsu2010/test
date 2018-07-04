package com.internousdev.pixpress.action;  //森本

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.PurchaseHistoryDAO;
import com.internousdev.pixpress.dto.PurchaseHistoryDTO;
import com.internousdev.pixpress.dto.PurchaseHistoryDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;


public class PurchaseHistoryDetailsAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	public PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();

	private int listNumber;
	private ArrayList<PurchaseHistoryDetailsDTO> detailsList = new ArrayList<>();
	private int allPurchaseListNumber;
	private int productId;

@SuppressWarnings("unchecked")
public String execute(){

	ArrayList<ArrayList<PurchaseHistoryDTO>> AllsetPurchaseList = new ArrayList<>();

	AllsetPurchaseList = (ArrayList<ArrayList<PurchaseHistoryDTO>>)  session.get("AllsetPurchaseList");

	for(int i=0 ; i< AllsetPurchaseList.get(allPurchaseListNumber).size(); i++){  //#session.AllsetPurchaseListのallPurchaseListNumberが飛んでくる

		int id = AllsetPurchaseList.get(allPurchaseListNumber).get(i).getPurchaseHistoryId();
		purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();
		purchaseHistoryDetailsDTO = purchaseHistoryDAO.getPurchaseHistoryDetails(id);
		detailsList.add(purchaseHistoryDetailsDTO);
	}

	System.out.println(productId);

	session.put("detailsList", detailsList);

	return SUCCESS;
}



public Map<String,Object> getSession() {
    return session;
}
public void setSession(Map<String,Object> session) {
    this.session = session;
}



public PurchaseHistoryDAO getPurchaseHistoryDAO() {
    return purchaseHistoryDAO;
}
public void setPurchaseHistoryDAO(PurchaseHistoryDAO purchaseHistoryDAO) {
    this.purchaseHistoryDAO = purchaseHistoryDAO;
}



public PurchaseHistoryDetailsDTO getPurchaseHistoryDetailsDTO() {
    return purchaseHistoryDetailsDTO;
}
public void setPurchaseHistoryDetailsDTO(PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO) {
    this.purchaseHistoryDetailsDTO = purchaseHistoryDetailsDTO;
}




public ArrayList<PurchaseHistoryDetailsDTO> getDetailsList() {
    return detailsList;
}
public void setDetailsList(ArrayList<PurchaseHistoryDetailsDTO> detailsList) {
    this.detailsList = detailsList;
}



public int getAllPurchaseListNumber() {
    return allPurchaseListNumber;
}
public void setAllPurchaseListNumber(int allPurchaseListNumber) {
    this.allPurchaseListNumber = allPurchaseListNumber;
}


public int getListNumber() {
	return listNumber;
}

public void setListNumber(int listNumber) {
	this.listNumber = listNumber;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

}