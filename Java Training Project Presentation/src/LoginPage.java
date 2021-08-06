import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("Login");
    JButton resetbutton = new JButton("reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userPasswordLabel = new JLabel("password: ");
    JLabel messageLabel = new JLabel();

    HashMap <String, String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String, String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.ITALIC,25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125,150,200,25);

        loginbutton.setBounds(125, 200, 100, 25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);

        resetbutton.setBounds(225, 200, 100, 25);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginbutton);
        frame.add(resetbutton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,360);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetbutton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginbutton){

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage();
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Login Fails.");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }

        }
    }
}
