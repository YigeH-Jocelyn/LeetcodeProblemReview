//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode holder = new ListNode(0);
      // Setup a place holder to memorize the initial (which is 0) and resulting link list.
          ListNode result = holder;
      // Set up a pointer to track the last node in the list, set to the place holder to share the same memory.
          int carry = 0;
      // Set up an initial variable to represent the the carry value during the calculation.

          while (l1 != null || l2 != null || carry != 0) {
            // Set up a conditions for the loop to run, where the link list should not be null.
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            // Assign a value to the digit for the following calculation, otherwise the digit will be 0 if the link list is null.
            int sum = num1 + num2 + carry;
            int num = sum % 10;
            carry = sum / 10;
            // Calculate the sum of the digits, the carry value of the previous sum of digits will be used to calculate the next sum.

            ListNode newNode = new ListNode(num);
            result.next = newNode;
            result = result.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            // This calculation will end if there is no more digits.
          } 
          
          return holder.next;

    }
}

