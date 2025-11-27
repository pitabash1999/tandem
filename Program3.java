import java.util.Scanner;

public class Program3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int ind = 1, prev = 0;
    while (ind <= x) {

      if (ind % 2 != 0) {
        if (ind == 1) {
          System.out.print(ind + ", ");
          prev = ind;
        } else {
          int cnt = 0;

          while (cnt < 2) {
            System.out.print(prev + 2 + ", ");
            prev += 2;
            cnt++;
          }
        }
      }
      ind++;

    }

    sc.close();
    ;

  }

}