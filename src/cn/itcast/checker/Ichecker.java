/**
 * 
 */
package cn.itcast.checker;

import cn.itcast.order.Order;

/**
 * @author shaozhenqiang
 * @description 所有的对数器需要实现此接口
 */
public interface Ichecker {
	
	public boolean check(Order order);
	

}
