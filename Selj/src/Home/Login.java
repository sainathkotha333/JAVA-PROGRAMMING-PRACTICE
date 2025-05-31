package Home;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", 
            "C:\\seleniuim webdriver\\Drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        
       // driver.findElement(By.id("email")).sendKeys("kothasainath2001@gmail.con");

        //driver.findElement(By.id("pass")).sendKeys("Sk@749133");
        WebElement k =driver.findElement(By.name("login"));
       // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
   String v=driver.getCurrentUrl();    
   String r=driver.getTitle(); 
   System.out.println(k);
   System.out.println(k.getText());


   
   
    }
}
///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button


//Thread.sleep(5000); // Pause for 5 seconds
//driver.quit(); // Close the browser


