package thisandsuper;

public class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }

    void sleep() {
        super.sleep(); // Calls the sleep method of the parent class
        System.out.println("Dog is sleeping");
    }

    void play() {
        this.eat(); // Calls the eat method of the current class
        System.out.println("Dog is playing");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sleep();
        myDog.play();
    }
}
