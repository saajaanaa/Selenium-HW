package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();


        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
//        if it is selected after click
        boolean selectState = checkBox1.isSelected();
        if(selectState){
            System.out.println("the checkbox is selected");
        }
        else{
            System.out.println("the checkbox isn't selected");
        }
        //        select  all options
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkBox:checkBoxes){
//            click on it
            checkBox.click();

        }
        //       deselect option 3
        for(WebElement checkBoxAgain:checkBoxes){
//            to verify what is the option
            String option = checkBoxAgain.getAttribute("value");
            if(option.equalsIgnoreCase("Option-3")){
                checkBoxAgain.click();
            }

        }
    }
    }

