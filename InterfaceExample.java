// Interface
interface Animal {
    public void makeSound();  // explicitly declaring as public
}

// Implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void eat() {
        System.out.println("Dog eats.");
    }
}

class Cat implements Animal {
  @Override
  public void makeSound() {
      System.out.println("Cat meows.");
  }

  public void sleep() {
      System.out.println("Cat sleeps.");
  }
}

public class InterfaceExample {
  public static void main(String[] args) {
      Animal myDog = new Dog();
      Animal myCat = new Cat();

      myDog.makeSound(); // Output: Dog barks.
      myCat.makeSound(); // Output: Cat meows.

      // myDog.eat();
      Dog dog = (Dog) myDog;
      dog.eat();
  }
}

