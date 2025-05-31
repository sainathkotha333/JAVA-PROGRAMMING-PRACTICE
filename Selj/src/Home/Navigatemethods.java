package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods

{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", 
            "C:\\seleniuim webdriver\\Drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        //driver.navigate().to("https://www.google.com/");
        
        WebElement k =driver.findElement(By.name("login"));
        
        System.out.println(k.getCssValue("background-color"));

}
}
