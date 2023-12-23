class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class ReverseLL {

  public static void displayLL(Node head) {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    //second node created
    Node secondNode = new Node(20);
    head.next = secondNode;
    //third node created
    Node thirdNode = new Node(30);
    secondNode.next = thirdNode;
    thirdNode.next = null;
    //Now print the linked list
    displayLL(head);
  }
}
