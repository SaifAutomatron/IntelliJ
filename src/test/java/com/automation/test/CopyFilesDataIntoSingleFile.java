package com.automation.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyFilesDataIntoSingleFile
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Saif/Desktop/MyFile.txt");
        FileInputStream fis2=new FileInputStream("C:/Users/Saif/Desktop/MyFile2.txt");
        FileOutputStream fos=new FileOutputStream("C:/Users/Saif/Desktop/Combination.txt");

        SequenceInputStream sis=new SequenceInputStream(fis,fis2);


        int b;
        while((b=sis.read())!=-1)
        {
            fos.write(b);
        }

        fis.close();
        fis2.close();
        sis.close();
        fos.close();

    }
}
