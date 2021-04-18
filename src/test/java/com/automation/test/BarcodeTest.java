package com.automation.test;


import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class BarcodeTest {

    @Test
    public void readBarcode() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://barcode.tec-it.com/en");

        String barCodeURl = driver.findElement(By.tagName("img")).getAttribute("src");

        URL url=new URL(barCodeURl);
        BufferedImage bufferedImg = ImageIO.read(url);

        BufferedImageLuminanceSource luminanceSrc = new BufferedImageLuminanceSource(bufferedImg);

        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSrc));

        Result result = new MultiFormatReader().decode(binaryBitmap);

        System.out.println(result.getText());
    }
}
