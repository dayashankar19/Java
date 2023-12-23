public class LinkedList {
  int size;

  LinkedList() {
    this.size = 0;
  }

  public class Node {
    int data;
    Node next;

    Node(int x) {
      this.data = x;
      next = null;
      size++;
    }
  }

  Node head;

  public void insertFirst(int x) {
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
  }

  public void insertLast(int x) {
    Node temp2 = new Node(x);
    if (head == null) {
      head = temp2;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = temp2;
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("Linked list is empty.");
    }
    size--;
    Node node = head;
    head = node.next;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
    }
    Node node = head;
    while (node.next.next != null) {
      node = node.next;
    }
    node.next = null;
  }

  public void display() {
    Node node = head;
    while (node != null) {
      System.out.print(node.data + "-> ");
      node = node.next;
    }
    System.out.println("null");
  }

  public void reverse(Node x){
    Node node=head;
    while(size!=0)
      System.out.println(node.data);
      node=node.next;
    }
  }

  public void getSize() {
    System.out.println(size);
  }

  public static void main(String args[]) {
    LinkedList l = new LinkedList();
    l.insertFirst(20);
    l.insertLast(30);
    l.insertLast(40);
    l.insertLast(50);
    l.insertFirst(10);
    l.insertLast(60);
    l.deleteFirst();
    l.deleteLast();
    l.display();
    System.out.println();
    l.getSize();
    l.reverse(0);
    l.display();
  }
}
