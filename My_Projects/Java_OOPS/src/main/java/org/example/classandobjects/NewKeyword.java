package org.example.classandobjects;

class Dog{
   String name;
   int id;
   public Dog(String name, int id){
       this.name = name;
       this.id = id;
   }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class NewKeyword {
    public static void main(String[] args){
        Dog fluffy = new Dog("Fluffy",1);
        System.out.println(fluffy);
    }
}
