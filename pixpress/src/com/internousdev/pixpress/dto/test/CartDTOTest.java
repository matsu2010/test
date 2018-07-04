package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.pixpress.dto.CartDTO;

public class CartDTOTest {

	//dateのデータ型未実装
	//get Id
	@Test
	public void testGetId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		CartDTO dto = new CartDTO();
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
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
*/
	//get UserId
	@Test
	public void testGetUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//set UserId
	@Test
	public void testSetUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//get tempUserId
	@Test
	public void testGetTempUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//set tempUserId
	@Test
	public void testSetTempUserId1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//get CategoryId
	@Test
	public void testGetCategoryId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetCategoryId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		CartDTO dto = new CartDTO();
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
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

/*	@Test
	public void testSetCategoryId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setCategoryId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//get ProductId
	@Test
	public void testGetProductId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetProductId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() {
		CartDTO dto = new CartDTO();
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
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetProductId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//get ProductCount
	@Test
	public void testGetProductCount1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetProductCount4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductCount(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductCount(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set ProductCount
	@Test
	public void testSetProductCount1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetProductCount4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductCount(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductCount(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// get ProductName
	@Test
	public void testGetProductName1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// set ProductName
	@Test
	public void testSetProductName1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// get ProductNameKana
	@Test
	public void testGetProductNameKana1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ProductNameKana
	@Test
	public void testSetProductNameKana1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// get ProductDescription
	@Test
	public void testGetProductDescription1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ProductDescription
	@Test
	public void testSetProductDescription1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// get ImageFilePath
	@Test
	public void testGetImageFilePath1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ImageFilePath
	@Test
	public void testSetImageFilePath1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// get Director
	@Test
	public void testGetDirector1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDirector8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set Director
	@Test
	public void testSetDirector1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDirector8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setDirector(expected);
		String actual = dto.getDirector();
		assertEquals(expected, actual);
	}
	// get ReleaseYear
	@Test
	public void testGetReleaseYear1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseYear8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseYear(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ReleaseYear
	@Test
	public void testSetReleaseYear1() {
		CartDTO dto = new CartDTO();
		String expected = "null";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear3() {
		CartDTO dto = new CartDTO();
		String expected = " ";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear4() {
		CartDTO dto = new CartDTO();
		String expected = "　";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear5() {
		CartDTO dto = new CartDTO();
		String expected = "acb123";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear6() {
		CartDTO dto = new CartDTO();
		String expected = "あいう１２３";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear7() {
		CartDTO dto = new CartDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseYear8() {
		CartDTO dto = new CartDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseYear(expected);
		String actual = dto.getReleaseYear();
		assertEquals(expected, actual);
	}

	// get Price
	@Test
	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// set Price
	@Test
	public void testSetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// get TotalPrice
	@Test
	public void testGetTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetTotalPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetTotalPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	// set TotalPrice
	@Test
	public void testSetTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetTotalPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetTotalPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/


	// get SubTotalPrice
	@Test
	public void testGetSubTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSubtotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}


	//set SubTotalPrice
	@Test
	public void testSetSubTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSubTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483648;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}


	// Get RegistDate
	@Test
	public void testGetRegistDate1() {
		CartDTO dto = new CartDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() throws ParseException {
		CartDTO dto = new CartDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}


	// set RegistDate
	@Test
	public void testSetRegistDate1() {
		CartDTO dto = new CartDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() throws ParseException {
		CartDTO dto = new CartDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}


	//get UpdateDate
	@Test
	public void testGetUpdateDate1() {
		CartDTO dto = new CartDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		CartDTO dto = new CartDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}


	//set UpdateDate
	@Test
	public void testSetUpdateDate1() {
		CartDTO dto = new CartDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		CartDTO dto = new CartDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}


	// get DestinationId
	@Test
	public void testGetDestinationId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDestinationId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setDestinationId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetDestinationId5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setDestinationId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set DestinationId
	@Test
	public void testSetDestinationId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDestinationId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setDestinationId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetDestinationId5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setDestinationId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

/*	// get SubTotalPrice
	@Test
	public void testGetSubTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSubTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubTotalPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setSubTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetSubTotalPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setSubTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// set SubTotalPrice
	@Test
	public void testSetSubTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSubTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setSubTotalPrice(expected);
		int actual = dto.getSubTotalPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubTotalPrice4() {
		CartDTO dto = new CartDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setSubTotalPrice(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetSubTotalPrice5() {
		CartDTO dto = new CartDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setSubTotalPrice(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
*/
}
