package com.automation.test;

import java.io.FileOutputStream;

public class FileIOTest {

    public static void main(String[] args) throws Exception
    {
        try(FileOutputStream fos=new FileOutputStream("C:/Users/Saif/Desktop/MyFile.txt"))
        {
            String str="My Output Stream";
            byte[] b = str.getBytes();

            fos.write(b);

            fos.close();
        }
    }
}
