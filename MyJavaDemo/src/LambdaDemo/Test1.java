package LambdaDemo;

import java.util.Comparator;

import FunctionalProgram.Apple;

public class Test1 {
	public static void main(String[] args){
		Comparator<Apple> byWeight = new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight();
			}
			
		};
		
		Comparator<Apple> byWeight2 = (Apple a1,Apple a2) -> a1.getWeight();
		 
		//第一个表达式，具有一个String类型的参数并返回一个int.Lambda没有return语句，因为已经隐含了return
		//(String) s -> s.length();
		
		//传入一个类型为Apple的参数，返回苹果的重量是否超过150
		//(Apple a) -> a.getWeight() >150;
		
		//两个int型的参数，没有返回值
//		(int x,int y) -> {
//			System.out.println("resutlt:");
//			System.out.println(x+y);
//		}
		
		//没有参数返回一个int
//		() -> 42
		
		//两个apple参数，返回比较的值
		//		(Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
		
		
		Runnable r1 = () -> System.out.print("HelloWorld");//使用lambda
		Runnable r2 = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("HelloWorld2");
			}
			
		};
		
		process(r1);
		process(r2);
		
		process(()->{System.out.print("HelloWorld0");});
		
	}
	public static void process(Runnable r){
		r.run();
	}
	
	
	
}
