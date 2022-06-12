import javax.swing.*;
import java.awt.*;
class LoginPage extends JFrame
{
	JLabel u1,p1;
	JTextField f1;
	JButton b1;
	JPasswordField pass;
	
	LoginPage()
	{
		u1=new JLabel("USERNAME");
		p1=new JLabel("PASSWORD");
		f1=new JTextField();
		b1=new JButton("Login");
		pass=new JPasswordField();
		
		f1.setBounds(600,200,150,30);
		u1.setBounds(400,200,100,30);
		p1.setBounds(400,250,100,30);
		pass.setBounds(600,250,150,30);
		b1.setBounds(500,350,100,30);
		add(pass);
		add(p1);
		add(u1);
		add(f1);
		add(b1);
        		
	}
	

public static void main(String args[])
	{
		LoginPage T=new LoginPage();
		T.setLayout(null);
		T.setSize(1000,1000);
		T.setTitle("Login page");
		//T.setLocation(300,200);
		T.setVisible(true);
		T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}