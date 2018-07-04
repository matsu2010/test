package com.internousdev.pixpress.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.pixpress.dto.PaginationDTO;
import com.internousdev.pixpress.dto.ProductListDTO;

public class Pagination {
	public ArrayList<ArrayList<ProductListDTO>> paginate_old(List<ProductListDTO> productInfoDtoList,int pageNumber){
		int elementNumber = 0;
		ArrayList<ArrayList<ProductListDTO>> list = new ArrayList<>();
		list.add(new ArrayList<ProductListDTO>());
		for(int page=1; page<= productInfoDtoList.size(); page++){
			list.get(elementNumber).add(productInfoDtoList.get(page - 1));
				if(page >= 9) {
				if(page % 9 == 0 && page != 0){
					elementNumber++;
					list.add(new ArrayList<ProductListDTO>());
				}
				}
		}
		System.out.println(list);
		return list;
	}


	public PaginationDTO initialize(List<ProductListDTO> list, int pageSize) {

		PaginationDTO paginationDTO = new PaginationDTO();
		// 全ページ数
//		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		
		if(list.size() < 9) {
			
			paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
			
			// 現在のページ番号
			paginationDTO.setCurrentPageNo(1);
			// 全レコード数
			paginationDTO.setTotalRecordSize(list.size() - 1);
			// 現在のページ番号に対する開始レコード番号（オフセット）
			paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
			// 現在のページ番号に対する終了レコード番号
			paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + ((list.size() % pageSize)-1)/*(pageSize - 1)*/);

			List<Integer> pageNumberList = new ArrayList<Integer>();
			for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
				pageNumberList.add(pageNumber);
			}

			List<ProductListDTO> productInfoPages = new ArrayList<ProductListDTO>();
			for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {
				productInfoPages.add(list.get(pageNumberOffset));
			}
			paginationDTO.setCurrentProductInfoPage(productInfoPages);

			if((paginationDTO.getStartRecordNo() - 1) <= 0) {
				paginationDTO.setHasPreviousPage(false);
			}else {
				paginationDTO.setHasPreviousPage(true);
				paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
			}

			if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
				paginationDTO.setHasNextPage(false);
			}else {
				paginationDTO.setHasNextPage(true);
				paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
			}
			return paginationDTO;
		}else if(list.size()%pageSize == 0) {
			paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		}else {
			paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize) + 1));
		}
		// 現在のページ番号
		paginationDTO.setCurrentPageNo(1);
		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);
		// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
		// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductListDTO> productInfoPages = new ArrayList<ProductListDTO>();
		for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		if((paginationDTO.getStartRecordNo() - 1) <= 0) {
			paginationDTO.setHasPreviousPage(false);
		}else {
			paginationDTO.setHasPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
			paginationDTO.setHasNextPage(false);
		}else {
			paginationDTO.setHasNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}
		return paginationDTO;
	}


	public PaginationDTO getPage(List<ProductListDTO> list, int pageSize, String pageNo) {

		PaginationDTO paginationDTO = new PaginationDTO();
		// 全ページ数
//		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		
		
		if(list.size() % pageSize < 9) {
			
			
			
			
				paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize) + 1));
	
			// 現在のページ番号
			paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));
			// 全レコード数
			paginationDTO.setTotalRecordSize(list.size() - 1);
			// 現在のページ番号に対する開始レコード番号（オフセット）
			paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
			// 現在のページ番号に対する開始レコード番号
//		   paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);
			// 現在のページ番号に対する終了レコード番号
		   
		   int i = Integer.parseInt(pageNo);
		   if(list.size() / pageSize == i-1 ) {
			   paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + ((list.size() % pageSize) - 1));
		   }else {
			   paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + pageSize - 1);
		   }

			List<Integer> pageNumberList = new ArrayList<Integer>();
			for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
				pageNumberList.add(pageNumber);
			}

			List<ProductListDTO> productInfoPages = new ArrayList<ProductListDTO>();
			for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {
				productInfoPages.add(list.get(pageNumberOffset));
			}
			paginationDTO.setCurrentProductInfoPage(productInfoPages);

			if((paginationDTO.getStartRecordNo() - 1) <= 0) {
				paginationDTO.setHasPreviousPage(false);
			}else {
				paginationDTO.setHasPreviousPage(true);
				paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
			}

			if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
				paginationDTO.setHasNextPage(false);
			}else {
				paginationDTO.setHasNextPage(true);
				paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
			}

			return paginationDTO;

			
		}else if(list.size()%pageSize == 0) {
			paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		}else {
			paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize) + 1));
		}
		// 現在のページ番号
		paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));
		// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);
		// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
		// 現在のページ番号に対する開始レコード番号
//	   paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);
		// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductListDTO> productInfoPages = new ArrayList<ProductListDTO>();
		for(int pageNumberOffset=paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++) {
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		if((paginationDTO.getStartRecordNo() - 1) <= 0) {
			paginationDTO.setHasPreviousPage(false);
		}else {
			paginationDTO.setHasPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
			paginationDTO.setHasNextPage(false);
		}else {
			paginationDTO.setHasNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}

		return paginationDTO;

	}

}
