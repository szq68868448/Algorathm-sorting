package cn.itcast.order;

public class SelectionOrder implements Order {
	

	@Override
	public int[] sort(int[] originalArray) {
		
		
		
		for(int i=0;i<originalArray.length-1;i++) {
			
			int minPos = i;    //默认认为数组中的第一个值最小，minPos用来记录最小值的index
			
			for(int j=i+1;j<originalArray.length;j++) {
				
				if(originalArray[j]<originalArray[minPos]) {
					
					minPos=j;           //如果当前的最小值小于数组中的其他值，则更新minPos
				}
				
			}
			
			//System.out.println("找了第"+i+"个值，它的位置在" + minPos);
			
			int tem = originalArray[i];
			originalArray[i]=originalArray[minPos];
			originalArray[minPos]=tem;
			
			//System.out.println("将第"+i+"个值与第" + minPos +"个值交换位置");
			
		}
		
		System.out.println("排序完毕");
		
		return originalArray;
		
	}

}
