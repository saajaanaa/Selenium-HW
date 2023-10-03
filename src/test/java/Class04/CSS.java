package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();
        WebElement profileID=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Sajana123");

        WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("Hello");

        WebElement feedBackJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
          feedBackJenny.sendKeys("Website is not working");

          WebElement feedBackRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
          feedBackRaj.sendKeys("Website is working");

        //        contains method to fill course topic
        WebElement courseTopics = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

        //using starts with
        WebElement introtoAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");

        //        ends with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");



    }

    public static class RadioButtons {
        public static void main(String[] args) {
            WebDriver driver= new ChromeDriver();
            driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
            driver.manage().window().maximize();

            //        find the element
            WebElement radioBtnMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
            radioBtnMale.click();

            //       check if you were able to select the option or not
            boolean status = radioBtnMale.isSelected();
            if(status){
                System.out.println("the radio button male was selected");
            }
            else {
                System.out.println("the radio button male was not selected");
            }
            //check if the male radio button is enabled
            //        check if the male radio button is enabled
            boolean btnEnableStatus = radioBtnMale.isEnabled();
            System.out.println("the male radio button is enabled " + btnEnableStatus);

            //        check if the male radio button is displayed
            boolean btnisDisplayedStatus = radioBtnMale.isDisplayed();
            System.out.println("the male radio button is displayed " + btnisDisplayedStatus);

            //from the age range select 15-50
    //        find all the elements that have the age range
            List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));

            for(WebElement ageRange:ageRanges){
    //            get the value of the attribute "value"
                String option = ageRange.getAttribute("value");
                if(option.equalsIgnoreCase("15 - 50")){
                    ageRange.click();
                }
            }




        }
    }
}
