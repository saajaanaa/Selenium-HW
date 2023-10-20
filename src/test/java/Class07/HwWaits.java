package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HwWaits extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement buttonAlert = driver.findElement(By.xpath("//button[@id='show_alert']"));
        buttonAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //alert
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        // TEXT
        WebElement buttonText = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        buttonText.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Ssyntaxtechs']")));
        WebElement text=driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']"));
        String text1= text.getText();
        System.out.println(text1);
        //CLİCK TO GET HİDDEN BUTTON

        WebElement enableBtnBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtnBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        enableBtn.click();

        //click to get tge checkbox selected and print if it is selected or not

        WebElement checkBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBtn.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        boolean status = checkBox.isSelected();
        if (status) {
            System.out.println("selected");
        } else {
            System.out.println("not seleceted");
        }
        closeBrowser();

    }
}


