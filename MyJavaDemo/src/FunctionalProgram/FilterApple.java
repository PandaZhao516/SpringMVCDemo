package FunctionalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> inventory = Arrays.asList(new Apple("green",80),
											  new Apple("green",155),
											  new Apple("red",120));
		List<Apple> heavyApple = 
				filterApples(inventory,new AppleHeavyWeightPredicate());
		List<Apple> greenApple = 
				filterApples(inventory,new AppleColorPredicate());
		
		List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return "red".equals(apple.getColor());
			}
		});
		
//		List<Apple> redApples = 
//			    filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
		
		System.out.println(heavyApple);
	}
	
	//筛选绿苹果
	public static List<Apple> filterGreen(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	//根据颜色参数来适应变化
	public static List<Apple> filterAppleByColor(List<Apple> inventory,String color){
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory){
			if(apple.getColor().equals(color)){
				result.add(apple);
			}
		}//end for
		return result;
		
	}
	
	//根据多种多样的颜色和多种多样的重量来选择
	public static List<Apple> filterApplesByColor(List<Apple> inventory,int weight){
	    List<Apple> result = new ArrayList<>();
	    for(Apple apple: inventory){
	        if(apple.getWeight() > weight){
	            result.add(apple);
	        }
	    }  // end for
	    return result;
	}
	
	//利用笨拙的方法结合属性尝试
	public static List<Apple> filterApplesFool(List<Apple> inventory,String color,int weight, boolean flag){
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory){
			if((flag && apple.getColor().equals(color)) ||
		            (!flag && apple.getWeight() > weight)){
		            result.add(apple);
		    }
		}
		return inventory;		
	}
	
	//利用函数化编程思想改动后
	public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory){
			if(p.test(apple)){
				result.add(apple);
			}//end if
		}//end for
		return inventory;
		
	}
	
	//匿名类改善代码

}

