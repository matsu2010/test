package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.pixpress.dto.AddressDTO;

public class AddressDTOTest {

	@Test
	public void testGetId1() {
		AddressDTO dto = new AddressDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2(){
		AddressDTO dto = new AddressDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3(){
		AddressDTO dto = new AddressDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId1() {
		AddressDTO dto = new AddressDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2(){
		AddressDTO dto = new AddressDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3(){
		AddressDTO dto = new AddressDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFamilyName1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyName2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFamilyName1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFamilyName11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFamilyName8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	/*@Test
	public void testSetFamilyName1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFamilyName1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFamilyName11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFamilyName8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFirstName1() {
	AddressDTO dto = new AddressDTO();
	String expected = "0";

	dto.setFirstName(expected);
	String actual = dto.getFirstName();
	assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFirstName1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFirstName11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFirstName8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFirstName1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFirstName1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFirstName11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFirstName8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFamilyNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFamilyNameKana1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyNameKana7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFamilyNameKana11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFamilyNameKana8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFamilyNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFamilyNameKana1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyNameKana7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFamilyNameKana11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFamilyNameKana8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	/*@Test
	public void testGetFirstNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFirstNameKana1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstNameKana7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetFirstNameKana11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetFirstNameKana8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFirstNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFirstNameKana1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstNameKana7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetFirstNameKana11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetFirstNameKana8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetEmail1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetEmail1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetEmail7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetEmail11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetEmail8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetEmail1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetEmail1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetEmail7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetEmail11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetEmail8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetTelNumber1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTelNumber2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetTelNumber1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTelNumber7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetTelNumber11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetTelNumber8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetTelNumber1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetTelNumber2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetTelNumber1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTelNumber7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetTelNumber11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetTelNumber8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress11() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAddress12() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress13(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress11(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress12(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress13(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress14(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress15(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress16(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress17(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress111(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress18(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress11() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAddress12() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress13(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress11(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress12(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress13(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress14(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress15(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress16(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress17(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress111(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress18(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress1(expected);
		String actual = dto.getAddress1();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress21() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAddress22() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress23(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress21(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress22(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress23(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress24(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress25(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress26(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress27(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress211(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress28(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress21() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAddress22() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress23(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress21(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress22(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress23(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress24(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress25(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress26(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress27(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress211(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress28(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress2(expected);
		String actual = dto.getAddress2();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress31() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetAddress32() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress33(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress31(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress32(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress33(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress34(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress35(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress36(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAddress37(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetAddress311(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetAddress38(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress31() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetAddress32() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress33(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress31(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress32(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress33(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress34(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress35(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress36(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAddress37(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetAddress311(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetAddress38(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress3(expected);
		String actual = dto.getAddress3();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetUserAddress1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetUserAddress1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserAddress7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testGetUserAddress11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testGetUserAddress8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetUserAddress1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress3(){
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483648";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetUserAddress1(){
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress2(){
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress3(){
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress4(){
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress5(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress6(){
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserAddress7(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	/*@Test
	public void testSetUserAddress11(){
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}*/
	@Test
	public void testSetUserAddress8(){
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRegistDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() throws ParseException {
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}
	@Test
	public void testSetRegistDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() throws ParseException {
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}
	@Test
	public void testGetUpdateDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}
}


