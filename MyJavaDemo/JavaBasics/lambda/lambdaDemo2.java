/**

*@description TODO
*@author Panda

 */
package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月26日
 */
public class lambdaDemo2 {
	public static void main(String[] args){
		String[] friends = {"heiwenjie","zhaoyaping","yuanyue","liuheng","liuchenzhe","wangqiong"};
		
		//1.1利用匿名内部类排序friends
		Arrays.sort(friends, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1.compareTo(o2));
			}
		});
		
		Arrays.sort(friends, (String o1, String o2)->o1.compareTo(o2));

		
		//========================================================================================
		
		//2.1使用匿名内部类，根据name的length排序
		Arrays.sort(friends,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1.length()-o2.length());
			}
			
		});
		
		Arrays.sort(friends, (String o1,String o2)->(o1.length()-o2.length()));
		
		//========================================================================================
		//3.1使用匿名内部类，根据最后一个字母排序
		Arrays.sort(friends, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.charAt(o1.length()-1)- o2.charAt(o2.length()-1);
			}
			
		});
		
		//3.2使用lambda表达式实现,调用方法的参数必须是一个类，这个接口类里只能有一个抽象方法
		Arrays.sort(friends,(String o1, String o2)->o1.charAt(o1.length()-1)- o2.charAt(o2.length()-1));
		
		for(String a:friends){
			System.out.println(a);
		}
		
	}
}
