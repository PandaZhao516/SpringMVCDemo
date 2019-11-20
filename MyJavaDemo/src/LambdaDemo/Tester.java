package LambdaDemo;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> nonEmptyStringPredicate = (String s)->!s.isEmpty();
		List<String> listS = new ArrayList<>();
		listS.add("");
		listS.add("HELLO");
		List<String> nonEmpty = filter(listS,nonEmptyStringPredicate);
		System.out.println(nonEmpty.size());
	}

	public static <T> List<T> filter(List<T> list,Predicate<T> p){
		List<T> results = new ArrayList<>();
		for(T s: list){
			if(p.test(s)){
				results.add(s);
			}
		}
		return results;
	}
}
