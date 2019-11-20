/**

*@description TODO
*@author Panda

 */
package Algorithm;

import java.util.ArrayList;
import java.util.List;





/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年9月11日
 */
public class TreeNodeSort1 {
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<>();
		helper(root,res);
		return res;
	}

	/**
	 * @param root
	 * @param res
	 */
	private void helper(TreeNode root, List<Integer> res) {
		// TODO Auto-generated method stub
		if (root != null) {
            if (root.getLeftNode() != null) {
                helper(root.getLeftNode(), res);
            }
            res.add(root.val);
            if (root.getRightNode() != null) {
                helper(root.getLeftNode(), res);
            }
        }

	}
	
	
	/**
	 * 先序遍历
	 */
	public void preTraverseBTree(TreeNode tn){
		if(tn!= null){
			//访问根节点
			System.out.println("访问根节点"+tn.val);
			//访问左节点
			preTraverseBTree(tn.getLeftNode());
			preTraverseBTree(tn.getRightNode());
		}
	} 
	
	/**
	 * 中序遍历
	 */
	
	public void mediumTraverseBTree(TreeNode tn){
		if(tn!=null){
			preTraverseBTree(tn.getLeftNode());
			System.out.println("访问节点:"+tn.val);
			preTraverseBTree(tn.getRightNode());
		}
	} 

}

