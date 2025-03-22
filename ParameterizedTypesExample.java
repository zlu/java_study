// A simple generic class
class Box<T> {
  private T t;

  public void set(T t) {
      this.t = t;
  }

  public T get() {
      return t;
  }
}

public class ParameterizedTypesExample {
  public static void main(String[] args) {
      Box<String> stringBox = new Box<>();
      stringBox.set("Hello, World!");
      System.out.println(stringBox.get());

      Box<Integer> integerBox = new Box<>();
      integerBox.set(123);
      System.out.println(integerBox.get());
  }
}
