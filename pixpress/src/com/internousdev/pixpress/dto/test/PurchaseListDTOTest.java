package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.PurchaseListDTO;

public class PurchaseListDTOTest {

	//get RegistDate
	@Test
	public void testGetRegistDate1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	//set RegistDate
	@Test
	public void testSetRegistDate1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	//get TotalPrice
	@Test
	public void testGetTotalPrice1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
/*
	@Test
	public void testGetTotalPrice4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetTotalPrice5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	//set TotalPrice
	@Test
	public void testSetTotalPrice1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalPrice2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalPrice3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
/*
	@Test
	public void testSetTotalPrice4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetotalPrice5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	//get AllPurchaseListNumber
	@Test
	public void testGetAllPurchaseListNumber1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 0;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAllPurchaseListNumber2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAllPurchaseListNumber3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = -2147483648;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
/*
	@Test
	public void testGetAllPurchaseListNumber4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setAllPurchaseListNumber(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetAllPurchaseListNumber5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setAllPurchaseListNumber(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	//set AllPurchaseListNumber
	@Test
	public void testSetAllPurchaseListNumber1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 0;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAllPurchaseListNumber2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = 2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAllPurchaseListNumber3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		int expected = -2147483648;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
/*
	@Test
	public void testSetAllPurchaseListNumber4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setAllPurchaseListNumber(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetAllPurchaseListNumber5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setAllPurchaseListNumber(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	//get DeliveryTime
	@Test
	public void testGetDeliveryTime1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryTime5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryTime8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	//set DeliveryTime
	@Test
	public void testSetDeliveryTime1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryTime5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryTime8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryTime(expected);
		String actual = dto.getDeliveryTime();
		assertEquals(expected,actual);
	}

	//get DeliveryDate
	@Test
	public void testGetDeliveryDate1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDeliveryDate5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDeliveryDate8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	//set DeliveryDate
	@Test
	public void testSetDeliveryDate1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDeliveryDate5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDeliveryDate8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setDeliveryDate(expected);
		String actual = dto.getDeliveryDate();
		assertEquals(expected,actual);
	}

	//get UserAddress
	@Test
	public void testGetUserAddress1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	//set UserAddress
	@Test
	public void testSetUserAddress1() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress2() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress3() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress4() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress5() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress6() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress7() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress8() {
		PurchaseListDTO dto= new PurchaseListDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

}
