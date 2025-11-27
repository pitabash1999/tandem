import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int nums1 = sc.nextInt();

    int ind = 1, prev = 0;

    while (ind <= nums1) {
      System.out.print(prev + ind + ", ");
      prev = ind;
      ind++;
    }

    sc.close();

  }
}
