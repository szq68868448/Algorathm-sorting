package cn.itcast.order.test;

import cn.itcast.order.Order;
import cn.itcast.order.QuickOrder;

public class QuickOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order quick = new QuickOrder();
		
		int[] a = {8,7,6,5,4,3,2,1};
		
		int[] b = quick.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}

	}

}
