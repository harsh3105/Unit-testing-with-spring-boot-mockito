package com.unittesting.learn.business;

public class SomeBusinessImpl {
	
	public int calculateSum(int[] arr) {
		int sum=0;
		for(int value:arr) {
			sum=sum+value;
		}
		return sum;
	}

}
