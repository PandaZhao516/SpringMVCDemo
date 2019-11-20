package FunctionStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java7方法
		List<Dish> menu = new ArrayList<>();
		List<Dish> lowCaloricDishes = new ArrayList<>();
		List<Dish> Dishes = new ArrayList<>();
		//用累加器筛选元素
		for(Dish d: menu){
			if(d.getCalories()<400){
				lowCaloricDishes.add(d);
			}
		}
		
		//用匿名类对菜肴排序
		Collections.sort(lowCaloricDishes, new Comparator<Dish>(){

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
			
		});
		
		//处理排序后的菜名列表
		List<String> lowCaloricDishesName = new ArrayList<>();
		for(Dish d: lowCaloricDishes){
			lowCaloricDishesName.add(d.getName());
		}
		
		
		
		
		//Java8方法
//		List<String> lowCaloricDishesNames =
//			menu.parallelStream()
//				.filter(d -> d.getCalories()<400)//选出400卡路里以下的菜肴
//				.sorted(comparator(Dishes::getCalories))//按照卡路里排序
//				.map(Dish::getName)//提取菜肴的名称
//				.collect(toList());//将所有名称保存在List中
	}

}
