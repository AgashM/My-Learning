package classandobject;

class Student{
    public Student(){
    }
}

public class Reflection {
    public static void main(String[] args) {
        try
        {
            Class<?> c = Class.forName("classandobject.Student");
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
