import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

  public static void main(String[] args) {
    PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());
    pr.add(50);
    pr.add(20);
    pr.add(15);
    pr.add(40);
    pr.add(35);
    // System.out.println("Test" + pr);
    System.out.println("Peek element" + pr.peek());
    while (!pr.isEmpty()) {
      System.out.println(pr.poll());
    }
  }
}
