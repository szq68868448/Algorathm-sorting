package cn.itcast.checker;

import java.util.Arrays;
import java.util.Random;

import cn.itcast.order.Order;

public class Checker implements Ichecker{

	int testSize;
	int time;
	
	public Checker(int testSize,int time) {
		
		this.testSize=testSize;
		this.time=time;
	}
	
	public boolean check(Order order) {
		
		for(int i=0;i<time;i++) {
			
			if(compare(order)!=true) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	
	private boolean compare(Order order) {
		
		int[] arr = this.generateRandomArr(testSize);
		int[] arr1 = arr.clone();
		
		Arrays.sort(arr);
		
		arr1 = order.sort(arr1);
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=arr1[i]) {
				
				return false;
			}
			
		}
		
		return true;
	}

	private int[] generateRandomArr(int size) {
		
		int[] arr = new int[size];
		
		Random r = new Random();
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=r.nextInt(size);
			
		}
		
		return arr;
		
	}
}
