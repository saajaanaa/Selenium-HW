package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*HW1: goto  http://35.175.58.98/handle-iframe.php
        click the checkbox
        then select the  babycat
        then enter topic name
         all of this must be done in the same order
*/public class HwIframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame("textfieldIframe");

        WebElement frameCheckBox = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frameCheckBox);
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement animalDropdown= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animalDropdown);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        driver.findElement(By.name("Topic")).sendKeys("abcdef");





    }
}
