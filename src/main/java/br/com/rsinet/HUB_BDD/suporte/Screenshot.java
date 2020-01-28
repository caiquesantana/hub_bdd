package br.com.rsinet.HUB_BDD.suporte;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	public static WebDriver driver;
	   
    public static void tirarPrint(String nomeDaImagem, WebDriver driver) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String imageFileDir = "C:\\Users\\caique.oliveira\\Pictures\\BDD\\Prints";
        FileUtils.copyFile(srcFile, new File(imageFileDir, nomeDaImagem + timestamp() + ".png"));
    }
        public static String timestamp() {
            return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        }
       
}
