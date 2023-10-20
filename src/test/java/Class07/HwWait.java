package Class07;
/*hw1:http://35.175.58.98/synchronization-explicit-wait.php
 click to open alert and handle it
 click to change text and get the changed text
 click to get hidden button click on it
 click to get tge checkbox selected and print if it is selected or not
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HwWait extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//    open alert and handle it
        WebElement alert =driver.findElement(By.xpath("//button[@id='show_alert']"));
        alert.click();

       WebElement text = driver.findElement(By.xpath("//p[text()='Alert opens in : ']"));
       String text1=text.getText();
        System.out.println(text1);

  //         click to change text and get the changed text
        WebElement clickCheckBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        clickCheckBoxBtn.click();
//        wait until the checkbox is selected
//        then get the state of the checkbox

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        boolean stateOfCheckBox = driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
        System.out.println(stateOfCheckBox);

        //        click on the button to change the text
        WebElement changeTextBtn = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTextBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));

        String text2 = driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']")).getText();
        System.out.println(text2);

        /**driver.navigate().refresh();
        WebDriverWait waitForText=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement ele = driver.findElement(By.xpath("//p[text()='Text Changed in : ']"));
        waitForText.until(ExpectedConditions.visibilityOf(ele));
        WebElement changeTextBtn =driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTextBtn.click();

        WebElement changedText =driver.findElement(By.xpath("//h2[@id='headingtext']"));
        changedText.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(changedText,"Ssyntaxtechs"));
        String changedText1=changedText.getText();
        System.out.println(changedText1);*/

  //    click to get hidden button click on it
        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtn.click();
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();

//       click to get tge checkbox selected and print if it is selected or not
        WebElement clickCheckBoxBtn1 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        clickCheckBoxBtn.click();
//        wait until the checkbox is selected
//        then get the state of the checkbox

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        boolean stateOfCheckBox1 = driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
        System.out.println(stateOfCheckBox);



    }
}
