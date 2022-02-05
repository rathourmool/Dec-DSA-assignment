//  FindKthElementUsingSingleTraversal
package GeeksterDSA.Week4;

import GeeksterDSA.Week4.FindKthElementUsingTwoTraversal.Node;

public class FindKthElementUsingSingleTraversal {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static FindKthElementUsingSingleTraversal insert(FindKthElementUsingSingleTraversal list,int data) {
		Node new_node = new Node(data);
		
		if(head == null) {
			list.head = new_node;
		}
		else {
			Node curr = list.head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = new_node;
		}
		
		return list;
	}
	
	public static int kthElement(FindKthElementUsingSingleTraversal list,int element) {
		Node curr = list.head;
		int counter = 0;
		while(curr != null) {
			if(curr.data == element) {
				break;
			}
			else {
				curr = curr.next;
				counter++;
			}
		}
		
		if(curr == null) {
			System.out.print("element not found ");
			return 0;
		}
		
		return counter;
		
	}


	public static void main(String[] args) {
		FindKthElementUsingSingleTraversal list = new FindKthElementUsingSingleTraversal();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		list = insert(list,7);
		list = insert(list,8);
		list = insert(list,9);
		
		System.out.println(kthElement(list,10));

	}

}

// IntersectionOfTwoLinkedList

package GeeksterDSA.Week4;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
	
	}

}

//https://leetcode.com/problems/intersection-of-two-linked-lists/

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode curr = headA, prev = null;
    // Find the tail of list A
    while(curr != null) {
        prev = curr;
        curr = curr.next;
    }
    prev.next = headA;
    
    ListNode slow = headB, fast = headB;
    
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow) {
            curr = headB;
            while(curr != slow) {
                slow = slow.next;
                curr = curr.next;
            }
            
            prev.next = null;
            return slow;
        }
    }
    prev.next = null;
    return null;
}


// MergeTwoSortedList
package GeeksterDSA.Week4;

public class MergeTwoSortedList {

	public static void main(String[] args) {

	}
	
//	https://leetcode.com/problems/merge-two-sorted-lists/ 
	
/*	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode A = list1;
        ListNode B = list2;
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        while(A != null && B != null){
            if(A.val<=B.val){
                curr.next = A;
                A = A.next;
            }
            else if(A.val>B.val){
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
            
        }
        
        if(A != null){
            curr.next = A;
        }
        
        if(B != null){
            curr.next = B;
        }
        
        
        
        return head.next;
    } */

}
