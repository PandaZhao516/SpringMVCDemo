/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年9月20日
 */
public class path2AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	//初始化
		 	ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;
		    int carry = 0;
		    while (p != null || q != null) {
		    	//判空
		        int x = (p != null) ? p.val : 0;
		        int y = (q != null) ? q.val : 0;
		        //求值
		        int sum = carry + x + y;
		        //赋进位，赋当前值
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        //处理下一次进行的参数
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    //处理最后的进位
		    if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		    return dummyHead.next;	    
	 }
	 
}
