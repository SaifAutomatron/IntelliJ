package com.automation.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDataCopy {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Saif/Desktop/MyFile.txt");
        FileOutputStream fos=new FileOutputStream("C:/Users/Saif/Desktop/MyFile2.txt");

        int b;
        while((b=fis.read())!=-1)
        {
            if(b>=65 && b<=120)
            fos.write(b+32);
            else fos.write(b);
        }

        fis.close();
        fos.close();

    }
}
