package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
        Check if the "Female" radio button is displayed.
        Click on the "Show Button".
        Check again if the "Female" radio button is displayed or not.
        Print the results of the checks to the console.*/
public class HWRadiobutton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        Thread.sleep(4000);
        WebElement femaleRadiobtn= driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean femaleStatus = femaleRadiobtn.isDisplayed();
        System.out.println("Display Status :"+femaleStatus);


        WebElement Showbtn=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        if(femaleStatus){
            Showbtn.click();
        }
        Thread.sleep(2000);
        boolean checkAgain=femaleRadiobtn.isDisplayed();
        System.out.println("Check the status again :"+ checkAgain);

        Thread.sleep(3000);
        driver.quit();
    }
}
