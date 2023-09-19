public class LinkedList1 {

    public class Node {
      int data;
      Node next;
  
      Node(int x) {
        this.data = x;
        next = null;
      }
    }
  
    Node head;
  
    public LinkedList() {
      head = null;
    }
  
    public void insertFirst(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
    }
  
    public void insertLast(int x) {
      Node temp2 = new Node(x);
      if (head == null) {
        head = temp2;
        return;
      }
      Node last = head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = temp2;
    }
  
    public void display() {
      Node node = head;
      while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
      }
    }
  }
  
  public class Main {
  
    public static void main(String args[]) {
      LinkedList l = new LinkedList();
      l.insertFirst(10);
      l.insertLast(30);
      l.insertLast(40);
      l.insertLast(50);
      l.display(); // Output should be: 10 30 40 50
    }
  }
  