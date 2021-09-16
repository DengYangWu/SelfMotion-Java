package sonClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class pop_up {

    public Map<String, String> user_pwd_pop(){
        Map<String, String> map = new HashMap<String, String>();

        System.out.println("执行弹框");
        //buttonActionListener buttonActionListener=new buttonActionListener();
        JFrame jFrame=new JFrame("红云会议登录");

        //输入账号密码
        jFrame.setSize(350,250);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        JLabel j=new JLabel();
        JLabel user=new JLabel("username:");
        user.setBounds(10,20,80,25);
        jPanel.add(user);
        //用户名输入框
        JTextField usertext=new JTextField(20);
        usertext.setBounds(100,20,165,25);
        jPanel.add(usertext);
        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        jPanel.add(passwordLabel);
        //密码输入框
        JTextField password=new JTextField(20);
        password.setBounds(100,50,165,25);
        jPanel.add(password);

        //login按钮
        JButton jButton=new JButton("login");
        jButton.setBounds(10,80,80,25);
        jPanel.add(jButton);


//        String user1 = usertext.addActionListener(new actionListener);
//        String pwd1 = password.addActionListener(new actionListener);
//        jButton.addActionListener(new actionListener);
        //String user1=usertext.getText();
        //String pwd1=password.getText();

//        map.put("user1",user1);
//        map.put("pwd1",pwd1);
        return map;
    }
    class actionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JTextField j= (JTextField) e.getSource();

            System.out.println(j.getText());
        }
    }

}
