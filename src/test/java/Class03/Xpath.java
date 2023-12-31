package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
     WebElement textBox1 =driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch16");
        //find the next text box and send keys
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");
        //send the security question
        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("whats the color of sun?");
        WebElement themagicalText= driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagicalText.getText());
        WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");
        //        get the email
        WebElement Email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("hello1@gmail.com");

        WebElement Email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("canicomin@gmail.com");

        WebElement Email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("welcome@gmail.com");

        WebElement Field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        Field1.sendKeys("cat");

        WebElement Field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        Field2.sendKeys("caterpillar");



    }
}
