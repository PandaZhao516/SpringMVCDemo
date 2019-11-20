package FunctionalProgram;

import java.util.ArrayList;
import java.util.List;

public class filterZZ {
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T e:list){
			if(p.test(e)){
				result.add(e);
			}//end if
		}//end for

		return result;	
	}
}
