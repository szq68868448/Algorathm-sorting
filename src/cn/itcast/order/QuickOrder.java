package cn.itcast.order;

public class QuickOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		// TODO Auto-generated method stub
		quickSort(originalArray,0,originalArray.length-1);
		
		return originalArray;
	}
	
	private void quickSort(int[] arr, int leftBound, int rightBound) {
		
		if(leftBound>=rightBound) {
			
			return;
		}
		
		
		int standard  = testSort(arr,leftBound,rightBound);
		
		quickSort(arr,leftBound,standard -1);
		quickSort(arr,standard+1,rightBound);
		
		
	}
	
	private int testSort(int[] arr,int leftBound,int rightBound) {
		
		
		int standard_index = rightBound;
		int flag = arr[rightBound];
		
		while(leftBound<rightBound) {
			
			while(leftBound<rightBound && arr[leftBound]<flag) {
				
				leftBound++;
				
			}
			
			while(leftBound<rightBound && arr[rightBound]>=flag){
				
				rightBound--;
			}
			
			if(leftBound<rightBound) {
				
				exchange(arr,leftBound,rightBound);
			}
		}
		
		exchange(arr,standard_index,leftBound);
		
		return leftBound;

		
	}
	
	
	
	public static void exchange(int[] arrary, int i, int j) {
			
			int tem = 0;
			
			tem = arrary[i];
			
			arrary[i] = arrary[j];
			
			arrary[j] = tem;
			
		}
	
					
}
 	


