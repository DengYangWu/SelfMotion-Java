package sonClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class whiteBoard {
    public void open_whiteBoard(AppiumDriver driver){
        driver.findElementById("cn.butel.redmeeting:id/name_text").click();
        if(driver.findElementsById("cn.butel.redmeeting:id/share_rl").isEmpty()){
            System.out.println("不在会内");
        }else{
            driver.findElementById("cn.butel.redmeeting:id/share_rl").click();
            driver.findElementById("cn.butel.redmeeting:id/white_share_tv").click();

            //driver.swipe(1000,2000,2000,1000,2000);
            System.out.println("画了吗？");
        }
    }
//    public void swipeToUp(AndroidDriver<AndroidElement> driver, int during){
//        int width = driver.manage().window().getSize().width;//获取当前屏幕的宽度
//        int height = driver.manage().window().getSize().height;//获取当前屏幕的高度
//        driver.swipe(width/2, height*3/4, width/2, height/4, during);
//    }
}
