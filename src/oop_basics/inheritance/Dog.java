package oop_basics.inheritance;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    public String getBreed() {
        return breed;
    }
}
