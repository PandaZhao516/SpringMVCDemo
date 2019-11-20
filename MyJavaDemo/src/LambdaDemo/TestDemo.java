package LambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> I = mapDemo(Arrays.asList(0,5),(Integer i)->i+1);
		System.out.println(I.toString());
	}

	public static <R, T> List<R> mapDemo(List<T> list,Function<T,R> f){
		List<R> result = new ArrayList<>();
		for(T s :list){
			result.add(f.apply(s));
		}
		return result;
		
	}
}
