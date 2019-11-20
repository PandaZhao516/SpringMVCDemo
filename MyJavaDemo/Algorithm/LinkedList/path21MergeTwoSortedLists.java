/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年9月23日
 */
public class path21MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		/**
		 * 第一次尝试失败啦
		 */
//		ListNode pre = new ListNode(-1);
//		ListNode result = pre;
//
//		while(l1!=null&&l2!=null){
//
//			int x = l1.val;
//			int y = l2.val;
//			if (x>=y){
//				result.next = l2;
//				l2 = l2.next;
//				
//			}else{
//				result.next = l1;
//				l1 = l1.next;
//			}
//			result = result.next;
//		}
//		result.next = (l1 == null)?l2:l1;
//		return pre.next;
		

        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;

		
		/**
		 * 方法一：递归
		 */
		
//		if(l1 == null){
//			return l2;
//		}
//		else if(l2 == null){
//			return l1;
//		}
//		else if(l1.val < l2.val){
//			l1.next = mergeTwoLists(l1.next,l2);
//			return l1;
//		}else{
//			l2.next = mergeTwoLists(l1,l2.next);
//			return l2;
//		}
		
		/**
		 * 方法二：迭代
		 */
//		ListNode preHead = new ListNode(-1);
//		ListNode pre = preHead;
//		
//		while(l1!=null&&l2!=null){
//			if(l1.val<l2.val){
//				pre.next = l1;
//				l1 = l1.next;
//			}else{
//				pre.next = l2;
//				l2 = l2.next;
//			}
//			pre = pre.next;
//		}
//		// exactly one of l1 and l2 can be non-null at this point, so connect
//        // the non-null list to the end of the merged list.
//		pre.next = (l1 == null)?l2:l1;
//		return preHead.next;
    }
}
