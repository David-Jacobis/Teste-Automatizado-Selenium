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
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.io.File;
/**
 *
 * @author David
 */
public class Segundo_teste {
    public static void main(String[] args) {
WebDriver driver = new HtmlUnitDriver();

driver.get("http://www.google.com");

WebElement element = driver.findElement(By.name("q"));

element.sendKeys("Vai se Vai se Vai se tratar garota!");

element.submit();

System.out.println("O título da página é: " + driver.getTitle());

driver.close();
}
}
