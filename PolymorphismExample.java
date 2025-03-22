// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample {
  public static void main(String[] args) {
      Animal myDog = new Dog();
      Animal myCat = new Cat();

      myDog.makeSound(); // Output: Dog barks.
      myCat.makeSound(); // Output: Cat meows.
  }
}
