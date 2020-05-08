package cn.itcast.order;

public class BubbleOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		
		int tmp = 0;
		
		for(int i=0;i<originalArray.length-1;i++) {
			
			
			for(int j=1;j<originalArray.length-i;j++) {
				
				if(originalArray[j-1]>originalArray[j]) {
					
					tmp = originalArray[j-1];
					originalArray[j-1] = originalArray[j];
					originalArray[j] = tmp;
				}
				
			}
		}
		return  originalArray;
	}

}
