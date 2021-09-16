package sonClass;

import io.appium.java_client.AppiumDriver;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public void login_one(AppiumDriver driver)throws Exception{
            System.out.println("当前在欢迎页！");
            driver.findElementById("cn.butel.redmeeting:id/login_or_register_btn").click();
            System.out.println("正在输入账号/密码");
//            System.out.println("执行弹框");
//            //buttonActionListener buttonActionListener=new buttonActionListener();
//            JFrame jFrame=new JFrame("红云会议登录");
//
//            //输入账号密码
//            jFrame.setSize(350,250);
//            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//            JPanel jPanel=new JPanel();
//            jFrame.add(jPanel);
//            jFrame.setVisible(true);
//            JLabel j=new JLabel();
//            JLabel user=new JLabel("username:");
//            user.setBounds(10,20,80,25);
//            jPanel.add(user);
//            //用户名输入框
//            JTextField usertext=new JTextField(20);
//            usertext.setBounds(100,20,165,25);
//            jPanel.add(usertext);
//            // 输入密码的文本域
//            JLabel passwordLabel = new JLabel("Password:");
//            passwordLabel.setBounds(10,50,80,25);
//            jPanel.add(passwordLabel);
//            //密码输入框
//            JTextField password=new JTextField(20);
//            password.setBounds(100,50,165,25);
//            jPanel.add(password);
//
//            //login按钮
//            JButton jButton=new JButton("login");
//            jButton.setBounds(10,80,80,25);
//            jPanel.add(jButton);
//
//            addAction add=new addAction();
//            usertext.addActionListener(add);
//            password.addActionListener(add);
//            jButton.addActionListener(add);
//
//            login_user_pwd(driver,usertext.getText(),password.getText());
            //Thread.sleep(120000);
            login_user_pwd(driver,"18573440621","12345678Dyw");
            driver.findElementById("cn.butel.redmeeting:id/text1").click();
            driver.findElementById("cn.butel.redmeeting:id/login_btn").click();
            Thread.sleep(6000);

    }
    public void login_user_pwd(AppiumDriver driver,String username,String password){
        driver.findElementById("cn.butel.redmeeting:id/login_num_ed").sendKeys(username);
        driver.findElementById("cn.butel.redmeeting:id/login_pwd_ed").sendKeys(password);
    }

//    class addAction implements ActionListener {
//        public void actionPerformed(ActionEvent e){
//            //(TextField)e.getSource()强制将对象转换为TextField
//            JTextField tf = (JTextField)e.getSource();
//            JButton j=(JButton)e.getSource();
//            if(j.equals("login")){
//                System.out.println("click!!!");
//                System.out.println(tf.getText());
//            }else{
//
//            }
//
//
//        }
//    }
}
