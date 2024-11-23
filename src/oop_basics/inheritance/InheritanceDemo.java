package oop_basics.inheritance;

public class InheritanceDemo {

        public static void main(String[] args) {
            Dog dog = new Dog("Buddy", 5, "Golden Retriever");
            System.out.println("Dog Name: " + dog.name);
            System.out.println("Dog Age: " + dog.age);
            System.out.println("Dog Breed: " + dog.getBreed());
            dog.makeSound();
            dog.fetch();
        }
}
