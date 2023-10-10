package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AYZoVhca0SSgWPCTg2Sqq0_S5YsaJHiEUacMiASJ7GebGrET5J67hSymCi5GEpHSl7M88f2kbimifQ&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();

        //        click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

//        click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpBtn.click();
        privacyBtn.click();
//        Task1:
//        get the window handle of the mainpage i.e gmail.com and print it out on console

//         as our webdriver is curently focused on gmail page
//        we can use driver.getwindowshandle() to get the handle of the current page i.e gmail.com
        String gmailHandle=driver.getWindowHandle();
        System.out.println(gmailHandle);
             // Task2:
//        switch the focus of your webdriver to the privacy window

//        get all the handles and find the desired one
        Set<String> allHandles = driver.getWindowHandles();

//        loop through all the handles and find the one that is desired
        for(String handle:allHandles){
//            switch to the first handle in list
            driver.switchTo().window(handle);
//            get the title of the window on which the focus is
            String title = driver.getTitle();

//            check if the title matches ur desired title , if yes break the loop, if no repeat the process
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());






    }
}
