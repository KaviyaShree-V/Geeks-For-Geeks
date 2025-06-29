/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) 
    {
        // Your code here.
        if(head == null)
        return 0;
        if(head.next == null)
        return head.data;
        
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        int div = count/2, pointer = 0,result = 0;
        temp = head;
        while(temp != null && temp.next != null)
        {
            if((pointer+1) == div)
            {
                result = temp.next.data;
                return result;
            }
            pointer++;
            temp = temp.next;
        }
        return result;
    }
}