package cn.itcast.order.test;

import cn.itcast.order.Order;
import cn.itcast.order.SelectionOrder;

public class SelectionOrderTest {
	
	public static void main(String[] args) {
		
		Order selection = new SelectionOrder();
		
		int[] a = {3,2,6,4,5,1,8,7};
		
		int[] b = selection.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");
		}
		
	}

}
