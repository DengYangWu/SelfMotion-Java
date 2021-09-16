package sonClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Map;
import javax.swing.*;
public class join_meeting {
    private List synchedList;
    public void join_meeting(AppiumDriver driver) throws Exception{
        System.out.println("加会");


            //usertext.addActionListener(buttonActionListener);
            //password.addActionListener(buttonActionListener);
            //jButton.addActionListener(buttonActionListener);
            //wait();

        if(driver.findElements(By.id("cn.butel.redmeeting:id/login_or_register_btn")).isEmpty()){

            if (driver.findElements(By.id("cn.butel.redmeeting:id/tv_content")).isEmpty()==false){
                System.out.println("发现有检测异常退会的弹框");
                driver.findElementById("cn.butel.redmeeting:id/btn_right").click();
            }else {
                System.out.println("直接进入会议");
                driver.findElementById("cn.butel.redmeeting:id/join_meeting_ly").click();
                driver.findElementById("cn.butel.redmeeting:id/meetingid_input_edit").sendKeys("30183905");
                driver.findElementById("cn.butel.redmeeting:id/join_meeting_btn").click();
                Thread.sleep(6000);
                driver.findElementById("cn.butel.redmeeting:id/name_text").click();
                driver.findElementById("cn.butel.redmeeting:id/seek_bar_rl").click();
            }

        }else{
            login l=new login();
            l.login_one(driver);
        }


    }

}
