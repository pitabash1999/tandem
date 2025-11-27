import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enyer the size of the array :");
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i <= 9; i++) {
      for (int j = 0; j < size; j++) {
        if (arr[j] % i == 0) {
          map.put(i, map.getOrDefault(i, 0) + 1);
        }

      }
      if (!map.containsKey(i))
        map.put(i, 0);
    }

    System.out.println(map);
    sc.close();

  }
}
