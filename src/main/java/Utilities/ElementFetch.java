package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import setupFramework.BaseResource;

import java.util.List;

public class ElementFetch extends BaseResource {

    static WebDriver driver;

    public static WebElement fetchElement(String webElement, String value){
        switch(webElement){
            case "id" : return driver.findElement(By.id(value));
            case "css" : return driver.findElement(By.cssSelector(value));
            case "xpath" : return driver.findElement(By.xpath(value));
            case "linktext" : return driver.findElement(By.linkText(value));
            case "name" : return driver.findElement(By.name(value));
            case  "tagname" : return driver.findElement(By.tagName(value));

        }
        return null;

    } public static List<WebElement> fetchElemens(String webElement, String value){
        switch(webElement){
            case "id" : return driver.findElements(By.id(value));
            case "css" : return driver.findElements(By.cssSelector(value));
            case "xpath" : return driver.findElements(By.xpath(value));
            case "linktext" : return driver.findElements(By.linkText(value));
            case "name" : return driver.findElements(By.name(value));
            case  "tagname" : return driver.findElements(By.tagName(value));

        }
        return null;
    }



}
