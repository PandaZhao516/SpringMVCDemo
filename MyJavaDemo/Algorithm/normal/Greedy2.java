/**

*@description TODO
*@author Panda

 */
package normal;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月3日
 */
public class Greedy2 {

	/**
	 * @param args
	 * 从问题的某一初始解出发
	 * while(能朝给定方向总目标前进一步){
	 * 	利用可行的决策，求出可行解的一个解元素
	 * }
	 * 由所有解元素组合成问题的一个可行性解
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greedyGiveMoney(280);
	}
	
	public static void greedyGiveMoney(int money){
		System.out.println("需要找零"+money+"元！");
		int[] moneyLevel = {1,5,10,20,50,100};
		for(int i = moneyLevel.length-1;i>=0;i--){
			int num = money/moneyLevel[i];
			int mod = money%moneyLevel[i];
			money = mod;
			if(num>0){
				System.out.println("需要找零"+num+"张"+moneyLevel[i]+"元钱");
			}		
		}
	}
}
