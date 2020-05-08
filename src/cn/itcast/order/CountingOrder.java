package cn.itcast.order;

public class CountingOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		
		int min = findMin(originalArray);
		int max = findMax(originalArray);
		
		int[] value = new int[max-min+1];
		
		for(int i=0; i<value.length;i++) {
			
			value[i]=min+i;
		}
		
		int[] count = new int[value.length];
		
			
		for(int i=0; i<originalArray.length;i++) {
				
				count[originalArray[i]-min]++;
					
		}
				
		
		int[] location = new int[value.length];
		
		location[0]=count[0]-1;
		
		for(int i=1;i<location.length;i++) {
			
			location[i]=location[i-1]+count[i];
			
		}
		
		int[] result = new int[originalArray.length];
		
		for(int i=originalArray.length-1; i>=0;i--) {
			
			
			result[location[originalArray[i]-min]]=originalArray[i];
			
			location[originalArray[i]-min]--;
			
		}
		
		return result;
	}
		
		
		private int findMin(int[] arr){
			
			int min=arr[0];
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]<min) {
					
					min = arr[i];
				}
			}
			
			return min;
		}
		
		private int findMax(int[] arr){
			
			int max = arr[0];
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>max) {
					
					max = arr[i];
				}
			}
			
			return max;
			
		}
	
	
	

}
