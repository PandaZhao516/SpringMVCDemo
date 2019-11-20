/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019Äê9ÔÂ20ÈÕ
 */
public class mainForLinkedList {
	public static void main (String[] args){
		//initial param
		ListNode t1 = new ListNode(8);
//		t1.next = new ListNode(4);
//		t1.next.next = new ListNode(2);
		
		ListNode t2 = new ListNode(1);
		t2.next = new ListNode(2);
		t2.next.next = new ListNode(8);
		
		/**
		 * path160
		 */
		path160IntersectionOfTwoLinkedLists path160IntersectionOfTwoLinkedLists = new path160IntersectionOfTwoLinkedLists();
		ListNode l160 = path160IntersectionOfTwoLinkedLists.getIntersectionNode(t1, t2);
		
		while(l160!=null){
			System.out.println(l160.getVal());
			l160 = l160.next;
		}
			
		
	
		/**
		 * path2
		 */
//		path2AddTwoNumbers path2AddTwoNumbers = new path2AddTwoNumbers();
//		ListNode l1 = path2AddTwoNumbers.addTwoNumbers(t1, t2);
//		
//		while(l1!=null){
//			System.out.println(l1.getVal());
//			l1 = l1.next;
//		}
		/**
		 * path21
		 */
//		path21MergeTwoSortedLists path21MergeTwoSortedLists = new path21MergeTwoSortedLists();
//		ListNode l21 = path21MergeTwoSortedLists.mergeTwoLists(t1, t2);
//		
//		while(l21!=null){
//			System.out.println(l21.getVal());
//			l21 = l21.next;
//		}
		
	}
}
