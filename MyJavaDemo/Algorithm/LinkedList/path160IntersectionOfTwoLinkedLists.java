/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年9月24日
 */
public class path160IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/**
		 * 消除长度差： 拼接两链表。
		 */
		ListNode ha = headA;
		ListNode hb = headB;
		while(ha!=hb){
			ha = (ha!=null)?ha.next:headB;
			hb = (hb!=null)?hb.next:headA;
		}
		return ha;
    }
}
