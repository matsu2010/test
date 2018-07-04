package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.PurchaseHistoryDetailsDTO;

public class PurchaseHistoryDetailsDTOTest {
	@Test
	public void testGetPurchaseHistoryId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPurchaseHistoryId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPurchaseHistoryId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPurchaseHistoryId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPurchaseHistoryId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPurchaseHistoryId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setPurchaseHistoryId(expected);
		int actual = dto.getPurchaseHistoryId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductName1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductName11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductName8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductName1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductName11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductName8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductNameKana1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductNameKana1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductNameKana11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductNameKana8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductNameKana1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductNameKana1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductNameKana11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductNameKana8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductDescription1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductDescription2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductDescription1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductDescription7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductDescription11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductDescription8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductDescription1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductDescription2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductDescription1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductDescription7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductDescription11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductDescription8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetImageFileName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetImageFileName1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetImageFileName11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetImageFileName8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetImageFileName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetImageFileName1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetImageFileName11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetImageFileName8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetImageFilePath1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetImageFilePath11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetImageFilePath8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetImageFilePath1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetImageFilePath11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetImageFilePath8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddressId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddressId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddressId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAddressId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddressId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddressId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setAddressId(expected);
		int actual = dto.getAddressId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetPostalCode1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPostalCode2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetPostalCode1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPostalCode7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetPostalCode11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetPostalCode8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetPostalCode1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPostalCode2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetPostalCode1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPostalCode7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetPostalCode11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetPostalCode8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPostalCode(expected);
		String actual = dto.getPostalCode();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetUserAddress1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetUserAddress1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetUserAddress11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetUserAddress8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetUserAddress1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetUserAddress1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetUserAddress11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetUserAddress8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetReleaseCompany1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetReleaseCompany1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetReleaseCompany11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetReleaseCompany8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetReleaseCompany1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetReleaseCompany1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetReleaseCompany11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetReleaseCompany8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetReleaseDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetReleaseDate1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetReleaseDate11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetReleaseDate8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetReleaseDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetReleaseDate1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetReleaseDate11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetReleaseDate8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetId1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetId11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetId8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetId1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetId11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetId8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductId1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetProductId11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetProductId8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductId1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetProductId11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetProductId8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetRegistDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRegistDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetRegistDate1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetRegistDate11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetRegistDate8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetRegistDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRegistDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetRegistDate1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRegistDate7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetRegistDate11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetRegistDate8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryId1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetDirector1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDirector2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetDirector1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDirector7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetDirector11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetDirector8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetDirector1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDirector2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetDirector1(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector4(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector5(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector6(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDirector7(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetDirector11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetDirector8(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCastName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName13(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName11(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName12(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName13(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName14(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName15(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName16(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName17(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName111(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName18(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCastName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName13(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName12(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName13(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName14(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName15(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName16(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName17(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName111(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName18(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName21() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCastName22() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName23(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName21(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName22(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName23(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName24(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName25(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName26(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName27(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName211(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName28(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName21() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCastName22() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName23(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName21(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName22(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName23(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName24(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName25(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName26(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName27(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName211(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName28(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName31() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCastName32() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName33(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName31(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName32(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName33(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName34(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName35(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName36(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCastName37(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetCastName311(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetCastName38(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName31() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCastName32() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName33(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483648";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName31(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName32(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName33(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName34(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName35(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName36(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCastName37(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetCastName311(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetCastName38(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseYear1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseYear2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseYear3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseYear1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseYear2(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseYear3(){
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483648;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}
}