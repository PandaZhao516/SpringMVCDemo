/**
 * @Title StrockProfit.java
*@description TODO
*@time 2019年9月10日 上午10:20:45
*@author weis
*@version 1.0
 */
package Algorithm;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年9月10日
 */
public class StrockProfit {
	public int strockProfit(int[] price){
		Integer result = 0;
		for(int i = 0;i<price.length;i++){
			for(int j = i+1;j<price.length;j++){
				if(price[j]-price[i]>result){
					result = price[j]-price[i];
				}
			}
		}
		return result;
	}
	
	public int stockProfit2(int[] prices){
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i = 0;i<prices.length;i++){
			if (prices[i] <minprice){
				minprice = prices[i];
			}else if(prices[i]-minprice>maxprofit){
				maxprofit = prices[i] - minprice;
			}
		}
		
		return maxprofit;
		
	}

}
