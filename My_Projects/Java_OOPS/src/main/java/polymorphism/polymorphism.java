package polymorphism;

import javax.swing.event.TreeWillExpandListener;

class WildAnimal{
    void sound(){
        System.out.println("Wild Animal Sounds");
    }
}
class Tiger extends WildAnimal{
    Tiger(){
        System.out.println("Class Tiger is called");
    }

    @Override
    void sound() {
        System.out.println("Tiger Sounds");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        WildAnimal animal = new Tiger();
        animal.sound();
    }
}
