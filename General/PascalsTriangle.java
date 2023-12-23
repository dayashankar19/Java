import java.util.Scanner;

public class PascalsTriangle {

  //This function to to access specific value by defining row and col number from the pascal triangle
  public int val(int row, int col) {
    int res = 1;
    for (int i = 0; i < col; i++) {
      res = res * (row - i);
      res = res / (i + 1);
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    PascalsTriangle obj = new PascalsTriangle();
    System.out.println(obj.val(row-1, col-1));
  }
}
