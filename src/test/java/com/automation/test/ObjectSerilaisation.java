package com.automation.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
    int age;
    String name;
    float height;
    String Profession;

    Person()
    {

    }
    Person(int s,String n,float h,String p)
    {
        age=s;
        name=n;
        height=h;
        Profession=p;
    }
    public String toString()
    {
        return "Age="+age+" Name="+name+" Height="+height+" Profession="+Profession;
    }

}


public class ObjectSerilaisation {

    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:/Users/Saif/Desktop/MyFile.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Person p=new Person(28,"Rohit",5.8f,"Teacher");

        oos.writeObject(p);

        fos.close();
        oos.close();
    }
}
