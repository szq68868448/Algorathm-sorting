package cn.itcast.order.test;

import cn.itcast.order.BubbleOrder;
import cn.itcast.order.InsertionOrder;
import cn.itcast.order.Order;

public class InsertOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order insertion = new InsertionOrder();
		
		int[] a = {3,2,6,4,5,1,8,7};
		
		int[] b = insertion.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}


	}

}
