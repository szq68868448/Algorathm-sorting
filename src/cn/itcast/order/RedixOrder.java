package cn.itcast.order;

import java.util.Arrays;

public class RedixOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		// TODO Auto-generated method stub
		
		int digits = findMaxDigits(originalArray);
		
		
		for(int i=0;i<digits;i++) {
			
			int[] count = new int[10];
			
			int div = (int)Math.pow(10, i);
			
			for(int j=0;j<originalArray.length;j++) {
				
				int num = originalArray[j]/div%10;
				
				count[num]++;
				
			}
			
			int[] location = new int[10];
			
			location[0] = count[0]-1;
			
			for(int n=1;n<count.length;n++) {
				
				location[n]=count[n]+location[n-1];
			}
			
			int[] result = new int[originalArray.length];
			
			for(int k=originalArray.length-1; k>=0;k--) {
				
				int num = originalArray[k]/div%10;
				
				result[location[num]] = originalArray[k];
				
				location[num]--;
				
			}
			
			System.arraycopy(result, 0, originalArray, 0, originalArray.length);
			
		}
		
		return originalArray;
		
	}
	
	private int findMaxDigits(int[] arr) {
		
		int max = findMax(arr);
		
		int digits = 1;
		
		while(max>=10){
			
			digits++;
			
			max = max/10;
			
		}
		
		return digits;
		
	}
	
	private int findMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				
				max = arr[i];
				
			}
		}
		
		return max;
	}

}
