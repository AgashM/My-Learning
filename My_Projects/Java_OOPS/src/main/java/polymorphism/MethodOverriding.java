package polymorphism;
class A{
    void display(){
        System.out.println("class A is displayed");
    }
}
class B extends A{
    void display(){
        System.out.println("class B is displayed");
    }
}
class C extends A{
    void display(){
        System.out.println("class C is displayed");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        System.out.println("Method Overriding | Run Time Polymorphism");
        A a;
        a= new A();
        a.display();
        a = new B();
        a.display();
        a = new C();
        a.display();
    }
}
