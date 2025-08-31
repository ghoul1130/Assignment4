abstract class Animal {
    protected String name;
    protected int age;
    private static int counter = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getAnimalCount() {
        return counter;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();
    public abstract void move();
}

// Interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}


class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }
    public void makeSound() { System.out.println(name + " chirps!"); }
    public void move() { System.out.println(name + " hops around."); }
    public void fly() { System.out.println(name + " is flying high."); }
}

class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }
    public void makeSound() { System.out.println(name + " makes bubbly sounds."); }
    public void move() { System.out.println(name + " swims gracefully."); }
    public void swim() { System.out.println(name + " is swimming in water."); }
}

class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }
    public void makeSound() { System.out.println(name + " quacks!"); }
    public void move() { System.out.println(name + " waddles around."); }
    public void fly() { System.out.println(name + " is flying short distances."); }
    public void swim() { System.out.println(name + " is swimming in the pond."); }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() { System.out.println(name + " meows!"); }
    public void move() { System.out.println(name + " prowls silently."); }
}

// ZooKeeper
class ZooKeeper {
    public void feedAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void makeAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
