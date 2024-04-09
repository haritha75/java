class Solution {
  public ListNode swapPairs(ListNode head) {
     if (head == null || head.next == null) 
      return head;
  
      ListNode Node=head;
      while(Node.next!=null)
      {

          int num=Node.val;
          Node.val=Node.next.val;
          Node.next.val=num;
          

          if(Node.next.next!=null)
              Node=Node.next.next;
          else
              Node=Node.next;
      }
      
      return head;
  }
}