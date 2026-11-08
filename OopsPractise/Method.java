package OopsPractise;

class Calculator{
    //Method OverLoading
    public int add(int a, int b){

    return a+b;
    }
    public int add(int c, int d, int e){
        return c+d+e;
    }
    public double add(double f,double g){
        return f+g;
    }
}
//Inheritance Example
 abstract class Animal{
    public abstract void makeSound();
 }
 class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog is Braking");
    }
 }
 class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat is Crying");
    }
 }
 public class Method{
    public static void main(String[]args){
        //Example of Casting OverFlow
        Animal animal1=new Dog();
        animal1.makeSound();
        Animal animal2 =new Cat();
        animal2.makeSound();
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(2,3,4));
    }
 }
