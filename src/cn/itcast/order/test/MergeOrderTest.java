package cn.itcast.order.test;

import cn.itcast.order.MergeOrder;
import cn.itcast.order.Order;

public class MergeOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order merge = new MergeOrder();
		
		int[] a = {3,2,6,4,5,1,8,7};
		
		int[] b = merge.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}


	}

}
