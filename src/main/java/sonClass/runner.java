package sonClass;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class runner {
    public void run_app(AppiumDriver driver){
        try {
            Thread.sleep(6000);
            //进会，点击画廊分页圆点
            driver.findElementById("cn.butel.redmeeting:id/name_text").click();
            driver.findElementById("cn.butel.redmeeting:id/seek_bar_rl").click();

            int te = driver.findElement(By.id("cn.butel.redmeeting:id/meeting_mode_gallery_mode_view")).findElements(By.id("cn.butel.redmeeting:id/speaker_name_tv")).size();
            System.out.println("当前页面画廊窗口数："+te);

            List<WebElement> closeCamera = driver.findElementsByXPath("//*[@resource-id='cn.butel.redmeeting:id/name_text']");
            for(WebElement els:closeCamera){
                System.out.println("当前页面画廊模式关闭摄像头的人："+els.getText());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
