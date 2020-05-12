package com.unittesting.learn.business;

import com.unittesting.learn.data.SomeDataService;

public class SomeBusinessImpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
	
	public int calculateSum(int[] arr) {
		int sum=0;
		for(int value:arr) {
			sum=sum+value;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int sum=0;
		int[] data = someDataService.retrieveAllData();
		for(int value:data) {
			sum += value;
		}
		return sum;
	}

	

}
