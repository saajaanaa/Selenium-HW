package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //        find the drop Down  or locate the drop down
        WebElement dropDown = driver.findElement(By.xpath("//Select[@id='select-demo']"));

//        create object of select class and pass in the dd element
        Select sel =new Select(dropDown);

//        use any method out of index()  , visibleTExt, byValue to select ur desried option

        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);
        sel.selectByValue("Tuesday");
        Thread.sleep(3000);
        sel.selectByIndex(2);




    }
}
