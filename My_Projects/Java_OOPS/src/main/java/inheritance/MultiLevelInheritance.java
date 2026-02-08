package inheritance;
class A{
    A(){
        System.out.println("This is a Top class");
    }
}
class B extends A{
    B(){
        System.out.println("This is a Mid class");
    }
}
class C extends B{
    C(){
        System.out.println("This is Down class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Multi Level Inheritance");
        C c = new C();
    }
}
