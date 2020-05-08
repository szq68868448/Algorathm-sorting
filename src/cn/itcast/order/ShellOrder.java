package cn.itcast.order;

public class ShellOrder implements Order {
	
	
	
	private void swap(int[]arr, int a, int b){
		
		int tmp;
		
		tmp =arr[a];
		arr[a] = arr[b];
		arr[b]=tmp;
		
	}

	@Override
	public int[] sort(int[] originalArray) {
		// TODO Auto-generated method stub
		
		int h=1;
		
		while(h<=originalArray.length/3) {
			
			h=3*h+1;
		}
		
		for(int gap=h;gap>0;gap=(gap-1)/3) {
			
			for(int i=gap;i<originalArray.length;i++) {
				
				for(int j=i;j>gap-1;j=j-gap) {
					
					if(originalArray[j]<originalArray[j-gap]) {
						
						swap(originalArray,j,j-gap);
						
						
					}else {
						
						break;
					}
				}
				
			}
			
			
		}
		
		
		return originalArray;
		
		
	}

}
