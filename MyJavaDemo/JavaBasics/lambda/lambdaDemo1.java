/**

*@description TODO
*@author Panda

 */
package lambda;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月26日
 */
public class lambdaDemo1 {
	public static void main(String[] args){
		//1.1使用内部类
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello panda!");
			}
			
		}).start();
		
		//1.2使用lambda表达式
		new Thread(()->System.out.println("Hello panda2!")).start();
		
		//============================================================
		
		//2.1使用匿名内部类
		Runnable rac1 = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello panda3!");
			}
			
		};
		
		//2.2使用lambda表达式
		Runnable rac2 = ()->System.out.println("Hello panda1!"); 
		
		rac1.run();
		rac2.run();
	}
}
