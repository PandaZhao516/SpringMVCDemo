package LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import FunctionalProgram.Apple;

public class AppleComparator implements Comparator<Apple> {

	@Override
	public int compare(Apple o1, Apple o2) {
		// TODO Auto-generated method stub
		return o1.getWeight()-o2.getWeight();
	}
	
	public static void main(String[] args){
		List<Apple> inventory = Arrays.asList(new Apple("green",80),
				  new Apple("green",155),
				  new Apple("red",120));
		//方案一
		inventory.sort(new AppleComparator());
		//方案二,匿名内部类
		inventory.sort(new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight()-o2.getWeight();
			}
			
		});
		//方案三，使用lambda表达式
		inventory.sort((a1,a2)->a1.getWeight()-a2.getWeight());
		
		//方法引用版
		//inventory.sort(comparing(Apple::getWeight));
	}

}
