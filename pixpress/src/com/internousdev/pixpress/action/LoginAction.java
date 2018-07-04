package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.AddressDAO;
import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dao.LoginDAO;
import com.internousdev.pixpress.dao.MCategoryDAO;
import com.internousdev.pixpress.dto.AddressDTO;
import com.internousdev.pixpress.dto.CartDTO;
import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.dto.MCategoryDTO;
import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private String userId;
	private String password;
	private boolean saveLogin;
	private int totalPrice;
	private int settlement;
	private ArrayList<String> errorMessageList = new ArrayList<>();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private LoginDAO dao = new LoginDAO();
	private LoginDTO dto = new LoginDTO();
	private String idErrorMessage;
	private String passwordErrorMessage;
	private Object userIdErrorMsg;
	private Object passwordErrorMsg;
	private String LoginpasswordErrorMessage;
	private String result;
	private List<MCategoryDTO> masterCategoryDTOList = new ArrayList<MCategoryDTO>();



	public String execute() throws SQLException{
		 result = ERROR;


		if(!(session.containsKey("tempUserId"))){
			return "start";
		}else{

		// ID保持
		if(dto != null){
			if(saveLogin){
				session.put("saveId", userId);
			}else{
				session.remove("saveId");
			}
		}

		// ログイン判定
		/*if(userId.equals("")){ //userIdが空欄
			idErrorMessage = ("【ユーザーIDを入力してください】");
		}else if(userId.length()>8){ //userIdの長さが1以下か8以上のとき
			idErrorMessage = ("【ユーザーIDは1文字以上8文字以下で入力してください】");
		}else if(!userId.matches("^[a-zA-Z0-9]+$")){ //userIdに英数字以外が含まれているとき
			idErrorMessage = ("【ユーザーIDは半角英数字で入力してください】");
		}
		System.out.println(idErrorMessage);

		if(password.equals("")){ //passwordが空欄
			passwordErrorMessage = ("【パスワードを入力してください】");
		}else if(password.length()<1 || password.length()>16){ //passwordの長さが1以下か8以上のとき
			passwordErrorMessage = ("【パスワードは1文字以上16文字以下で入力してください】");
		}else if(!password.matches("^[a-zA-Z0-9]+$")){ //passwordに英数字以外が含まれているとき
			passwordErrorMessage = ("【パスワードは半角英数字で入力してください】");
		}*/

		userIdErrorMsg = InputChecker.userIdChk(userId);
		passwordErrorMsg = InputChecker.passwordChk(password);


		if(userIdErrorMsg != null || passwordErrorMsg != null){
			result= ERROR;
			}else{
				dto = dao.getUserInfo(userId, password);
				session.put("userId", dto.getId());

				if(!(userId.equals(dto.getUserId()) && password.equals(dto.getPassword()))){
					LoginpasswordErrorMessage=("パスワードが違います");
					result = ERROR;
					return result;
				}



				if((userId.equals("admin") && password.equals("admin")) ||
					(userId.equals("admin2") && password.equals("admin2")) ||
					(userId.equals("admin3") && password.equals("admin3")) ||
					(userId.equals("admin4") && password.equals("admin4")) ||
					(userId.equals("admin5") && password.equals("admin5")) ||
					(userId.equals("admin6") && password.equals("admin6")) ||
					(userId.equals("admin7") && password.equals("admin7")) ||
					(userId.equals("admin8") && password.equals("admin8")) ||
					(userId.equals("admin9") && password.equals("admin9")) ||
					(userId.equals("admin10") && password.equals("admin10")) ||
					(userId.equals("admin11") && password.equals("admin11")) ||
					(userId.equals("admin12") && password.equals("admin12"))){

					session.put("masterId", userId);
					session.put("loginFlg", true);
					session.put("masterFlg", true);

					MCategoryDAO mCategoryDAO = new MCategoryDAO();
					masterCategoryDTOList = mCategoryDAO.getMasterCategoryList();
					session.put("masterCategoryDTOList", masterCategoryDTOList);

				result = "master";
				return result;

				// 登録ユーザーでログイン
				}else{
					if(userId.equals(dto.getUserId()) && password.equals(dto.getPassword())){
						result = SUCCESS;

						session.put("userId", dto.getUserId());
						session.put("loginFlg", true);

						// カート情報の引渡し
						CartDAO cartDAO = new CartDAO();
						AddressDAO addressDAO = new AddressDAO();
						ArrayList<CartDTO> tempCartList = new ArrayList<CartDTO>();
						List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
						ArrayList<Integer> productIdList = new ArrayList<Integer>();
						ArrayList<Integer> tempProductIdList = new ArrayList<Integer>();

						if(cartDAO.getUserCartInfo(session.get("tempUserId").toString()) != null){
							tempCartList = cartDAO.getGuestCartInfo(session.get("tempUserId").toString());

							cartList = cartDAO.getUserCartInfo(session.get("userId").toString());

							for(int i = 0; i < cartList.size(); i++){
								productIdList.add(cartList.get(i).getProductId());
							}

							for(int i = 0; i < tempCartList.size(); i++){
								tempProductIdList.add(tempCartList.get(i).getProductId());
							}

							if(cartList.size() < tempCartList.size()){
								for(int i = 0; i < productIdList.size(); i++){
									boolean exist = tempProductIdList.contains(productIdList.get(i));

									if(exist){
										cartDAO.deleteSeparate(session.get("tempUserId").toString(),Integer.valueOf(productIdList.get(i)));

									}else{
										cartDAO.changeUserId(session.get("tempUserId").toString(), session.get("userId").toString());
									}
								}
							}else{
								for(int i = 0; i < tempProductIdList.size(); i++){
									boolean exist = productIdList.contains(tempProductIdList.get(i));

									if(exist){
										cartDAO.deleteSeparate(session.get("tempUserId").toString(),Integer.valueOf(tempProductIdList.get(i)));

									}else{
										cartDAO.changeUserId(session.get("tempUserId").toString(), session.get("userId").toString());
									}
								}
							}

							cartDAO.changeUserId(session.get("tempUserId").toString(), session.get("userId").toString());

							addressDTOList = addressDAO.getAddress(session.get("userId").toString());

							cartList = cartDAO.getUserCartInfo(session.get("userId").toString());

							totalPrice = calcTotalPrice(cartList);

							session.put("addressDTOList", addressDTOList);
							session.put("cartList",cartList);
							totalPrice = calcTotalPrice(cartList);
							session.put("totalPrice", totalPrice);


							result= SUCCESS;

							if(session.containsKey("payFlg")){

								result="pay";
								session.remove("payFlg");
							}

						}

						session.put("cartListSize", cartList.size());
					}
				}
			}
		}
		return result;
	}



	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSaveLogin() {
		return saveLogin;
	}

	public void setSaveLogin(boolean saveLogin) {
		this.saveLogin = saveLogin;
	}

	public int calcTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;

		for(CartDTO dto: cartList){

			totalPrice += dto.getPrice() * dto.getProductCount();
		}
		return totalPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getSettlement() {
		return settlement;
	}

	public void setSettlement(int settlement) {
		this.settlement = settlement;
	}

	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public LoginDAO getDao() {
		return dao;
	}

	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}

	public LoginDTO getDto() {
		return dto;
	}

	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}



	public String getIdErrorMessage() {
		return idErrorMessage;
	}



	public void setIdErrorMessage(String idErrorMessage) {
		this.idErrorMessage = idErrorMessage;
	}



	public String getPasswordErrorMessage() {
		return passwordErrorMessage;
	}



	public void setPasswordErrorMessage(String passwordErrorMessage) {
		this.passwordErrorMessage = passwordErrorMessage;
	}



	public Object getUserIdErrorMsg() {
		return userIdErrorMsg;
	}



	public void setUserIdErrorMsg(Object userIdErrorMsg) {
		this.userIdErrorMsg = userIdErrorMsg;
	}



	public Object getPasswordErrorMsg() {
		return passwordErrorMsg;
	}



	public void setPasswordErrorMsg(Object passwordErrorMsg) {
		this.passwordErrorMsg = passwordErrorMsg;
	}



	public String getLoginpasswordErrorMessage() {
		return LoginpasswordErrorMessage;
	}



	public void setLoginpasswordErrorMessage(String loginpasswordErrorMessage) {
		LoginpasswordErrorMessage = loginpasswordErrorMessage;
	}
}



