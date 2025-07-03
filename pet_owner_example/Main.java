import java.util.*;

public class Main {
  public static void main(String[] args) {
    Cat cat = new Cat("kedy", 4);
    Dog dog = new Dog("köpke", 2);
    Owner o1 = new Owner("omer", cat);
    Owner o2 = new Owner("faruk", dog);

    o1.interactWithPet();
    o2.interactWithPet();

    o1.introduce();
    o2.introduce();

    dog.makeSound();
    cat.makeSound();
  }
}

/*
 * 
 * Output:
 * 
 * Kitty plays with bla bla
 * Doggy plays with bla bla
 * Owner Info - Owner name: omer
 * Animal Info - Age: 4 Name: kedy type is Cat
 * Owner Info - Owner name: faruk
 * Animal Info - Age: 2 Name: köpke type is Dog
 * köpke says: Woof!
 * kedy says: Meow!
 * 
 * 
 */