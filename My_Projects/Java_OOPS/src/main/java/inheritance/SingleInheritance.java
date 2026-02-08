package inheritance;
class Animal{
    Animal(){
        System.out.println("This is parent class");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("This is subclass");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Dog dog = new Dog();
    }
}
