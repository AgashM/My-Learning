package org.example.classandobjects;

import java.io.*;

//Serializable is a Marker Interface
class Learners implements Serializable {
    String learnerName;
    public Learners(String name){
        this.learnerName = name;
    }
    @Override
    public String toString() {
        return "Learners{" +
                "learnerName='" + learnerName + '\'' +
                '}';
    }
}

public class SerializableExample {
    public static void main(String[] args) {
        //Serialization - Create File and store convert the Object to Byte Stream
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Learners.ser"))){
            out.writeObject(new Learners("Agash"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization - Retrieve object from the saved file state as serialized
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Learners.ser"))){
            Learners s = (Learners) in.readObject();
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

