/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.felipe;
import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author David
 */
public class Terceiro_teste {
    public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com/webhp?complete=1&hl=en");

WebElement query = driver.findElement(By.name("q"));
query.sendKeys("macaco");

long end = System.currentTimeMillis() + 5000;
while (System.currentTimeMillis() < end) {
WebElement resultsDiv = driver.findElement(By.className("sbdd_b"));

if (resultsDiv.isDisplayed()) {
break;
}
}
List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='sbqs_c']"));

for (WebElement suggestion : allSuggestions) {
System.out.println(suggestion.getText());
}
    }
}