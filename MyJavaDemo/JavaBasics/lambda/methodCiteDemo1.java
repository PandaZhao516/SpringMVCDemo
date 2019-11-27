/**

*@description TODO
*@author Panda

 */
package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月26日
 */
public class methodCiteDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("zhaoyaping","heiwenjie","yuanyue");
		list.forEach(value->System.out.println(value));
		list.forEach(System.out::println);
		
		/*
		 * 静态方法引用：类名：：静态方法名
		 * 实例方法引用：对象名（引用名）：：实例方法名
		 * 类方法引用：类名：：实例方法名
		 * 构造方法名： 类名：：new
		 */
		
		Mcd_Apple apple1 = new Mcd_Apple("红富士", "Red", 280);
		Mcd_Apple apple2 = new Mcd_Apple("哈哈", "Yello", 470);
		Mcd_Apple apple3 = new Mcd_Apple("普通", "Red", 320);
		Mcd_Apple apple4 = new Mcd_Apple("不错", "Green", 300);
		
		List<Mcd_Apple> listApple = Arrays.asList(apple1,apple2,apple3,apple4);
		
		//lambda表达式		
		//listApple.sort((Mcd_Apple a1,Mcd_Apple a2)-> {return new Double(a1.getWeight()-a2.getWeight()).intValue();});
		
		//静态表达式-静态方法名
		listApple.sort(Mcd_Apple::compareByWeight);
		
		//静态表达式-实例方法名
		Mcd_Apple mcd_Apple = new Mcd_Apple();
		listApple.sort(mcd_Apple::compareByWeight2);
		
		//静态表达式-类方法名
		listApple.sort(Mcd_Apple::compareByWeight3);
		
		listApple.forEach(apple -> System.out.println(apple));
		
		Mcd_Apple mcd_apple2 = new Mcd_Apple();
		//lambda表达式
		System.out.println(mcd_apple2.getString(()->{return new String();}));
		//构造方法引用形式
        System.out.println(mcd_apple2.getString(String::new));
		
	}

}
