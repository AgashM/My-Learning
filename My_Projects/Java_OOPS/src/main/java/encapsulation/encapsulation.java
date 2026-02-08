package encapsulation;
class Student{
    private String name;

    public void setName(String studentName){
        this.name = studentName;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Student student = new Student();
        student.setName("Agash");
        System.out.println(student.getName());
    }
}
