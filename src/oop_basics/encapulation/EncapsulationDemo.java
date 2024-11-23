package oop_basics.encapulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student student = new Student(1, "John", 20);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        student.setId(2);
        student.setName("Jane");
        student.setAge(21);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

}
