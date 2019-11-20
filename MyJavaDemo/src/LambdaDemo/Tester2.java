package LambdaDemo;

import java.util.Arrays;
import java.util.List;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forEach(Arrays.asList(1,2,3,4,6), (Integer i)->System.out.println(i));
	}

	public static <T> void forEach(List<T> list,Consumer<T> c){
		for(T i:list){
			c.accept(i);
		}
	}
}
