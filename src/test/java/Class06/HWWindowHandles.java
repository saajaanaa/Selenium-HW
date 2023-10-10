package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HWWindowHandles {
    public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&passive=1209600&ifkv=AYZoVhfMiakiTXsS-s5tjnJcJmLh1LU9gFl3EEqI4Rk3viwRImYCxFEPJXlCsOaZlJSCTG9yvmxB5w&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
      driver.manage().window().maximize();

      WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
      WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
      WebElement termBtn= driver.findElement(By.xpath("//a[text()='Terms']"));

      helpBtn.click();
      privacyBtn.click();
      termBtn.click();
      //get the main page handle
        String mainPageHandle= driver.getWindowHandle();
        //get all handles
        Set<String>allHandles=driver.getWindowHandles();
        for(String handleX:allHandles){
            driver.switchTo().window(handleX);
            String title= driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Services - Privacy & Terms – Google")){
                break;

            }
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
