import javax.swing.*;
import java.awt.*;
class Hotel extends JFrame 
{
JButton j1,j2,j3,j4,j5;
	Hotel()
	{
		j1=new JButton("Bombay Taqueria");
		j2=new JButton("Ralphys");
		j3=new JButton("Solitaire");
		j4=new JButton("Euthopia");
		j5=new JButton("Ummrao");
		//j6=new JButton("Prev");
		j1.setBounds(400,100,200,50);
		j2.setBounds(400,200,200,50);
		j3.setBounds(400,300,200,50);
		j4.setBounds(400,400,200,50);
		j5.setBounds(400,500,200,50);
		//j6.setBounds(200,450,100,30);
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		//add(j6);
		
		
	}
	public static void main(String args[])
	{
		Hotel H=new Hotel();
		H.setLayout(null);
		H.setSize(1000,1000);
		H.setTitle("Login page");
		//T.setLocation(300,200);
		H.setVisible(true);
		H.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}