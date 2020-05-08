package cn.itcast.order.test;

import cn.itcast.order.CountingOrder;
import cn.itcast.order.Order;

public class CountingOrderTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order counting = new CountingOrder();
		
		int[] a = {2,2,9,8,5,1,8,5};
		
		int[] b = counting.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}


	}

}
