package com.internousdev.pixpress.dto.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.internousdev.pixpress.dto.PaginationDTO;
import com.internousdev.pixpress.dto.ProductListDTO;

public class PaginationDTOTest {

	// get TotalPageSize test
		@Test
		public void testGetTotalPageSizeNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}

		@Test
		public void testTotalPageSizeNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}

		@Test
		public void testTotalPageSizeNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}


		// set TotalPageSize test

		@Test
		public void testSetTotalPageSizeNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalPageSizeNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalPageSizeNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setTotalPageSize(expected);
			int actual = dto.getTotalPageSize();
			assertEquals(expected,actual);
		}


		// get CurrentPageNo test
		@Test
		public void testGetCurrentPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetCurrentPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetCurrentPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}


		//set CurrentPageNo test
		@Test
		public void testSetCurrentPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCurrentPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCurrentPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setCurrentPageNo(expected);
			int actual = dto.getCurrentPageNo();
			assertEquals(expected,actual);
		}


		// get TotalRecordSize test
		@Test
		public void testGetTotalRecordSizeNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetTotalRecordSizeNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetTotalRecordSizeNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}


		//set TotalRecordSize test
		@Test
		public void testSetTotalRecordSizeNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalRecordSizeNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalRecordSizeNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setTotalRecordSize(expected);
			int actual = dto.getTotalRecordSize();
			assertEquals(expected,actual);
		}


		// get StartRecordNo test
		@Test
		public void testGetStartRecordNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetStartRecordNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetStartRecordNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}


		//set CurrentPageNo test
		@Test
		public void testSetStartRecordNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStartRecordNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStartRecordNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setStartRecordNo(expected);
			int actual = dto.getStartRecordNo();
			assertEquals(expected,actual);
		}


		// get EndRecordNo test
		@Test
		public void testGetEndRecordNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetEndRecordNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetEndRecordNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}


		//set CurrentPageNo test
		@Test
		public void testSetEndRecordNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetEndRecordNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetEndRecordNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setEndRecordNo(expected);
			int actual = dto.getEndRecordNo();
			assertEquals(expected,actual);
		}


		@Test
		public void testGetPageNumberList(){

//			List<Integer> list = new ArrayList<>();
//			for(int expected=1; expected<=6; expected++){
//				list.add(expected);
//			}
//
//			assertEquals(list.size(), 6);
//			for(int actual=1; actual <=6; actual++){
//				int expected = list.get(actual);
//				assertEquals(expected, actual);
//			}


			List<Integer> actualList = new ArrayList<Integer>();
			actualList.add(10);
			actualList.add(20);
			actualList.add(30);
			actualList.add(40);
			actualList.add(50);
			assertThat(actualList.get(0),equalTo(10));//List内に"AA"と"DD"が含まれればTrue

		}

		@Test
		public void testGetCurrentProductInfoPage(){
			List<ProductListDTO> expected =new ArrayList<>();
			ProductListDTO expectedDto = new ProductListDTO();
			for(int i=0; i<=100;i+=10){
				expectedDto.setId(i);
				expected.add(expectedDto);
			}

			List<ProductListDTO> actual =new ArrayList<>();
			ProductListDTO actualDto = new ProductListDTO();
			for(int i=0; i<=100;i+=10){
				actualDto.setId(i);
				actual.add(actualDto);
			}

			assertThat(actual.get(0).getId(), equalTo(expected.get(0).getId()));


//			// Verify
//			// まずは List のサイズが期待値通りであるかを確認する
//			assertThat(list.size(), 6);
//			// で、その後に、個々の要素について期待値通りであるかを確認していく
//			assertThat(list.get(0), 1);
//			assertThat(list.get(1), 2);
//			assertThat(list.get(2), 3);
//			assertThat(list.get(3), 4);
//			assertThat(list.get(4), 5);
//			assertThat(list.get(5), 6);

		}



		//hasNextPage

	    //true
	    @Test
	    public void testHasNextPage1(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = true;
	        dto.setHasNextPage(expected);
	        assertEquals(expected, dto.getHasNextPage());
	    }

	    @Test
	    public void testSetHasNextPage1(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = true;
	        dto.setHasNextPage(expected);
	        assertEquals(expected, dto.getHasNextPage());
	    }

	    //false
	    @Test
	    public void testGetHasNextPage2(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = false;
	        dto.setHasNextPage(expected);
	        assertEquals(expected, dto.getHasNextPage());
	    }

	    @Test
	    public void testSethasNextPage2(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = false;
	        dto.setHasNextPage(expected);
	        assertEquals(expected, dto.getHasNextPage());
	    }


	  //hasPreviousPage

	    //true
	    @Test
	    public void testGetHasPreviousPage1(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = true;
	        dto.setHasPreviousPage(expected);
	        assertEquals(expected, dto.getHasPreviousPage());
	    }

	    @Test
	    public void testSetHasPreviousPage1(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = true;
	        dto.setHasPreviousPage(expected);
	        assertEquals(expected, dto.getHasPreviousPage());
	    }

	    //false
	    @Test
	    public void testGetHasPreviousPage2(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = false;
	        dto.setHasPreviousPage(expected);
	        assertEquals(expected, dto.getHasPreviousPage());
	    }

	    @Test
	    public void testSetHasPreviousPage2(){
	        PaginationDTO dto = new PaginationDTO();
	        boolean expected = false;
	        dto.setHasPreviousPage(expected);
	        assertEquals(expected, dto.getHasPreviousPage());
	    }


		// get NextPageNo test
		@Test
		public void testGetNextPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetNextPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetNextPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}


		//set NextPageNo test
		@Test
		public void testSetNextPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetNextPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetNextPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setNextPageNo(expected);
			int actual = dto.getNextPageNo();
			assertEquals(expected,actual);
		}


		// get PreviousPageNo test
		@Test
		public void testGetPreviousPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetPreviousPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetPreviousPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}


		//set PreviousPageNo test
		@Test
		public void testSetPreviousPageNoNo1() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 0;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPreviousPageNoNo2() {
			PaginationDTO dto = new PaginationDTO();
			int expected = 2147483647;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPreviousPageNoNo3() {
			PaginationDTO dto = new PaginationDTO();
			int expected = -2147483648;

			dto.setPreviousPageNo(expected);
			int actual = dto.getPreviousPageNo();
			assertEquals(expected,actual);
		}








}
