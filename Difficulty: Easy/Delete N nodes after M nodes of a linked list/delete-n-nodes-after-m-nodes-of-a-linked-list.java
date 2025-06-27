/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution 
{
    static void linkdelete(Node head, int n, int m) 
    {
        // your code here
        if(head == null)
        return;
        Node temp = head;
        Node delete;
        while(temp != null)
        {
            for(int i=1; i<m && temp != null; i++)
            {
                temp = temp.next;
            }
            if(temp == null)
            return;
            delete = temp.next;
            for(int i=1; i<=n && delete != null; i++)
            {
                delete = delete.next;
            }
            temp.next = delete;
            temp = delete;
        }
    }
}