

@Test
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
}
@Test
public void testGetFamilyName4(){
	AddressDTO dto = new AddressDTO();
	String expected = "null";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName5(){
	AddressDTO dto = new AddressDTO();
	String expected = "";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName6(){
	AddressDTO dto = new AddressDTO();
	String expected = " ";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName7(){
	AddressDTO dto = new AddressDTO();
	String expected = "　";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName8(){
	AddressDTO dto = new AddressDTO();
	String expected = "abc123";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName9(){
	AddressDTO dto = new AddressDTO();
	String expected = "あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName10(){
	AddressDTO dto = new AddressDTO();
	String expected = "abc123あいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName11(){
	AddressDTO dto = new AddressDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}
@Test
public void testGetFamilyName12(){
	AddressDTO dto = new AddressDTO();
	String expected = "ａｂｃあいう１２３";

	dto.setFamilyName(expected);
	String actual = dto.getFamilyName();
	assertEquals(expected,actual);
}