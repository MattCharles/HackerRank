/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    if(head==null){
        head = new Node();
        head.data = data;
        return head;
    }
    Node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    temp.next = new Node();
    temp.next.data = data;
    return head;
}
