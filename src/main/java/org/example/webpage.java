package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class webpage {


    WebDriver driver;
    public void webpage(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[contains(text(), 'Mobiles & Tablets')]")).click();

        WebElement el1=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/c34c09965059134b.jpg?q=50']"));

        WebElement scroll=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/e483f18af4c3b3c9.jpg?q=50']"));

        Actions act=new Actions(driver);

        act.moveToElement(scroll).perform();


    }
}
