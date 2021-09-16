import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import sonClass.*;
public class AppDemo {
    private AppiumDriver driver;
    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, "");
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "192.168.1.115:5559"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "8.1.0");
        //将上面获取到的包名和Activity名设置为值
        cap.setCapability("appPackage", "cn.butel.redmeeting");
        cap.setCapability("appActivity", "cn.butel.redmeeting.boot.SplashActivity");
//        //A new session could not be created的解决方法
        //cap.setCapability("appWaitActivity", "cn.butel.redmeeting.boot.SplashActivity");
//        //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        //cap.setCapability("sessionOverride", true);
        cap.setCapability("udid","192.168.1.115:5559");
        cap.setCapability("noReset",true);
        cap.setCapability("skipServerInstallation",true);
        cap.setCapability("skipDeviceInitialization",true);
        cap.setCapability("automationName","UiAutomator1");
        cap.setCapability("newCommandTimeout",600);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
    @Test
    public void plus() throws Exception {
//        Thread.sleep(3000);
//        int width = driver.manage().window().getSize().width;
//        int height = driver.manage().window().getSize().height;
//        int x0 = (int)(width * 0.8);  // 起始x坐标
//        int x1 = (int)(height * 0.2);  // 终止x坐标
//        int y = (int)(height * 0.5);  // y坐标
//        for (int i=0; i<5; i++) {
//            driver.swipe(x0, y, x1, y, 500);
//            Thread.sleep(1000);
//        }
//        driver.findElementById("com.youdao.calculator:id/guide_button").click();
//        for (int i=0; i<6; i++) {
//            driver.findElementByXPath("//android.webkit.WebView[@text='Mathbot Editor']").click();
//            Thread.sleep(1000);
//        }
//        String btn_xpath = "//*[@resource-id='com.youdao.calculator:id/view_pager_keyboard']/android.widget.GridView/android.widget.FrameLayout[%d]/android.widget.FrameLayout";
//        driver.findElementByXPath(String.format(btn_xpath, 7)).click();
//        driver.findElementByXPath(String.format(btn_xpath, 10)).click();
//        driver.findElementByXPath(String.format(btn_xpath, 8)).click();
//        Thread.sleep(3000);
        //加入会议
        Thread.sleep(8000);
        System.out.println("321");
//        join_meeting jm =new join_meeting();
//        runner runner=new runner();
//        whiteBoard w=new whiteBoard();
        driver.findElementById("cn.butel.redmeeting:id/join_meeting_ly").click();
        driver.findElementById("cn.butel.redmeeting:id/meetingid_input_edit").sendKeys("1");
        FindToast fi=new FindToast();
        fi.findToast(driver);
        //jm.join_meeting(driver);
        //runner.run_app(driver);//切换到画廊模式
        //w.open_whiteBoard(driver);
        //System.out.println("当前页面画廊模式关闭摄像头的人数："+closeCamera);

        //driver.tap((1130),(1130),(1298),(776));


        //}


        //String i = driver.findElementById("cn.butel.redmeeting:id/speaker_name_tv").getText();
        //String i = driver.findElementById("cn.butel.redmeeting:id/name_text").getText();
        //String textname = driver.findElementByXPath("//android.widget.TextView[@text'"+i+"']/preceding-sibling::android.widget.TextView").getText();

//        if (i>0){
//            System.out.println("当前关闭摄像头的人数为"+i);
//            System.out.println("当前关闭摄像头的有："+textname);
//        }else{
//            System.out.println("当前无人打开摄像头");
//        }
    }
    //Out of the meeting
//    @AfterClass
//    public void tearDown() throws Exception {
//        driver.quit();
//    }
}