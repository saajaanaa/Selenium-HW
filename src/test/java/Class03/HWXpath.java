package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Sajana");

        WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("sajana111@gmail.com");

        WebElement currentAdd=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdd.sendKeys("Virginia, USA");

        WebElement permanentAdd=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAdd.sendKeys("Gainesville VA, USA");

        WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit.click();
    }


}
