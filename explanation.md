# Generics and Parameterized Types

Generics in Java allow you to create classes, interfaces, and methods that can operate on different data types while still providing type safety. This means you can write a single piece of code that can work with multiple types, reducing code duplication and improving type safety.

## Key Concepts

1. **Type Parameters**: These are placeholders for actual types. They are defined using angle brackets (`<>`). For example, in `ArrayList<E>`, `E` is a type parameter.

2. **Parameterized Types**: These are types that use type parameters. For example, `ArrayList<String>` is a parameterized type where `String` is the actual type argument.

3. **Type Safety**: Generics ensure that only the correct type of objects can be added to a collection or used with a generic class/method. This helps catch type errors at compile-time rather than runtime.

## Example: Generic Class

Let's create a simple generic class called `Box` that can store any type of object.

```java
// Generic class with a type parameter T
class Box<T> {
    private T t; // T stands for "Type"

    // Method to set the value of t
    public void set(T t) {
        this.t = t;
    }

    // Method to get the value of t
    public T get() {
        return t;
    }
}
```

You can use this generic class with any type, such as   String  ,   Integer  , or even custom objects.

```java
public class GenericsExample {
    public static void main(String[] args) {
        // Creating a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("String Box contains: " + stringBox.get());

        // Creating a Box for Integers
        Box<Integer> integerBox = new Box<>();
        integerBox.set(12345);
        System.out.println("Integer Box contains: " + integerBox.get());
    }
}
```

Benefits of Generics
1. Type Safety: Generics ensure that only the correct type of objects can be added to a collection or used with a generic class/method. This helps catch type errors at compile-time rather than runtime.
2. Code Reusability: You can write a single generic class or method that can work with multiple types, reducing code duplication.
3. Improved Readability: Generics make it clear what types of objects a class or method is intended to work with.

## Example: Generic Method
You can also create generic methods that can operate on different types. Here's an example of a generic method that swaps the values of two elements in an array:

```java
public class GenericMethods {
    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Array of Strings
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        swap(stringArray, 0, 2);
        System.out.println("String Array after swap: " + java.util.Arrays.toString(stringArray));

        // Array of Integers
        Integer[] integerArray = {1, 2, 3};
        swap(integerArray, 0, 2);
        System.out.println("Integer Array after swap: " + java.util.Arrays.toString(integerArray));
    }
}
```

Wildcards in GenericsWildcards allow you to create more flexible generic methods and classes. There are three types of wildcards:
1. Unbounded Wildcard `(?)`: Represents an unknown type.
2. Lower Bounded Wildcard `(? super T)`: Represents a type that is a superclass of `T`.
3. Upper Bounded Wildcard `(? extends T)`: Represents a type that is a subclass of `T`.

### Unbounded Wildcard `(?)`: Represents an unknown type.
```java

public static void printList(List<?> list) {
    for (Object elem : list) {
        System.out.print(elem + " ");
    }
    System.out.println();
}
```

### Upper Bounded Wildcard `(<? extends T> )`: Represents an unknown type that is a subclass of `T`.
```java
public static void printNumbers(List<? extends Number> list) {
    for (Number elem : list) {
        System.out.print(elem + " ");
    }
    System.out.println();
}
```

### Lower Bounded Wildcard `(<? super T> )`: Represents an unknown type that is a superclass of `T`.
```java
public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 5; i++) {
        list.add(i);
    }
}
```
### Example: Using Wildcards

```java

public class WildcardsExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        // Using upper bounded wildcard
        printNumbers(intList); // Works because Integer is a subclass of Number

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList); // Works because Number is a superclass of Integer
        System.out.println("Number List: " + numberList);
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
}
```
Summary
- Generics allow you to create reusable and type-safe code by using type parameters.
- Parameterized Types are instances of generic classes or interfaces with specific type arguments.
- Wildcards provide flexibility in generic methods and classes by allowing unknown types with bounds.By using generics and parameterized types, you can write more robust, reusable, and type-safe code in Java.

