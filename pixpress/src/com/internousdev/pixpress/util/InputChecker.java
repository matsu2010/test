/*担当:小松*/

package com.internousdev.pixpress.util;

import java.util.HashMap;
import java.util.Map;

import com.internousdev.pixpress.dto.LoginDTO;

public class InputChecker {

	/*姓エラーメッセージ管理*/
	public static String familyNameChk(String familyName) {
		String result = "TRUE";

		if(familyName.equals("")) {
			result = "【姓を入力してください】";
		}else if(familyName.length() < 1 || familyName.length() > 16) {
			result = "【姓は1文字以上16文字以下で入力してください】";
		}else if(!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ー]+$")) {
			//"^[]+$"で囲われた文字以外が使われた時
			result = "【姓は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	/*名前エラーメッセージ管理*/
	public static String firstNameChk(String firstName) {
		String result = "TRUE";

		if(firstName.equals("")) {
			result = "【名前を入力してください】";
		}else if(firstName.length() < 1 || firstName.length() > 16) {
			result = "【名前は1文字以上16文字以下で入力してください】";
		}else if(!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ー]+$")){
			result = "【名前は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	/*姓かなエラーメッセージ管理*/
	public static String familyNameKanaChk(String familyNameKana) {
		String result = "TRUE";

		if(familyNameKana.equals("")) {
			result = "【姓のふりがなを入力してください】";
		}else if(familyNameKana.length() < 1 || familyNameKana.length() > 16) {
			result = "【姓のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!familyNameKana.matches("^[ぁ-ゞー]+$")){
			result = "【姓のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	/*名前かなエラーメッセージ管理*/
	public static String firstNameKanaChk(String firstNameKana) {
		String result = "TRUE";

		if(firstNameKana.equals("")) {
			result = "【名前のふりがなを入力してください】";
		}else if(firstNameKana.length() < 1 || firstNameKana.length() > 16) {
			result = "【名前のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!firstNameKana.matches("^[ぁ-ゞー]+$")){
			result = "【名前のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	/*ログインIDエラーメッセージ管理*/
	public static String userIdChk(String userId) {
		String result = null;

		if(userId.equals("")) {
			result = "【ログインIDを入力してください】";
		}else if(userId.length() < 1 || userId.length() > 8) {
			result = "【ログインIDは1文字以上8文字以下で入力してください】";
		}else if(!userId.matches("^[a-zA-Z0-9]+$")) {
			result = "【ログインIDは半角英数字で入力してください】";
		}
		return result;
	}

	/*パスワードエラーメッセージ管理*/
	public static String passwordChk(String password) {
		String result = null;

		if(password.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(password.length() < 1 || password.length() > 16) {
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!password.matches("^[a-zA-Z0-9]+$")) {
			result ="【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	/*新規ユーザー登録エラーメッセージ管理*/
	public static Map<String, String> createNewUserChk(LoginDTO loginDTO){

		Map<String,String> result = new HashMap<String,String>();

		/*姓エラーメッセージ管理*/
		if(loginDTO.getFamilyName().equals("")) {
			result.put("familyName", "【姓を入力してください】");
		}else if(loginDTO.getFamilyName().length() < 1 || loginDTO.getFamilyName().length() > 16) {
			result.put("familyName", "【姓は1文字以上16文字以下で入力してください】");
		}else if(!loginDTO.getFamilyName().matches("^[a-zA-Zぁ-ゞ一-龠々ー]+$")) {
			//"^[]+$"で囲われた文字以外が使われた時
			result.put("familyName", "【姓は半角英語、漢字、ひらがなで入力してください】");
		}

		/*名前エラーメッセージ管理*/
		if(loginDTO.getFirstName().equals("")) {
			result.put("firstName", "【名前を入力してください】");
		}else if(loginDTO.getFirstName().length() < 1 || loginDTO.getFirstName().length() > 16) {
			result.put("firstName", "【名前は1文字以上16文字以下で入力してください】");
		}else if(!loginDTO.getFirstName().matches("^[a-zA-Zぁ-ゞ一-龠々ー]+$")){
			result.put("firstName", "【名前は半角英語、漢字、ひらがなで入力してください】");
		}

		/*姓かなエラーメッセージ管理*/
		if(loginDTO.getFamilyNameKana().equals("")) {
			result.put("familyNameKana", "【姓のふりがなを入力してください】");
		}else if(loginDTO.getFamilyNameKana().length() < 1 || loginDTO.getFamilyNameKana().length() > 16) {
			result.put("familyNameKana", "【姓のふりがなは1文字以上16文字以下で入力してください】");
		}else if(!loginDTO.getFamilyNameKana().matches("^[ぁ-ゞー]+$")){
			result.put("familyNameKana", "【姓のふりがなはひらがなで入力してください】");
		}

		/*名前かなエラーメッセージ管理*/
		if(loginDTO.getFirstNameKana().equals("")) {
			result.put("firstNameKana", "【名前のふりがなを入力してください】");
		}else if(loginDTO.getFirstNameKana().length() < 1 || loginDTO.getFirstNameKana().length() > 16) {
			result.put("firstNameKana", "【名前のふりがなは1文字以上16文字以下で入力してください】");
		}else if(!loginDTO.getFirstNameKana().matches("^[ぁ-ゞー]+$")){
			result.put("firstNameKana", "【名前のふりがなはひらがなで入力してください】");
		}

		/*性別エラーメッセージ管理*/
		if(loginDTO.getSex() != 0 && loginDTO.getSex() != 1){
			result.put("sex", "【性別は男性、女性どちらかで選んでください】");
		}

		/*ログインIDエラーメッセージ管理*/
		if(loginDTO.getUserId().equals("")) {
			result.put("userId", "【ログインIDを入力してください】");
		}else if(loginDTO.getUserId().length() < 1 || loginDTO.getUserId().length() > 8) {
			result.put("userId", "【ログインIDは1文字以上8文字以下で入力してください】");
		}else if(!loginDTO.getUserId().matches("^[a-zA-Z0-9]+$")) {
			result.put("userId", "【ログインIDは半角英数字で入力してください】");
		}

		/*パスワードエラーメッセージ管理*/
		if(loginDTO.getPassword().equals("")) {
			result.put("password", "【パスワードを入力してください】");
		}else if(loginDTO.getPassword().length() < 1 || loginDTO.getPassword().length() > 16) {
			result.put("password", "【パスワードは1文字以上16文字以下で入力してください】");
		}else if(!loginDTO.getPassword().matches("^[a-zA-Z0-9]+$")) {
			result.put("password", "【パスワードは半角英数字で入力してください】");
		}

		/*メールアドレスエラーメッセージ管理*/
		if(loginDTO.getEmail().equals("")) {
			result.put("email", "【メールアドレスを入力してください】");
		}else if(loginDTO.getEmail().length() < 14 || loginDTO.getEmail().length() > 32) {
			result.put("email",  "【メールアドレスは14文字以上32文字以下で入力してください】");
		}else if(!loginDTO.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			result.put("email",  "【メールアドレスは半角英数字記号で、正しいものを入力してください】");
		}
		return result;
	}

	/*新しいパスワードエラーメッセージ管理*/
	public static String newPasswordChk(String newPassword) {
		String result = "TRUE";

		if(newPassword.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(newPassword.length()<1 || newPassword.length()>16){
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!(newPassword.matches("^[a-zA-Z0-9]+$"))){
			result = "【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	/*再確認パスワードエラーメッセージ管理*/
	public static String rePasswordChk(String rePassword, String password) {
		String result = "TRUE";

		if(rePassword.equals("")) {
			result = "【再確認パスワードを入力してください】";
		}else if(rePassword.length() < 1 || rePassword.length() > 16) {
			result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
		}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
			result = "【再確認パスワードは半角英数字で入力してください】";
		}else if(!(rePassword.equals(password))) {
			result = "【入力されたパスワードが一致しません】";
		}
		return result;
	}

	/*再確認新しいパスワードエラーメッセージ管理*/
	public static String reNewPasswordChk(String rePassword, String newPassword) {
		String result = "TRUE";

		if(rePassword.equals("")) {
			result = "【再確認パスワードを入力してください】";
		}else if(rePassword.length() < 1 || rePassword.length() > 16) {
			result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
		}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
			result = "【再確認パスワードは半角英数字で入力してください】";
		}else if(!(rePassword.equals(newPassword))) {
			result = "【入力された新しいパスワードが一致しません】";
		}
		return result;
	}

	/*郵便番号エラーメッセージ管理*/
	public static String address1Chk(String address1) {
		String result = "TRUE";

		if(address1.equals("")) {
			result = "【郵便番号を入力してください】";
		}else if(address1.length() < 7 || address1.length() > 8) {
			result = "【郵便番号は7桁で入力してください】";
		}else if(!address1.matches("^[0-9]+$")) {
			result = "【郵便番号は半角数字で入力してください】";
		}
		return result;
	}

	/*都道府県エラーメッセージ管理*/
	public static String address2Chk(String address2){
		String result = "TRUE";
		if(address2.equals("")){
			result = "【都道府県を入力してください】";
		}else if(!address2.matches("^[一-龠々]+[都道府県]")){
			result = "【都道府県は正しい形式で入力してください】";
		}
		return result;
	}

	/*住所エラーメッセージ管理*/
	public static String address3Chk(String address3) {
		String result = "TRUE";

		if(address3.equals("")) {
			result = "【住所を入力してください】";
		}else if(address3.length() < 10 || address3.length() > 50) {
			result = "【住所は10文字以上50文字以下で入力してください】";
		}else if(!address3.matches("^[a-zA-Z0-9ぁ-ゞァ-ヾ一-龠々!-~]+$")) {
			result = "【住所は半角英数字、漢字、ひらがな、カタカナおよび半角記号で入力してください】";
		}else if(!address3.matches("^.+[市区町村].+$")){
			result = "【住所は正しい形式で入力してください(例：○○市○○)】";
		}
		return result;
	}

	/*電話エラーメッセージ管理*/
	public static String telNumberChk(String telNumber) {
		String result = "TRUE";

		if(telNumber.equals("")) {
			result = "【電話番号を入力してください】";
		}else if(telNumber.length() < 10 || telNumber.length() > 13) {
			result = "【電話番号は10文字以上13文字以下で入力し てください】";
		}else if(!telNumber.matches("^[0-9]+$")) {
			result = "【電話番号は半角数字で、正しいものを入力してください】";
		}
		return result;
	}

	/*メールアドレスエラーメッセージ管理*/
	public static String emailChk(String email) {
		String result = "TRUE";

		if(email.equals("")) {
			result = "【メールアドレスを入力してください】";
		}else if(email.length() < 14 || email.length() > 32) {
			result = "【メールアドレスは14文字以上32文字以下で入力してください】";
		}else if(!email.matches("^[a-zA-Z0-9@.,;:!#$%&'*+-/=?^_`{|}~]+@+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+.+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			result = "【メールアドレスは半角英数字記号で、正しいものを入力してください】";
		}
		return result;
	}

	/*新しいメールアドレスエラーメッセージ管理*/
	public static String newEmailChk(String newEmail) {
		String result = "TRUE";

		if(newEmail.equals("")) {
			result = "【新しいメールアドレスを入力してください】";
		}else if(newEmail.length() < 14 || newEmail.length() > 32){
			result = "【新しいメールアドレスは14文字以上32文字以下で入力してください】";
		}else if((!newEmail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))){
			result = "【新しいメールアドレスは半角英数字で、正しいものを入力してください】";
		}
		return result;
	}


	/*検索ワードエラーメッセージ管理*/
	public static String keywordChk(String keywords) {
		String result = "";

		if(keywords.length() > 16) {
			result = "【検索キーワードは、1文字以上16文字以下で入力してください】";
		}else if(!keywords.matches("^[a-zA-Z0-9ぁ-ゞ一-龠々ァ-ヾ　\\s]*$") && keywords != "") {
			result = "【検索キーワードは半角英数字、漢字、ひらがな、カタカナで入力してください】";
		}
		return result;
	}

	/*レビューエラーメッセージ管理*/
	public static Map<String, String> reviewChk(String reviewTitle, String reviewBody, int reviewScore){

		Map<String, String> result = new HashMap<String, String>();

		if(reviewTitle.length() > 15 || reviewTitle.length() < 1){
			result.put("reviewTitle", "【タイトルは、1文字以上15文字以下で入力してください】");
		}

		if(reviewBody.length() > 255 || reviewBody.length() < 1){
			result.put("reviewBody", "【本文は、1文字以上250文字以下で入力してください】");
		}

		if(reviewScore > 5 || reviewScore < 1){
			result.put("reviewScore", "【評価は1以上5以下の整数で入力してください】");
		}

		return result;

	}

	/*管理者商品ID*/
	public static String productIdChk(String productId) {
		String result = null;

		if(productId.isEmpty()) {
			result = "【商品IDを入力してください】";
		}
		if(productId.length()<1 || productId.length()>4) {
			result = "【商品IDは1文字以上4文字以下で入力してください】";
		}
		if(!productId.matches("^[0-9]+$")) {
			result = "【商品IDは半角数字で入力してください】";
		}
		return result;
	}

	/*管理者商品名*/
	public static String productNameChk(String productName) {
		String result = null;

		if(productName.isEmpty()) {
			result = "【商品名を入力してください】";
		}
		if(productName.length()<1 || productName.length()>50) {
			result ="【商品名は1文字以上50文字以下で入力してください】";
		}
		return result;
	}

	/*管理者商品名かな*/
	public static String productNameKanaChk(String productNameKana) {
		String result = null;

		if(productNameKana.isEmpty()) {
			result = "【商品名の仮名を入力してください】";
		}
		if(productNameKana.length()<1 || productNameKana.length()>50) {
			result ="【商品名仮名は1文字以上50文字以下で入力してください】";
		}
		if(!productNameKana.matches("^[ぁ-ゞー0-9]+$")) {
			result = "【商品名の仮名をはひらがなで入力してください】";
		}
		return result;
	}

	/*管理者公開年*/
	public static String releaseYearChk(String releaseYear) {
		String result = null;

		if(releaseYear.isEmpty()) {
			return result = "【公開年を入力してください】";
		}
		if(!releaseYear.matches("^[0-9]+$")) {
			return result = "【公開年は半角の整数で入力してください】";
		}
		if(releaseYear.length()!=4) {
			return result = "【公開年は正しく入力してください】";
		}
		if(Integer.parseInt(releaseYear)<1895 || Integer.parseInt(releaseYear)>2018) {
			result = "【公開年は正しく入力してください】";
		}
		return result;
	}

	/*管理者商品価格*/
	public static String priceChk(String price) {
		String result = null;

		if(price.isEmpty()) {
			return result = "【商品価格を入力してください】";
		}
		if(!price.matches("^[0-9]+$")) {
			return result = "【商品価格は数字で入力してください】";
		}
		if(Integer.parseInt(price)<100 || Integer.parseInt(price)>100000) {
			result = "【商品価格は100円以上10万円以内で入力してください】";
		}
		return result;
	}

	/*管理者監督名*/
	public static String directorChk(String director) {
		String result = null;

		if(director.isEmpty()) {
			result="【監督名を入力してください】";
		}
		if(director.length()<1 || director.length()>25) {
			result = "【監督名は1文字以上25文字以下で入力してください】";
		}
		return result;
	}

	/*管理者出演者名*/
	public static String castChk(String cast) {
		String result = null;

		if(cast.isEmpty()) {
			result = "【出演者名を入力してください】";
		}
		if(cast.length()<1 || cast.length()>25) {
			result = "【出演者名は1文字以上25文字以下で入力してください】";
		}
		return result;
	}

	/*管理者商品詳細*/
	public static String productDescriptionChk(String productDescription) {
		String result = null;

		if(productDescription.isEmpty()) {
			result = "【あらすじを入力してください】";
		}
		if(productDescription.length()<1 || productDescription.length()>250) {
			result = "【あらすじは1文字以上250文字以下で入力してください】";
		}
		return result;
	}

	/*管理者画像ファイル*/
	public static String imageFilePathChk(String imageFilePath) {
		String result = null;

		if(imageFilePath.equals(null) || imageFilePath.equals("")) {
			result = "【画像ファイルを選んでください】";
		}

		return result;
	}

}


