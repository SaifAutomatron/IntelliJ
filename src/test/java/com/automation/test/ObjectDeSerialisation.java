package com.automation.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectDeSerialisation {

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Saif/Desktop/MyFile.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Person p= (Person) ois.readObject();

        System.out.println(p);

        fis.close();
        ois.close();
    }
}
