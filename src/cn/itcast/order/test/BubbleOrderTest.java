package cn.itcast.order.test;

import cn.itcast.order.BubbleOrder;
import cn.itcast.order.Order;

public class BubbleOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order bubble = new BubbleOrder();
		
		int[] a = {3,2,6,4,5,1,8,7};
		
		int[] b = bubble.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}

	}
}
