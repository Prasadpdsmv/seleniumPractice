import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;

public class wepageload {
    WebDriver driver;

    @Test
    public void webpage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver= new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.flipkart.com/");
        Thread.sleep(10000);
            driver.findElement(By.xpath("//span[contains(text(), 'Mobiles & Tablets')]")).click();

            WebElement el1=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/100/100/image/885b0231ba654e4b.jpg?q=50']"));

            Thread.sleep(10000);

            //el1.click();


          //  WebElement scroll=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/e483f18af4c3b3c9.jpg?q=50']"));



        /*    Actions act=new Actions(driver);

            act.moveToElement(scroll).perform();*/

        JavascriptExecutor jspex= (JavascriptExecutor)driver;

        //jspex.executeScript("arguments[0].scrollIntoView();",scroll);
        jspex.executeScript("window.scrollBy(0,550)","");

        TakesScreenshot screenshot = (TakesScreenshot)driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
    }
}
