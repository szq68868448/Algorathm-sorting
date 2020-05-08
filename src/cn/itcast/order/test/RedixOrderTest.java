package cn.itcast.order.test;

import cn.itcast.order.Order;
import cn.itcast.order.RedixOrder;

public class RedixOrderTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order redix = new RedixOrder();
		
		int[] a = {18,7,6,5,443,3,21,17};
		
		int[] b = redix.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}

	}
	

}
