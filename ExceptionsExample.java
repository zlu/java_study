public class ExceptionsExample {
  public static void main(String[] args) {
      try {
          int result = divide(10, 0);
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }

  public static int divide(int a, int b) {
      if (b == 0) {
          throw new ArithmeticException("Division by zero is not allowed.");
      }
      return a / b;
  }
}

