/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.felipe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
/**
 *
 * @author David
 */
public class Primeiro_teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     File file = new File("C:\\Users\\David\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/webhp?complete=1&hl=en");

        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Executando teste com selenium");

        long end = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < end) {
            WebElement resultsDiv = driver.findElement(By.className("UUbT9"));

            if (resultsDiv.isDisplayed()) {
                break;
            }
    }
        
    }
}

