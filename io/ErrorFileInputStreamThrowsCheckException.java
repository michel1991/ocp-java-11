package io;
import java.io.*;

class Bird {
    private String name;
    private transient Integer age;

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public  void setAge(Integer age){
        this.age = age;
    }

    public static void readTheObject(){
        try(var is = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("birds.dat")))) {
            Bird b = (Bird)is.readObject();
            System.out.println(b.age);
        }
    }
}

public class ErrorFileInputStreamThrowsCheckException {

    public static void main(String[] args) {
        Bird.readTheObject();
    }
}