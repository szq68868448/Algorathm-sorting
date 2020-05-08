package cn.itcast.order.test;

import java.util.Arrays;

import cn.itcast.order.Order;
import cn.itcast.order.ShellOrder;

public class ShellOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order shell = new ShellOrder();
		
		int[] a = {3,2,6,10,4,5,13,88,4,1,8,19,7,20,3,17,54};
		
		int[] b = shell.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(b[i]+" ");

		}
		
		

	}

}
