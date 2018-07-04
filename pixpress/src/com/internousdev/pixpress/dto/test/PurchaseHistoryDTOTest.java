//担当：森本

package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.PurchaseHistoryDTO;

public class PurchaseHistoryDTOTest {
/*	@Test
	public void testGetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId2() {

		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

*/
	@Test	public void testGetUserId1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testGetUserId12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}*/
/*	@Test
	public void testSetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
*/
	@Test
	public void testSetUserId1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testSetUserId12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
*/
	@Test
	public void testGetProductId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPurchaseHistoryId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPurchaseHistoryId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPurchaseHistoryId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPurchaseHistoryId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPurchaseHistoryId2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPurchaseHistoryId3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483648;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testGetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetRegistDate1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testGetRegistDate12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
*/
/*	@Test
	public void testSetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/

	@Test
	public void testSetRegistDate1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testSetRegistDate12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
/*	@Test
	public void testGetDeliveryDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetDeliveryDate1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testGetDeliveryDate12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}*/
/*	@Test
	public void testSetDeliveryDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetDeliveryDate1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate11(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testSetDeliveryDate12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}*/
/*	@Test
	public void testGetDeliveryTime1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetDeliveryTime1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime11(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
/*	@Test
	public void testGetDeliveryTime12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483648";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetDeliveryTime1(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime2(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime3(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime4(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime5(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime6(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime7(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime8(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
}
/*	@Test
	public void testSetDeliveryTime12(){
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
}
*/