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
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummyNode = new ListNode(-1);
//         ListNode head = dummyNode;
//         int sum;
//         int carry;
//         ListNode next;
//         while(dummyNode != null){
       

//      System.out.println(dummyNode.val);
//             // dummyNode.next = dummyNode;
//             head = head.next;
//             if (head != null) {
//                 head.next = dummyNode;
//             }
//             dummyNode = head;
//             head = next;
//         }
//         sum = l1.val + l2.val;
//         carry = sum % 10;

//         ListNode number = new ListNode(sum / 10);
        
//          if (sum == carry) {
//             sum += carry;
//             return new ListNode(carry);
//          }
//          return number;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
//othr
            //    if(l1!=null)   l1 = l1.next;
            //    if(l2!=null)   l2 = l2.next

            // if(carry != 0){

            // }
//othr

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}
