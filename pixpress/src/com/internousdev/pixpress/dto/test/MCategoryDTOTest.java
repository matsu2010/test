package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.pixpress.dto.MCategoryDTO;

public class MCategoryDTOTest {

	//get Id
	@Test
	public void testGetId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetId4() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		MCategoryDTO dto = new MCategoryDTO();
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
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetId4() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//get CategoryId
	@Test
	public void testGetCategoryId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetCategoryId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testGetCategoryId4() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		MCategoryDTO dto = new MCategoryDTO();
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
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetCategoryId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	/*@Test
	public void testSetCategoryId4() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMax = Integer.parseInt("2147483648");
			dto.setCategoryId(exMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId5() {
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int exMin = Integer.parseInt("-2147483648");
			dto.setCategoryId(exMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
*/
	// get CategoryName
	@Test
	public void testGetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "acb123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	// set CategoryName
	@Test
	public void testSetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "acb123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	// get CategoryDescription
	@Test
	public void testGetCategoryDescription1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "acb123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDescription8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	// set CategoryDescription
	@Test
	public void testSetCategoryDescription1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "acb123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDescription8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}


	//get InsertDate
	@Test
	public void testGetInserDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetInserDate2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}


	//set InsertDate
	@Test
	public void testSetInserDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInserDate2() throws ParseException {
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

	//get
	@Test
	public void testGetUpdateDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		MCategoryDTO dto = new MCategoryDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}
}