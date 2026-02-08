package inheritance;
class AllVehicle{
    AllVehicle(){
        System.out.println("This is the Parent class");
    }
}
interface fare{
    void calculateFare();
}
class AllBus extends AllVehicle implements fare{
    AllBus(){
        System.out.println("This is the sub class of AllBus");
    }

    @Override
    public void calculateFare() {
        System.out.println("Bus Fare is calculated as per the distance");
    }
}
class AllCar extends AllVehicle{
    AllCar(){
        System.out.println("This is the sub class of AllCar");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("Hybrid Inheritance");
        AllCar car = new AllCar();
        AllBus bus = new AllBus();
        bus.calculateFare();
    }
}
