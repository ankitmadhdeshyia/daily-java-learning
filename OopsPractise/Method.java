package OopsPractise;

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence(){
        System.out.println("Attendence marked By"+name);
    }
    void print(){
        System.out.println(name+" "+age+" "+rollNumber+" "+college);
    }
}

class Calculator {
    // Method OverLoading
    public int add(int a, int b) {

        return a + b;
    }

    public int add(int c, int d, int e) {
        return c + d + e;
    }

    public double add(double f, double g) {
        return f + g;
    }
}

// Inheritance Example
abstract class Animal {
    public abstract void makeSound();
    public abstract void eat();
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is Barking");
    }
    public void eat(){
        System.out.println("Dog Eat Grain and Other Animal");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is Crying");
    }
    public  void eat(){
        System.out.println("Cat eat Other Animal");
    }
}

public class Method {
    public static void main(String[] args) {
        // Example of Casting OverFlow
        Animal animal1 = new Dog();
        animal1.makeSound();
        Animal animal2 = new Cat();
        animal2.makeSound();
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3, 4));

        Student s1=new Student();
        Student s2=new Student();

        s1.name="Ankit";
        s1.age=12;
        s1.rollNumber=12;
        s1.college="It Microtek";

         s2.name="Ankita";
        s2.age=22;
        s2.rollNumber=13;
        s2.college="It Microtek";

        s1.markAttendence();
        s2.print();
        s2.markAttendence();
        s2.print();

    }
}
