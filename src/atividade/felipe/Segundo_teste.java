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
public class Segundo_teste {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\David\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.br/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Como realizar teste com Selenium");
        element.submit(); // Pesquisa Selenium no google

        driver.close();
}
}
