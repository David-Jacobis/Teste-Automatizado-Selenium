/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.felipe;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author David
 */
public class Terceiro_teste {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\David\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
           String login = "YOUR_LOGIN";
    String password = "YOUR_PASSWORD";

       WebDriver driver = new ChromeDriver();

       driver.get("https://www.facebook.com/");

       driver.findElement(By.id("email")).sendKeys(login);
       driver.findElement(By.id("pass")).sendKeys(password);

       driver.findElement(By.name("login")).click();
    }
}