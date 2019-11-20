package Algorithm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "I am a Person";
//		FrequencySort fs = new FrequencySort();
//		String r1 = fs.frequencySort(s);
//		System.out.println(r1);
		
//		int[] price = {7,1,5,3,6,4};
//		StrockProfit sp = new StrockProfit();
//		int s = sp.stockProfit2(price);
//		System.out.println(s);
		
		//根节点10
		TreeNode tn1 = new TreeNode(10);
		//根节点9
		TreeNode tn2 = new TreeNode(9);
		//根节点20
		TreeNode tn3 = new TreeNode(20);
		//根节点15
		TreeNode tn4 = new TreeNode(15);
		//根节点35
		TreeNode tn5 = new TreeNode(35);
		
		//根节点的左右节点
		tn1.setLeftNode(tn2);
		tn1.setRightNode(tn3);
		
		//20节点的左右节点
		tn3.setLeftNode(tn4);
		tn3.setRightNode(tn5);
		
		/*结束树节点初始化*/
		
		TreeNodeSort1 ts1 = new TreeNodeSort1();
		
		ts1.mediumTraverseBTree(tn1);
	}

}
