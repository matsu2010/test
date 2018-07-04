package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.ProductListDTO;

public class ProductListDTOTest {

	// get ProductDescription
	@Test
	public void testGetProductDescription1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	// set ProductDescription
	@Test
	public void testSetProductDescription1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}


	// get ImageFileName
	@Test
	public void testGetImageFileName1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// set ImageFileName
	@Test
	public void testSetImageFileName1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// get RegistDate
	@Test
	public void testGetRegistDate1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// set RegistDate
	@Test
	public void testSetRegistDate1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// get UpdateDate
	@Test
	public void testGetUpdateDate1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// set UpdateDate
	@Test
	public void testSetUpdateDate1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	//get Id
	@Test
	public void testGetId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set Id
	@Test
	public void testSetId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//get ProductId
	@Test
	public void testGetProductId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetProductId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set ProductId
	@Test
	public void testSetProductId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetProductId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// get ProductName
	@Test
	public void testGetProductName1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// set ProductName
	@Test
	public void testSetProductName1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// get ProductNameKana
	@Test
	public void testGetProductNameKana1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ProductNameKana
	@Test
	public void testSetProductNameKana1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//get CategoryId
	@Test
	public void testGetCategoryId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetCategoryId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setCategoryId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set CategoryId
	@Test
	public void testSetCategoryId1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryId2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetCategoryId4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setCategoryId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//get Price
	@Test
	public void testGetPrice1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetPrice4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPrice5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set Price
	@Test
	public void testSetPrice1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetPrice4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPrice5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// get CastName1
	@Test
	public void testGetCastName11() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName12() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName13() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName14() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName15() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName16() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName17() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName18() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	// set CastName1
	@Test
	public void testSetCastName11() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName12() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName13() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName14() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName15() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName16() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName17() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName18() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName1(expected);
		String actual = dto.getCastName1();
		assertEquals(expected, actual);
	}

	// get CastName2
	@Test
	public void testGetCastName21() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName22() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName23() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName24() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName25() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName26() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName27() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName28() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	// set CastName2
	@Test
	public void testSetCastName21() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName22() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName23() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName24() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName25() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName26() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName27() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName28() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName2(expected);
		String actual = dto.getCastName2();
		assertEquals(expected, actual);
	}

	// get CastName3
	@Test
	public void testGetCastName31() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName32() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName33() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName34() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName35() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName36() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName37() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCastName38() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	// set CastName3
	@Test
	public void testSetCastName31() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName32() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName33() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName34() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName35() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName36() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName37() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCastName38() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCastName3(expected);
		String actual = dto.getCastName3();
		assertEquals(expected, actual);
	}

	// get Director
	@Test
	public void testGetDirector1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	// set Director
	@Test
	public void testSetDirector1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	//get ReleaseYear
	@Test
	public void testGetReleaseYear1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseYear2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetReleaseYear4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setReleaseYear(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetReleaseYear5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setReleaseYear(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set ReleaseYear
	@Test
	public void testSetReleaseYear1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseYear2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setReleaseYear(expected);
		int actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetReleaseYear4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setReleaseYear(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetReleaseYear5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setReleaseYear(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// get ImageFilePath
	@Test
	public void testGetImageFilePath1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// set ImageFilePath
	@Test
	public void testSetImageFilePath1() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3() {
		ProductListDTO dto = new ProductListDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "acb123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		ProductListDTO dto = new ProductListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//get Status
	@Test
	public void testGetStatus1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatus2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetStatus4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setStatus(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetStatus5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setStatus(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set Status
	@Test
	public void testSetStatus1() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatus2() {
		ProductListDTO dto = new ProductListDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus3() {
		ProductListDTO dto = new ProductListDTO();
		int expected = -2147483648;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetStatus4() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setStatus(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStatus5() {
		ProductListDTO dto = new ProductListDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setStatus(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
*/
}
