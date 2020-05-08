package cn.itcast.order.test;

import cn.itcast.checker.Checker;
import cn.itcast.order.CountingOrder;
import cn.itcast.order.Order;

public class CheckerTest {
	
	public static void main(String[] args) {
		
		Checker checker = new Checker(100,20);
		
		//Order selection = new SelectionOrder();
		
//		Order bubble = new BubbleOrder();
		
//		Order insertion = new InsertionOrder();
		
//		Order shell = new ShellOrder();
		
//		Order merge = new MergeOrder();
		
//		Order quick = new QuickOrder();
		
		Order count = new CountingOrder();
		
		//System.out.println(checker.check(selection));
		
//		System.out.println(checker.check(bubble));
		
//		System.out.println(checker.check(insertion));
		
		
//		System.out.println(checker.check(shell));
		
//		System.out.println(checker.check(merge));
		
//		System.out.println(checker.check(quick));
		
		System.out.println(checker.check(count));
		
		
		
	}

}
