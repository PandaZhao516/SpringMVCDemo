/**

*@description TODO
*@author Panda

 */
package Algorithm;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019Äê9ÔÂ11ÈÕ
 */
public class TreeNode {
	int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int x) { val = x; }
    
    public void setLeftNode(TreeNode tn){
    	this.left = tn;
    }
    public void setRightNode(TreeNode tn){
    	this.right = tn;
    }
    
    public TreeNode getLeftNode(){
    	return this.left;
    }
    public TreeNode getRightNode(){
    	return this.right;
    }
}
