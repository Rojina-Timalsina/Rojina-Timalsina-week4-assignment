//Create a base class Animal with method makeSound().
//Subclasses: Dog, Cat, Cow override makeSound() to print specific animal sounds.
//Write a main method that stores different animals in an array and uses polymorphism to call makeSound() on each.
//File: AnimalSounds.java.


class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}


class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moos.");
    }
}


public class AnimalSounds {
    public static void main(String[] args) {
       
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}