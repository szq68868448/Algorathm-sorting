package cn.itcast.order;

public class InsertionOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		// TODO Auto-generated method stub
		
		int tmp;
		
		for(int i=1;i<originalArray.length;i++) {
			
			for(int j=i;j>0;j--) {
				
				if(originalArray[j]<originalArray[j-1]) {
					
					tmp=originalArray[j];
					originalArray[j]=originalArray[j-1];
					originalArray[j-1]=tmp;
				}else {
					
					break;
				}
			}
		}
		
		return originalArray;
	}

}
