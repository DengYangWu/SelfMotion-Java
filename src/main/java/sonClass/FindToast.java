package sonClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;

public class FindToast {
    public void findToast(AppiumDriver driver){
        String toast = "会议号不能少于8位";
        System.out.println("获取toast");


        try{
            final WebDriverWait wait = new WebDriverWait(driver,2);
            Assert.isNull(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@text,'"+toast+"')]"))));
            System.out.println("toast找到了");
        }catch (Exception e){
            throw new AssertionError("找不到"+toast);
        }


    }
}
