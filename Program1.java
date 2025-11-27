import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {

    // class for taking input from user
    Scanner scanner = new Scanner(System.in);
    // taking two numbers and an operator as input
    System.out.println("Enter firfst number :");
    double nums1 = scanner.nextDouble();
    System.out.println("Enter second number :");
    double nums2 = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Enter the operation :");
    String operation = scanner.nextLine();

    try {
      double result = getResult(nums1, nums2, operation);
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    scanner.close();
  }

  private static double getResult(double nums1, double nums2, String operation) throws Exception {

    if (operation.isBlank() || operation.length() == 0) {
      throw new Exception("Operation is required");
    }

    switch (operation.charAt(0)) {
      case '+':
        return nums1 + nums2;
      case '-':
        return nums1 - nums2;
      case '*':
        return nums1 * nums2;
      case '/':
        if (nums2 == 0)
          throw new ArithmeticException("Can not divide by zero");
        return nums1 / nums2;
      default:
        return 0;
    }

  }
}