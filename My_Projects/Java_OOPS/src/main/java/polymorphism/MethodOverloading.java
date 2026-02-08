package polymorphism;
class Maths {
    Maths(){
        System.out.println("Maths is called");
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        System.out.println("Method Overloading | Compile Time Polymorphism");
        Maths math = new Maths();
        math.add(1,2);
        math.add(1,2,3);
    }
}
