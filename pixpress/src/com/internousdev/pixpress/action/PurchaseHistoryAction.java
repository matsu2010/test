//担当：森本

package com.internousdev.pixpress.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.PurchaseHistoryDAO;
import com.internousdev.pixpress.dto.PurchaseHistoryDTO;
import com.internousdev.pixpress.dto.PurchaseListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private boolean deleteFlg = false;
	private String message;
	public String result;
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	private PurchaseListDTO purchaseListDTO = new PurchaseListDTO();    //日時と金額だけの購入履歴



	private ArrayList<PurchaseHistoryDTO> purchaseHistoryList = new ArrayList<>(); // 全購入履歴
	private ArrayList<PurchaseHistoryDTO> setPurchaseHistoryDTOList = new ArrayList<>(); // 日時ごとの購入履歴
	private ArrayList<List<PurchaseHistoryDTO>> AllsetPurchaseList = new ArrayList<>(); // 全ての日時ごとの購入履歴
	private ArrayList<PurchaseListDTO> purchaseListDTOList = new ArrayList<>();  //



	public String execute() {

		String userId = (session.get("userId").toString());

		if(!deleteFlg) {
			purchaseHistoryList = purchaseHistoryDAO.getPurchaseHistory(userId); // purchaseHistoryListに全情報が入っている
			if(purchaseHistoryList.isEmpty()){
				message = "購入履歴はありません。";
				result = SUCCESS;
			}else{
				String itemDate = purchaseHistoryList.get(0).getRegistDate();
				String deliveryDate = purchaseHistoryList.get(0).getDeliveryDate();
				String deliveryTime = purchaseHistoryList.get(0).getDeliveryTime();
				String userAddress = purchaseHistoryList.get(0).getUserAddress();
				int total = 0;
				int Number = 0;

				for (int i = 0; i < purchaseHistoryList.size(); i++) {
					if (itemDate.equals(purchaseHistoryList.get(i).getRegistDate())) {
						setPurchaseHistoryDTOList.add(purchaseHistoryList.get(i)); // setPurchaseHistoryDTOList（詳細）に同じ時間のpurchaseHistoryListをいれていく
						total += purchaseHistoryList.get(i).getPrice(); // 同時にPrice(小計)をtotalに足していく
					}

					else {  //同じ時間に買った商品がset..に格納され、合計も算出し、時間が変われば、このelese文に
						// 初めの履歴表示用のDTO格納----------------------------------
						purchaseListDTO = new PurchaseListDTO(); // 時間が切り替わった
						purchaseListDTO.setRegistDate(itemDate);  //購入日、小計、リスト番号をDTOにセット
						purchaseListDTO.setTotalPrice(total);
						purchaseListDTO.setAllPurchaseListNumber(Number);
						purchaseListDTO.setDeliveryDate(deliveryDate);
						purchaseListDTO.setDeliveryTime(deliveryTime);
						purchaseListDTO.setUserAddress(userAddress);
						purchaseListDTOList.add(purchaseListDTO);  //配列に格納
						// -----------------------------------------------------
						AllsetPurchaseList.add(setPurchaseHistoryDTOList);
						itemDate = purchaseHistoryList.get(i).getRegistDate();
						deliveryDate = purchaseHistoryList.get(i).getDeliveryDate();
						deliveryTime = purchaseHistoryList.get(i).getDeliveryTime();
						userAddress = purchaseHistoryList.get(i).getUserAddress();
						setPurchaseHistoryDTOList = new ArrayList<>();
						total = 0;
						setPurchaseHistoryDTOList.add(purchaseHistoryList.get(i));
						total += purchaseHistoryList.get(i).getPrice();
						Number++;
					}
				}

				AllsetPurchaseList.add(setPurchaseHistoryDTOList);
				purchaseListDTO = new PurchaseListDTO();
				purchaseListDTO.setRegistDate(itemDate);
				purchaseListDTO.setTotalPrice(total);
				purchaseListDTO.setAllPurchaseListNumber(Number);
				purchaseListDTO.setDeliveryDate(deliveryDate);
				purchaseListDTO.setDeliveryTime(deliveryTime);
				purchaseListDTO.setUserAddress(userAddress);
				purchaseListDTOList.add(purchaseListDTO);
				session.put("purchaseListDTOList", purchaseListDTOList);
				session.put("AllsetPurchaseList", AllsetPurchaseList);

				result= SUCCESS;
				}

			}else {

				int check = purchaseHistoryDAO.deleteHistory(userId);
				if(check == 0){
					result = ERROR;
				}
				else {
						message = "購入履歴はありません。";
						result = SUCCESS;
				}
			}
			return result;
		}




	public ArrayList<PurchaseHistoryDTO> getMyPageList(){
		return this.getMyPageList();
	}


	public Map<String,Object> getSession() {
	    return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public boolean isDeleteFlg() {
	    return deleteFlg;
	}
	public void setDeleteFlg(boolean deleteFlg) {
	    this.deleteFlg = deleteFlg;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}



	public PurchaseHistoryDAO getPurchaseHistoryDAO() {
	    return purchaseHistoryDAO;
	}
	public void setPurchaseHistoryDAO(PurchaseHistoryDAO purchaseHistoryDAO) {
	    this.purchaseHistoryDAO = purchaseHistoryDAO;
	}



	public PurchaseListDTO getPurchaseListDTO() {
	    return purchaseListDTO;
	}
	public void setPurchaseListDTO(PurchaseListDTO purchaseListDTO) {
	    this.purchaseListDTO = purchaseListDTO;
	}



	public ArrayList<PurchaseHistoryDTO> getPurchaseHistoryList() {
	    return purchaseHistoryList;
	}
	public void setPurchaseHistoryList(ArrayList<PurchaseHistoryDTO> purchaseHistoryList) {
	    this.purchaseHistoryList = purchaseHistoryList;
	}


	public ArrayList<PurchaseHistoryDTO> getSetPurchaseHistoryDTOList() {
	    return setPurchaseHistoryDTOList;
	}
	public void setSetPurchaseHistoryDTOList(ArrayList<PurchaseHistoryDTO> setPurchaseHistoryDTOList) {
	    this.setPurchaseHistoryDTOList = setPurchaseHistoryDTOList;
	}



	public ArrayList<List<PurchaseHistoryDTO>> getAllsetPurchaseList() {
	    return AllsetPurchaseList;
	}
	public void setAllsetPurchaseList(ArrayList<List<PurchaseHistoryDTO>> AllsetPurchaseList) {
	    this.AllsetPurchaseList = AllsetPurchaseList;
	}



	public ArrayList<PurchaseListDTO> getPurchaseListDTOList() {
	    return purchaseListDTOList;
	}
	public void setPurchaseListDTOList(ArrayList<PurchaseListDTO> purchaseListDTOList) {
	    this.purchaseListDTOList = purchaseListDTOList;
	}
}