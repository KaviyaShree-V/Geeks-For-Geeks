/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) 
    {
        // code here.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            return counter(slow, fast);
        }
        return 0;
    }
    int counter(Node slow, Node fast)
    {
        int count = 1; 
        Node faster = fast.next;
        while(slow != faster)
        {
            count++;
            faster = faster.next;
        }
        return count;
    }
}