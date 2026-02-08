package inheritance;

class Vehicle{
    String vehName;
    Vehicle(){
        System.out.println("This is Vehicle class");
    }
}
class Bus extends Vehicle{
    Bus(String name){
        this.vehName = name;
        System.out.println("This is Bus class");
    }
}
class Bike extends Vehicle{
    Bike(){
        System.out.println("This is Bike class");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        Bus bus = new Bus("Volvo");
        Bike bike = new Bike();

        System.out.println(bus.vehName);
    }
}
