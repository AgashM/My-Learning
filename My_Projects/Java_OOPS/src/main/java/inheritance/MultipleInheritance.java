package inheritance;
interface Principal{
    default void pInfo(){
        System.out.println("Interface 1 is called");
    }
}
interface VicePrincipal{
    default void vpInfo(){
        System.out.println("Interface 2 is called");
    }
}
class Student implements Principal, VicePrincipal{
    Student(){
        System.out.println("This is Student class");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
        Student student = new Student();
        student.pInfo();
        student.vpInfo();
    }
}
