/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode node= head;
        ListNode nodeOdd= head;
        
        ListNode rootEven= head.next;
        ListNode nodeEven = head.next;
        int n=2;
        node=node.next;
        while(node!=null){
            System.out.println("Hello"+node.val+" "+n);
            if(n==2)
                System.out.println(node.val);
            else if(n%2 == 0){
                nodeEven.next=node;
                nodeEven=nodeEven.next;
                System.out.println("Even"+node.val);
            }
            else{
                System.out.println("odd"+node.val);
                nodeOdd.next=node;
                nodeOdd=nodeOdd.next;
            }
            n++;
            node= node.next;
                
        }
        nodeEven.next=null;
        nodeOdd.next=rootEven;
        return head;
        
    }
}