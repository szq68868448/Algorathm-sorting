package cn.itcast.order;

public class MergeOrder implements Order {

	@Override
	public int[] sort(int[] originalArray) {
		// TODO Auto-generated method stub
		this.mergeSort(originalArray, 0, originalArray.length-1);
		
		return originalArray;
	}
	
	private void mergeSort(int[] arr, int left, int right) {
		
		if(left==right) {
			
			return;
		}
		
		int mid = left+(right-left)/2;
		
		mergeSort(arr,left,mid);
		
		mergeSort(arr,mid+1,right);
		
		merge(arr,left,mid+1,right);
		
		
		
	}
	
	public static void merge(int[] arr, int left, int right, int bound) {
		
		
		int i = left;
		int j = right;
		
		int k = 0;
		
		int tmp[] = new int[bound-left+1];
		
		while(i<right&&j<=bound) {
			
			if(arr[i]<=arr[j]) {
				
				tmp[k]=arr[i];
				i++;
			}else {
				
				tmp[k]=arr[j];
				j++;
				
			}
			
			k++;
		}
		
		while(i>=right&&j<=bound) {
			
			tmp[k]=arr[j];
			j++;
			k++;
		}
		
		while(i<right&&j>bound) {
			
			tmp[k]=arr[i];
			i++;
			k++;
		}
		
		for(int n=left;n<=bound;n++) {
			
			arr[n]=tmp[n-left];
		}
		
	}

	

}
