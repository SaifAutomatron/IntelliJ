package com.automation.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PDFReadTest {

    @Test
    public void readPDf() throws IOException, IOException {

        URL url=new URL("file:///D:/bkupop3t/100-shortcuts-using-keyboard.pdf");

        InputStream is=url.openStream();
        BufferedInputStream bis=new BufferedInputStream(is);

        PDDocument document=PDDocument.load(is);

        String pdfContent=new PDFTextStripper().getText(document);

        System.out.println("Number of Pages="+document.getNumberOfPages());
        System.out.println(pdfContent);




    }
}
