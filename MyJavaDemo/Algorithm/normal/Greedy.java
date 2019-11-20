/**

*@description TODO
*@author Panda

 */
package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月18日
 */
public class Greedy {
	public static void main(String[] args){
		HashMap<String,HashSet<String>> broadcasts = new HashMap<String,HashSet<String>>();
		broadcasts.put("K1", new HashSet<String>(Arrays.asList(new String[]{"ID","NV","UT"})));
		broadcasts.put("K2", new HashSet<String>(Arrays.asList(new String[] {"WA","ID","MT"})));
	    broadcasts.put("K3", new HashSet<String>(Arrays.asList(new String[] {"OR","NV","CA"})));
	    broadcasts.put("K4", new HashSet<String>(Arrays.asList(new String[] {"NV","UT"})));
	    broadcasts.put("K5", new HashSet<String>(Arrays.asList(new String[] {"CA","AZ"})));
	    
	  //需要覆盖的全部地区
        HashSet<String> allAreas = new HashSet<String>(Arrays.asList(new String[] {"ID","NV","UT","WA","MT","OR","CA","AZ"}));
        
        List<String> result = Algorithm(broadcasts,allAreas);
        System.out.println("selects:"+result);
	}
	
	public static List<String> Algorithm(HashMap<String,HashSet<String>> broadcasts,HashSet<String> allAreas){
		List<String> selects = new ArrayList<String>();
		HashSet<String> tempSet = new HashSet<>();
		String maxKey = null;
		
		while(allAreas.size()!=0){
			maxKey = null;
			for(String key : broadcasts.keySet()){
				tempSet.clear();
				HashSet<String> areas = broadcasts.get(key);
				tempSet.addAll(areas);
				//求出两个表的交集，此时tempSet会被赋值为交集的内容，所以此处使用临时变量
				tempSet.retainAll(allAreas);
				//如果该集合包含的地区数量比原来的多
				if(tempSet.size()>0&&(maxKey == null||tempSet.size()> broadcasts.get(maxKey).size())){
					maxKey = key;
				}
			}
			if (maxKey != null) {
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
		}
		return selects;
	}
}
