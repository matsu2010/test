package com.internousdev.pixpress.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.pixpress.dto.LoginDTO;


public class LoginDTOTest {


	// get Id test
	@Test
	public void testGetId1() {
		LoginDTO dto = new LoginDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		LoginDTO dto = new LoginDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId3() {
		LoginDTO dto = new LoginDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	/*@Test
	public void testGetId4() throws Exception{
		LoginDTO dto = new LoginDTO();
		try{
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() throws Exception{
		LoginDTO dto = new LoginDTO();
		try{
			int Min = Integer.parseInt("-214748364");
			dto.setId(Min);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}*/

	//set Id test
			@Test
			public void testSetId1() {
				LoginDTO dto = new LoginDTO();
				int expected = 0;

				dto.setId(expected);
				int actual = dto.getId();
				assertEquals(expected,actual);
			}
			@Test
			public void testSetId2() {
				LoginDTO dto = new LoginDTO();
				int expected = 2147483647;

				dto.setId(expected);
				int actual = dto.getId();
				assertEquals(expected,actual);
			}
			@Test
			public void testSetId3() {
				LoginDTO dto = new LoginDTO();
				int expected = -2147483647;

				dto.setId(expected);
				int actual = dto.getId();
				assertEquals(expected,actual);
			}
			/*@Test
			public void testSetId4() throws Exception{
				LoginDTO dto = new LoginDTO();
				try{
					int Max = Integer.parseInt("214748364");
					dto.setId(Max);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"2147483648\"");
				}
			}
			@Test
			public void testSetId5() throws Exception{
				LoginDTO dto = new LoginDTO();
				try{
					int Min = Integer.parseInt("-214748364");
					dto.setId(Min);
				}catch(RuntimeException e){
					assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
				}
			}*/


	// get UserId test

	/*@Test
	public void testGetUserId1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		LoginDTO dto = new LoginDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		LoginDTO dto = new LoginDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}*/
	@Test
	public void testGetUserId4() {
		LoginDTO dto = new LoginDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		LoginDTO dto = new LoginDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId7() {
		LoginDTO dto = new LoginDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		LoginDTO dto = new LoginDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	/*@Test
	public void testGetUserId11() {
		LoginDTO dto = new LoginDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}*/
	@Test
	public void testGetUserId12() {
		LoginDTO dto = new LoginDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	// set UserId test
		/*@Test
			public void testSetUserId1() {
			LoginDTO dto = new LoginDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			LoginDTO dto = new LoginDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			LoginDTO dto = new LoginDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}*/

		@Test
		public void testSetUserId4() {
			LoginDTO dto = new LoginDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			LoginDTO dto = new LoginDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			LoginDTO dto = new LoginDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			LoginDTO dto = new LoginDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			LoginDTO dto = new LoginDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetUserId11() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetUserId12() {
			LoginDTO dto = new LoginDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}


		// get Password test
		/*@Test
		public void testGetPassword1() {
			LoginDTO dto = new LoginDTO();
			String expected = "0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword2() {
			LoginDTO dto = new LoginDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword3() {
			LoginDTO dto = new LoginDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetPassword4() {
			LoginDTO dto = new LoginDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword5() {
			LoginDTO dto = new LoginDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword6() {
			LoginDTO dto = new LoginDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword7() {
			LoginDTO dto = new LoginDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword8() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword9() {
			LoginDTO dto = new LoginDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword10() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetPassword11() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetPassword12() {
			LoginDTO dto = new LoginDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}


		// set Password test
		/*@Test
		public void testSetPassword1() {
			LoginDTO dto = new LoginDTO();
			String expected = "0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword2() {
			LoginDTO dto = new LoginDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword3() {
			LoginDTO dto = new LoginDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetPassword4() {
			LoginDTO dto = new LoginDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword5() {
			LoginDTO dto = new LoginDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword6() {
			LoginDTO dto = new LoginDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword7() {
			LoginDTO dto = new LoginDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword8() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword9() {
			LoginDTO dto = new LoginDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword10() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetPassword11() {
			LoginDTO dto = new LoginDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetPassword12() {
			LoginDTO dto = new LoginDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

		// get FamilyName test
		/*@Test
		public void testGetFamilyName1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFamilyName4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			LoginDTO dto = new LoginDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			LoginDTO dto = new LoginDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetFamilyName11() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFamilyName12() {
			LoginDTO dto = new LoginDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}


		// set FamilyName test
		/*@Test
		public void testSetFamilyName1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFamilyName4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			LoginDTO dto = new LoginDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			LoginDTO dto = new LoginDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetFamilyName11() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFamilyName12() {
			LoginDTO dto = new LoginDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		// get FirstName test
		/*@Test
		public void testGetFirstName1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFirstName4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetFirstName11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFirstName12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}



		// set FirstName test
		/*@Test
		public void testSetFirstName1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFirstName4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetFirstName11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFirstName12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}


		// get FamilyNameKana test
		/*@Test
		public void testGetFamilyNameKana() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFamilyNameKana4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana6() {
			LoginDTO dto = new LoginDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana7() {
			LoginDTO dto = new LoginDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana8() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana9() {
			LoginDTO dto = new LoginDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana10() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetFamilyNameKana11() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFamilyNameKana12() {
			LoginDTO dto = new LoginDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}


		// set FirstNameKana test
		/*@Test
		public void testSetFamilyNameKana1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFamilyNameKana4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana6() {
			LoginDTO dto = new LoginDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana7() {
			LoginDTO dto = new LoginDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana8() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana9() {
			LoginDTO dto = new LoginDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana10() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetFamilyNameKana11() {
			LoginDTO dto = new LoginDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFamilyNameKana12() {
			LoginDTO dto = new LoginDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}


		// get FirstNameKana test
		/*@Test
		public void testGetFirstNameKana1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFirstNameKana4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetFirstNameKana11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetFirstNameKana12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}



		// set FirstNameKana test
		/*@Test
		public void testSetFirstNameKana1() {
			LoginDTO dto = new LoginDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana2() {
			LoginDTO dto = new LoginDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana3() {
			LoginDTO dto = new LoginDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFirstNameKana4() {
			LoginDTO dto = new LoginDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana5() {
			LoginDTO dto = new LoginDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetFirstNameKana11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetFirstNameKana12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}


		// get Sex test
		@Test
		public void testGetSex1() {
			LoginDTO dto = new LoginDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex2() {
			LoginDTO dto = new LoginDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex3() {
			LoginDTO dto = new LoginDTO();
			int expected = -2147483648;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		/*@Test
		public void testGetSex4() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetSex5() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setSex(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
*/

		//set Sex test
		@Test
		public void testSetSex1() {
			LoginDTO dto = new LoginDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex2() {
			LoginDTO dto = new LoginDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex3() {
			LoginDTO dto = new LoginDTO();
			int expected = -2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		/*@Test
		public void testSetSex4() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetSex5() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setSex(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}*/


		// Get Email test
		/*@Test
		public void testGetEmail1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetEmail4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetEmail11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetEmail12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}


		// set Email test
		/*@Test
		public void testSetEmail1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetEmail4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetEmail11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetEmail12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}


		// get Status test
		@Test
		public void testGetStatus1() {
			LoginDTO dto = new LoginDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testStatus2() {
			LoginDTO dto = new LoginDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus3() {
			LoginDTO dto = new LoginDTO();
			int expected = -2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		/*@Test
		public void testGetStatus4() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetStatus5() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setStatus(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}*/


		//set Status test
		@Test
		public void testSetStatus1() {
			LoginDTO dto = new LoginDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus2() {
			LoginDTO dto = new LoginDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus3() {
			LoginDTO dto = new LoginDTO();
			int expected = -2147483648;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		/*@Test
		public void testSetStatus4() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetStatus5() throws Exception{
			LoginDTO dto = new LoginDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setStatus(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}*/


		//LoginFlg test

		//true
		@Test
	    public void testGetLoginFlg1(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = true;
	        dto.setLoginFlg(expected);
	        assertEquals(expected, dto.isLoginFlg());
	    }

	    @Test
	    public void testSetLoginFlg1(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = true;
	        dto.setLoginFlg(expected);
	        assertEquals(expected, dto.isLoginFlg());
	    }


	    //false
	    @Test
	    public void testGetLoginFlg2(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = false;
	        dto.setLoginFlg(expected);
	        assertEquals(expected, dto.isLoginFlg());
	    }

	    @Test
	    public void testSetLoginFlg2(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = false;
	        dto.setLoginFlg(expected);
	        assertEquals(expected, dto.isLoginFlg());
	    }


	    //loginMaster

	    //true
	    @Test
	    public void testGetMasterFlg1(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = true;
	        dto.setMasterFlg(expected);
	        assertEquals(expected, dto.isMasterFlg());
	    }

	    @Test
	    public void testSetMasterFlg1(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = true;
	        dto.setMasterFlg(expected);
	        assertEquals(expected, dto.isMasterFlg());
	    }

	    //false
	    @Test
	    public void testGetMasterFlg2(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = false;
	        dto.setMasterFlg(expected);
	        assertEquals(expected, dto.isMasterFlg());
	    }

	    @Test
	    public void testSetMasterFlg2(){
	        LoginDTO dto = new LoginDTO();
	        boolean expected = false;
	        dto.setMasterFlg(expected);
	        assertEquals(expected, dto.isMasterFlg());
	    }



		// Get RegistDate test
		/*@Test
		public void testGetRegistDate1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetRegistDate4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetRegistDate11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetRegistDate12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}


		// set RegistDate test
		/*@Test
		public void testSetRegistDate1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetRegistDate4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetRegistDate11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetRegistDate12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setRegistDate(expected);
			String actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}



		// Get UpdateDate test
		/*@Test
		public void testGetUpdateDate1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetUpdateDate4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testGetUpdateDate11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testGetUpdateDate12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}


		// set Email test
		/*@Test
		public void testSetUpdateDate1() {
			LoginDTO dto = new LoginDTO();
			String expected= "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			LoginDTO dto = new LoginDTO();
			String expected= "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			LoginDTO dto = new LoginDTO();
			String expected= "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetUpdateDate4() {
			LoginDTO dto = new LoginDTO();
			String expected= "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			LoginDTO dto = new LoginDTO();
			String expected= "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			LoginDTO dto = new LoginDTO();
			String expected= " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			LoginDTO dto = new LoginDTO();
			String expected= "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			LoginDTO dto = new LoginDTO();
			String expected= "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		/*@Test
		public void testSetUpdateDate11() {
			LoginDTO dto = new LoginDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}*/
		@Test
		public void testSetUpdateDate12() {
			LoginDTO dto = new LoginDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
}