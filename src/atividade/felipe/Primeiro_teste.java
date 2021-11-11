/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.felipe;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    public static void main(String[] args) {
     abrirChrome();
    }
        private static void abrirChrome() {
    File file = new File("/Users/David/Downloads/chromedriver_win32/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    WebDriver driver = new ChromeDriver();
    driver.get("https://github.com/David-Jacobis");
    String i = driver.getCurrentUrl();
    System.out.println(i);
    driver.close();
        }
}
