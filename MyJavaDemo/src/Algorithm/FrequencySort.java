package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {
	public String frequencySort (String s){
		Map<Integer,List<Character>> map = new HashMap<>();
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		int slow = 0,fast = 0;
		while(fast<chars.length){
			while(chars[fast]==chars[slow]){
				fast++;
			}
			if(map.get(fast-slow)==null){
				map.put(fast-slow, new ArrayList<>());
			}
			List<Character> charList = map.get(fast-slow);
			charList.add(chars[slow]);
			map.put(fast-slow, charList);
			slow = fast;
		}
		
		StringBuilder sb = new StringBuilder();
		List<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys,new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1 ;
			}
		});
		
		for(int key:keys){
			List<Character> CharacterList = map.get(key);
			for(char c : CharacterList){
				int count = key;
				while(count>0){
					sb.append(c);
					count--;
				}
			}
		}
		
		return sb.toString();
		
	}
}
