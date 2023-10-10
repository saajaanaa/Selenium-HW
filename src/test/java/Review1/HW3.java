package Review1;
/*Navigate to http://35.175.58.98/basic-checkbox-demo.php.
        Check the if Checkbox1 is enabled
        If Checkbox1 is disabled:
        Click on the "enable checkboxes" button.
        Verify that Checkbox1 is now enabled.
        Click on Checkbox1.
        Confirm that Checkbox1 is selected.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement>checkBoxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for(WebElement checkBox:checkBoxes){
            String option=checkBox.getAttribute("value");
            if(option.equals("checkbox-1")){
                boolean state=checkBox.isEnabled();
                System.out.println(state);
                if(!state){
                    WebElement enableBtn=driver.findElement(By.xpath("button[@id='enabledcheckbox']"));
                    enableBtn.click();
                    boolean status2=checkBox.isEnabled();
                    if(status2){
                        checkBox.click();
                        boolean isSelectedStatus=checkBox.isSelected();
                        System.out.println(isSelectedStatus);
                    }
                }
            }
        }
    }
}
