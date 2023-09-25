package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();

        // go to facebook.com
        driver.get("https://www.facebook.com");

        //maximize the window
        driver.manage().window().maximize();

        //find the email address
       WebElement email= driver.findElement(By.id("email"));
       email.sendKeys("sajana.shrestha@gmail.com");

       //find password
      WebElement password= driver.findElement(By.name("pass"));
      password.sendKeys("123ideal");

      //find the login button
     WebElement loginBtn =driver.findElement(By.name("login"));
     loginBtn.click();

    }
}
