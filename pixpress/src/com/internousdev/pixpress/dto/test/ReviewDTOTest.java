package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.ReviewDTO;

public class ReviewDTOTest {

	// get Id
	@Test
	public void testGetId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
/*
	@Test
	public void testGetId4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
*/

	// set Id
	@Test
	public void testSetId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
/*
	@Test
	public void testSetId4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	// get UserId
	@Test
	public void testGetUserId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// set UserId
	@Test
	public void testSetUserId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// get ProductId
	@Test
	public void testGetProductId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

/*
	@Test
	public void testGetProductId4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	// set ProductId
	@Test
	public void testSetProductId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

/*
	@Test
	public void testSetProductId4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setProductId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setProductId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/

	// get ProductName
	@Test
	public void testGetProductName1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// set ProductName
	@Test
	public void testSetProductName1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// get ReviewTitle
	@Test
	public void testGetReviewTitle1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewTitle8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	// set ReviewTitle
	@Test
	public void testSetReviewTitle1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewTitle8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected, actual);
	}

	// get ReviewScore
	@Test
	public void testGetReviewScore1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewScore2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewScore3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

/*
	@Test
	public void testGetReviewScore4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setReviewScore(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetReviewScore5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setReviewScore(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	// set ReviewScore
	@Test
	public void testSetReviewScore1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewScore2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewScore3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483648;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

/*
	@Test
	public void testSetReviewScore4() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setReviewScore(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetReviewScore5() {
		ReviewDTO dto = new ReviewDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setReviewScore(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

*/
	// get ReviewBody
	@Test
	public void testGetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	// set ReviewBody
	@Test
	public void testSetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected, actual);
	}

	// get RegistDate
	@Test
	public void testGetRegistDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// set RegistDate
	@Test
	public void testSetRegistDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// get UpdateDate
	@Test
	public void testGetUpdateDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// set UpdateDate
	@Test
	public void testSetUpdateDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "acb123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
}
