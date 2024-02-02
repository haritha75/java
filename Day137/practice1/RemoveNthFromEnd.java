class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      
      int count=0;
      ListNode cur=head;
      while(cur!=null) {
          count++;
          cur=cur.next;
      }
      if(count==n)
        return head.next;
      int n1=count-n;

      int i=1;
       cur=head;
      while(i<n1) {
          cur=cur.next;
          i++;
      }
      cur.next=cur.next.next;
      return head;
  }
}