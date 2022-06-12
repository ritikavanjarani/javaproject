import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class RecommendedSongs extends JFrame implements ActionListener
{
	
	JTable jt;
	JScrollPane sp;
	JButton b1;
	StudentTableDisplayDemo(FirstPageDemo f)
	{
		
		String column[]={"sid","sname","artist","album","genre","a","g"};
		String data[][]=new String[100][7];
		b1=new JButton("BACK");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/music_rs","root","ritika");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select sname from songdetails s inner join (select artist as a, genre as g from songdetails where sname = "str") as si on s.artist=si.a and s.genre=si.g");
			int i=0;
			while(rs.next()==true)
			{
				data[i][0]=rs.getString(1);
				data[i][1]=rs.getString(2);
				data[i][2]=rs.getString(3);
				data[i][3]=rs.getString(4);
				data[i][4]=rs.getString(5);
				data[i][5]=rs.getString(6);
				data[i][6]=rs.getString(7);
				
				i++;
			}
			jt=new JTable(data,column);
			sp=new JScrollPane(jt);
			add(sp,BorderLayout.CENTER);
			add(b1,BorderLayout.SOUTH);
			b1.addActionListener(this);
			this.setSize(600,200);
			this.setVisible(true);
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("BACK"))
		{
			this.setVisible(false);
			--.setVisible(true);
		}
	}
}
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class MostRecommended extends JFrame implements ActionListener
{
	Skip sk;
	JTable jt;
	JScrollPane sp;
	JButton b1;
	MostRecommended(Skip s)
	{
		sk=s;
		String column[]={"sid","songname","artistname","albumname","likes"};
		String data[][]=new String[100][5];
		b1=new JButton("BACK");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/music_rs","root","ritika");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from songs order by likes desc");
			System.out.println(rs);
			int i=0;
			//System.out.println(rs.getString(1));
			while(rs.next()==true)
			{
				//System.out.println(data[i][0]);
				data[i][0]=rs.getString(1);
				//System.out.println(data[i][0]);
				data[i][1]=rs.getString(2);
				data[i][2]=rs.getString(3);
				data[i][3]=rs.getString(4);
				data[i][4]=rs.getString(5);
				i++;
				
			}
			
			jt=new JTable(data,column);
			sp=new JScrollPane(jt);
			add(sp,BorderLayout.CENTER);
			add(b1,BorderLayout.SOUTH);
			b1.addActionListener(this);
			this.setSize(600,200);
			this.setVisible(true);
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("BACK"))
		{
			this.setVisible(false);
			sk.setVisible(true);
		}
	}
}
class Skip extends JFrame implements ActionListener
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20;
	JButton b;
	Skip(Mood m)
	{
		setLayout(null);
		setSize(500,500);
		setTitle("");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Random Playlist");
		r1=new JRadioButton("Perfect");
		r2=new JRadioButton("Akhar");
		r3=new JRadioButton("Iktara");
		r4=new JRadioButton("Mishri");
		r5=new JRadioButton("This Town");
		r6=new JRadioButton("Love Story");
		r7=new JRadioButton("Infinity");
		r8=new JRadioButton("Memories");
		r9=new JRadioButton("Maahi Ve");
		r10=new JRadioButton("Dhunki");
		r11=new JRadioButton("Aaja Nachle");
		r12=new JRadioButton("Offo");
		r13=new JRadioButton("Kusu Kusu");
		r14=new JRadioButton("Tip Tip");
		r15=new JRadioButton("Stay");
		r16=new JRadioButton("Intentions");
		r17=new JRadioButton("Ranjha");
		r18=new JRadioButton("Duniya");
		r19=new JRadioButton("Senorita");
		r20=new JRadioButton("ily");
		
		
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("Most Liked Songs");
		Font f=new Font("Verdana",Font.BOLD,20);
		/*r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		r5.setFont(f);
		r6.setFont(f);
		r7.setFont(f);
		r8.setFont(f);
		r9.setFont(f);
		r10.setFont(f);
		r11.setFont(f);
		r12.setFont(f);*/
		l1.setFont(f);
		//b.setFont(f);
		l1.setBounds(150,30,400,30);
		r1.setBounds(20,80,200,20);
		r2.setBounds(20,110,200,20);
		r3.setBounds(20,140,200,20);
		r4.setBounds(20,170,200,20);
		r5.setBounds(20,200,200,20);
		r6.setBounds(20,230,200,20);
		r7.setBounds(250,80,200,20);
		r8.setBounds(250,110,200,20);
		r9.setBounds(250,140,200,20);
		r10.setBounds(250,170,200,20);
		r11.setBounds(250,200,200,20);
		r12.setBounds(250,230,200,20);
		r13.setBounds(20,260,200,20);
		r14.setBounds(20,290,200,20);
		r15.setBounds(20,320,200,20);
		r16.setBounds(20,350,200,20);
		r17.setBounds(250,260,200,20);
		r18.setBounds(250,290,200,20);
		r19.setBounds(250,320,200,20);
		r20.setBounds(250,350,200,20);
		b.setBounds(300,420,150,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);
		bg.add(r7);
		bg.add(r8);
		bg.add(r9);
		bg.add(r10);
		bg.add(r11);
		bg.add(r12);
		bg.add(r13);
		bg.add(r14);
		bg.add(r15);
		bg.add(r16);
		bg.add(r17);
		bg.add(r18);
		bg.add(r19);
		bg.add(r20);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		add(r7);
		add(r8);
		add(r9);
		add(r10);
		add(r11);
		add(r12);
		add(r13);
		add(r14);
		add(r15);
		add(r16);
		add(r17);
		add(r18);
		add(r19);
		add(r20);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Most Liked Songs"))
		{
			this.setVisible(false);
			MostRecommended mr=new MostRecommended(this);
		}
	} 
}

class BollywoodTrippin extends JFrame implements ActionListener
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	String str;
	BollywoodTrippin()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Bollywood Trippin");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Bollywood Trippin");
		r1=new JRadioButton("Manali Trance");
		r2=new JRadioButton("Hungama");
		r3=new JRadioButton("Mit Jaaye Ghum");
		r4=new JRadioButton("Chitta ve");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
		b.addActionListener(this)
	}
	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected())
		{
			str="Manali Trance";
			
		}
		if(r2.isSelected())
		{
			str="Hungama";
			
		}
		if(r3.isSelected())
		{
			str="Mit Jaaye Ghum"
			
		}
		if(r4.isSelected())
		{
			str="Chitta ve"
			
		}
		if(e.getActionCommand().equals("OK"))
		{
			this.setVisible(false);
			RecommendedSongs() s=new RecommendedSongs();
		}
		
		
	}
}
class TwistKaroDesiStyle extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	TwistKaroDesiStyle()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Twist Karo Desi Style");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Twist Karo Desi Style");
		r1=new JRadioButton("Goori goori");
		r2=new JRadioButton("Aaj Kal Tere Mere");
		r3=new JRadioButton("Rock N Roll");
		r4=new JRadioButton("Twist");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class CocktailPartyMix extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	CocktailPartyMix()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Cocktail Party Mix");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Cocktail Party Mix");
		r1=new JRadioButton("Baatameez Dil");
		r2=new JRadioButton("Party All Night");
		r3=new JRadioButton("Hookah Bar");
		r4=new JRadioButton("Saturday Saturday");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class LatestDanceFloorAnthems extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	LatestDanceFloorAnthems()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Latest Dance Floor Anthems");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Latest Dance Floor Anthems");
		r1=new JRadioButton("Param Sundari");
		r2=new JRadioButton("Naadiyon Par");
		r3=new JRadioButton("Har Funn Maula");
		r4=new JRadioButton("Ghungroo");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Dance extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Dance()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Dance");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel();
		r1=new JRadioButton("Bollywood Trippin");
		r2=new JRadioButton("Twist Karo Desi Style");
		r3=new JRadioButton("Cocktail Party Mix");
		r4=new JRadioButton("Latest Dance Floor Anthems");
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		ImageIcon i=new ImageIcon("D:\\project\\Soul Soothers.jpeg");
		ImageIcon i1=new ImageIcon("D:\\project\\Vacation.jpeg");
		ImageIcon i2=new ImageIcon("D:\\project\\Dil Unplugged.jpeg");
		ImageIcon i3=new ImageIcon("D:\\project\\Bollywood.jpeg");
		l2=new JLabel(i);
		l3=new JLabel(i1);
		l4=new JLabel(i2);
		l5=new JLabel(i3);
		Font f=new Font("Verdana",Font.BOLD,10);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l2.setBounds(50,80,150,100);
		l3.setBounds(250,80,150,100);
		l4.setBounds(50,240,150,100);
		l5.setBounds(250,240,150,100);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,190,150,20);
		r2.setBounds(250,190,150,20);
		r3.setBounds(50,350,150,20);
		r4.setBounds(250,350,150,20);
		b.setBounds(180,400,100,30);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		//b.addActionListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Bollywood Trippin"))
			
		{
			this.setVisible(false);
			BollywoodTrippin bt=new BollywoodTrippin();
			
			
		}
		else if(e.getActionCommand().equals("Twist Karo Desi Style"))
			
		{
			this.setVisible(false);
			TwistKaroDesiStyle tk=new TwistKaroDesiStyle();
			
			
		}
		else if(e.getActionCommand().equals("Cocktail Party Mix"))
			
		{
			this.setVisible(false);
			CocktailPartyMix cp=new CocktailPartyMix();
			
			
		}
		else if(e.getActionCommand().equals("Latest Dance Floor Anthems"))
			
		{
			this.setVisible(false);
			LatestDanceFloorAnthems ld=new LatestDanceFloorAnthems();
			
			
		}
		/*else (e.getActionCommand().equals("OK"))
			
		{
			this.setVisible(false);
			Skip obj=new Skip(this);
			
			
		}*/
	}
	
}

class DecadeRomance extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	DecadeRomance()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("A Decade In Romance");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("A Decade In Romance");
		r1=new JRadioButton("Tum Hi Ho");
		r2=new JRadioButton("Tere Bina");
		r3=new JRadioButton("Mere Haath");
		r4=new JRadioButton("Zehnaseeb");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class JukeBox extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	JukeBox()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Romantic JukeBox");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Romantic JukeBox");
		r1=new JRadioButton("Humsafar");
		r2=new JRadioButton("The Humma Song");
		r3=new JRadioButton("Enna Sonna");
		r4=new JRadioButton("Kaun Tujhe");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class LoveAajKal extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	LoveAajKal()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Love Aaj Kal");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Love Aaj Kal");
		r1=new JRadioButton("Ek Dil Ek Jaan");
		r2=new JRadioButton("Shab Tum Ho");
		r3=new JRadioButton("Pehla Nasha");
		r4=new JRadioButton("Naina");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class WalaPyaar extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	WalaPyaar()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("90's Wala Pyaar");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("90's Wala Pyaar");
		r1=new JRadioButton("Tujhe Dekha To");
		r2=new JRadioButton("Ek Ladki ko Dekha");
		r3=new JRadioButton("Dil To Paagal Hai");
		r4=new JRadioButton("Mere Khwaboo");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Romantic extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Romantic()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Romantic");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel();
		r1=new JRadioButton("A Decade In Romance");
		r2=new JRadioButton("Romantic JukeBox");
		r3=new JRadioButton("Love Aaj Kal");
		r4=new JRadioButton("90's Wala Pyaar");
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		ImageIcon i=new ImageIcon("D:\\project\\Soul Soothers.jpeg");
		ImageIcon i1=new ImageIcon("D:\\project\\Vacation.jpeg");
		ImageIcon i2=new ImageIcon("D:\\project\\Dil Unplugged.jpeg");
		ImageIcon i3=new ImageIcon("D:\\project\\Bollywood.jpeg");
		l2=new JLabel(i);
		l3=new JLabel(i1);
		l4=new JLabel(i2);
		l5=new JLabel(i3);
		Font f=new Font("Verdana",Font.BOLD,10);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l2.setBounds(50,80,150,100);
		l3.setBounds(250,80,150,100);
		l4.setBounds(50,240,150,100);
		l5.setBounds(250,240,150,100);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,190,150,20);
		r2.setBounds(250,190,150,20);
		r3.setBounds(50,350,150,20);
		r4.setBounds(250,350,150,20);
		b.setBounds(180,400,100,30);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		//b.addActionListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("A Decade In Romance"))
			
		{
			this.setVisible(false);
			DecadeRomance dr=new DecadeRomance();
			
			
		}
		else if(e.getActionCommand().equals("Romantic JukeBox"))
			
		{
			this.setVisible(false);
			JukeBox jb=new JukeBox();
			
			
		}
		else if(e.getActionCommand().equals("Love Aaj Kal"))
			
		{
			this.setVisible(false);
			LoveAajKal l=new LoveAajKal();
			
			
		}
		else if(e.getActionCommand().equals("90's Wala Pyaar"))
			
		{
			this.setVisible(false);
			WalaPyaar w=new WalaPyaar();
			
			
		}
		/*else (e.getActionCommand().equals("OK"))
			
		{
			this.setVisible(false);
			Skip obj=new Skip(this);
			
			
		}*/
	}
	
}

class SoulSoothers extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	SoulSoothers()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Soul Soothers");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Soul Soothers");
		r1=new JRadioButton("Phir Le Aaya Dil");
		r2=new JRadioButton("Iktara");
		r3=new JRadioButton("Raabta");
		r4=new JRadioButton("Kinare");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Vacation extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Vacation()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Vacation");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Vacation");
		r1=new JRadioButton("Illahi");
		r2=new JRadioButton("Phir Se Udd Chala");
		r3=new JRadioButton("Safarnama");
		r4=new JRadioButton("Matargashti");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class DilUnplugged extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	DilUnplugged()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Dil Unplugged");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Dil Unplugged");
		r1=new JRadioButton("Inn Dino");
		r2=new JRadioButton("Kabira");
		r3=new JRadioButton("Dil Diyan Gallan");
		r4=new JRadioButton("Woh Baarishein");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class SlowBollywood extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	SlowBollywood()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Slow and Easy Bollywood");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Slow and Easy Bollywood");
		r1=new JRadioButton("Tum Se Hi");
		r2=new JRadioButton("Kaise Hua");
		r3=new JRadioButton("Humraah");
		r4=new JRadioButton("Zara Zara");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Relaxed extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Relaxed()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Relaxed");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel();
		r1=new JRadioButton("Soul Soothers");
		r2=new JRadioButton("Vacation");
		r3=new JRadioButton("Dil Unplugged");
		r4=new JRadioButton("Slow and Easy Bollywood");
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		ImageIcon i=new ImageIcon("D:\\project\\Soul Soothers.jpeg");
		ImageIcon i1=new ImageIcon("D:\\project\\Vacation.jpeg");
		ImageIcon i2=new ImageIcon("D:\\project\\Dil Unplugged.jpeg");
		ImageIcon i3=new ImageIcon("D:\\project\\Bollywood.jpeg");
		l2=new JLabel(i);
		l3=new JLabel(i1);
		l4=new JLabel(i2);
		l5=new JLabel(i3);
		Font f=new Font("Verdana",Font.BOLD,10);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l2.setBounds(50,80,150,100);
		l3.setBounds(250,80,150,100);
		l4.setBounds(50,240,150,100);
		l5.setBounds(250,240,150,100);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,190,150,20);
		r2.setBounds(250,190,150,20);
		r3.setBounds(50,350,150,20);
		r4.setBounds(250,350,150,20);
		b.setBounds(180,400,100,30);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		//b.addActionListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Soul Soothers"))
			
		{
			this.setVisible(false);
			SoulSoothers ss=new SoulSoothers();
			
			
		}
		else if(e.getActionCommand().equals("Vacation"))
			
		{
			this.setVisible(false);
			Vacation v=new Vacation();
			
			
		}
		else if(e.getActionCommand().equals("Dil Unplugged"))
			
		{
			this.setVisible(false);
			DilUnplugged d=new DilUnplugged();
			
			
		}
		else if(e.getActionCommand().equals("Slow and Easy Bollywood"))
			
		{
			this.setVisible(false);
			SlowBollywood sb=new SlowBollywood();
			
			
		}
		/*else (e.getActionCommand().equals("OK"))
			
		{
			this.setVisible(false);
			Skip obj=new Skip(this);
			
			
		}*/
	}
	
}

class BreakUpSongs extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	BreakUpSongs()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Break Up Songs");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Break Up Songs");
		r1=new JRadioButton("Love Yourself");
		r2=new JRadioButton("Tujhe Bula Diya");
		r3=new JRadioButton("Stitches");
		r4=new JRadioButton("Ae Dil Hai Mushkil");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class ArijitSentimentalHits extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	ArijitSentimentalHits()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Arijit Sentimental Hits");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Arijit Sentimental Hits");
		r1=new JRadioButton("Shayad");
		r2=new JRadioButton("Intezaar");
		r3=new JRadioButton("Channa Mereya");
		r4=new JRadioButton("Humari Aadhuri Kahani");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class EmotionalSongs extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	EmotionalSongs()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Emotional Songs 2017");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Emotional Songs 2017");
		r1=new JRadioButton("Tere Mere");
		r2=new JRadioButton("Ik Vaari Aa");
		r3=new JRadioButton("Mai Agar");
		r4=new JRadioButton("Thodi Der");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Bollywood extends JFrame 
{
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Bollywood()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Bollywood 90's");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Bollywood 90's");
		r1=new JRadioButton("Hum to dil se haare");
		r2=new JRadioButton("Hum dil de chuke sanam");
		r3=new JRadioButton("Tu hi re");
		r4=new JRadioButton("Hum yahan");
		
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("OK");
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,80,400,50);
		r2.setBounds(50,150,400,50);
		r3.setBounds(50,220,400,50);
		r4.setBounds(50,290,400,50);
		b.setBounds(180,400,100,30);
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
}
class Sad extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Sad()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Sad");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel();
		r1=new JRadioButton("Break Up Songs");
		r2=new JRadioButton("Arijit Sentimental Hits");
		r3=new JRadioButton("Emotional Songs 2017");
		r4=new JRadioButton("Bollywood 90's");
		ButtonGroup bg=new ButtonGroup();
		this.setBackground(Color.black);
		b=new JButton("OK");
		ImageIcon i=new ImageIcon("D:\\project\\BreakUpSongs.jpeg");
		ImageIcon i1=new ImageIcon("D:\\project\\Arijit Sentimental.jpeg");
		ImageIcon i2=new ImageIcon("D:\\project\\EmotionalSongs.jpeg");
		ImageIcon i3=new ImageIcon("D:\\project\\Bollywood 90's.jpeg");
		l2=new JLabel(i);
		l3=new JLabel(i1);
		l4=new JLabel(i2);
		l5=new JLabel(i3);
		Font f=new Font("Verdana",Font.BOLD,10);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l2.setBounds(50,80,150,100);
		l3.setBounds(250,80,150,100);
		l4.setBounds(50,240,150,100);
		l5.setBounds(250,240,150,100);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,190,150,20);
		r2.setBounds(250,190,150,20);
		r3.setBounds(50,350,150,20);
		r4.setBounds(250,350,150,20);
		b.setBounds(180,400,100,30);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		//b.addActionListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Break Up Songs"))
			
		{
			this.setVisible(false);
			BreakUpSongs br=new BreakUpSongs();
			
			
		}
		else if(e.getActionCommand().equals("Arijit Sentimental Hits"))
			
		{
			this.setVisible(false);
			ArijitSentimentalHits a=new ArijitSentimentalHits();
			
			
		}
		else if(e.getActionCommand().equals("Emotional Songs 2017"))
			
		{
			this.setVisible(false);
			EmotionalSongs es=new EmotionalSongs();
			
			
		}
		else if(e.getActionCommand().equals("Bollywood 90's"))
			
		{
			this.setVisible(false);
			Bollywood b=new Bollywood();
			
			
		}
		/*else (e.getActionCommand().equals("OK"))
			
		{
			this.setVisible(false);
			Skip obj=new Skip(this);
			
			
		}*/
	}
	
}
		
class Mood extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3,r4;
	JButton b;
	Mood()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Mood");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("What mood are you in");
		r1=new JRadioButton("Relaxed");
		r2=new JRadioButton("Romantic");
		r3=new JRadioButton("Sad");
		r4=new JRadioButton("Dance");
		ButtonGroup bg=new ButtonGroup();
		b=new JButton("SKIP");
		ImageIcon i=new ImageIcon("D:\\project\\relaxed.jpeg");
		ImageIcon i1=new ImageIcon("D:\\project\\romantic.jpeg");
		ImageIcon i2=new ImageIcon("D:\\project\\sad.jpeg");
		ImageIcon i3=new ImageIcon("D:\\project\\dance.jpeg");
		l2=new JLabel(i);
		l3=new JLabel(i1);
		l4=new JLabel(i2);
		l5=new JLabel(i3);
		Font f=new Font("Verdana",Font.BOLD,20);
		r1.setFont(f);
		r3.setFont(f);
		r2.setFont(f);
		r4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		l2.setBounds(50,80,150,100);
		l3.setBounds(250,80,150,100);
		l4.setBounds(50,240,150,100);
		l5.setBounds(250,240,150,100);
		l1.setBounds(100,30,400,30);
		r1.setBounds(50,190,150,20);
		r2.setBounds(250,190,150,20);
		r3.setBounds(50,350,150,20);
		r4.setBounds(250,350,150,20);
		b.setBounds(180,400,100,30);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		b.addActionListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Relaxed"))
			
		{
			this.setVisible(false);
			Relaxed r=new Relaxed();
			
			
		}
		else if(e.getActionCommand().equals("Romantic"))
			
		{
			this.setVisible(false);
			Romantic ro=new Romantic();
			
			
		}
		else if(e.getActionCommand().equals("Sad"))
			
		{
			this.setVisible(false);
			Sad s=new Sad();
			
			
		}
		else if(e.getActionCommand().equals("Dance"))
			
		{
			this.setVisible(false);
			Dance d=new Dance();
			
			
		}
		else if(e.getActionCommand().equals("SKIP"))
			
		{
			this.setVisible(false);
			Skip sk=new Skip(this);
			
			
		}
	}
	
}
		
class Language extends JFrame implements ActionListener
{
	JLabel l1,limage;
	JCheckBox b1,b2,b3,b4;
	JButton b;
	Language()
	{
		
		setLayout(null);
		setSize(500,500);
		setTitle("Language");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Enter your Choice");
		b1=new JCheckBox("ENGLISH");
		b2=new JCheckBox("HINDI");
		b3=new JCheckBox("PUNJABI");
		b4=new JCheckBox("OTHERS");
		b=new  JButton("OK");
		ImageIcon i=new ImageIcon("D:\\project\\image.jpeg");
		limage=new JLabel(i);
		Font f=new Font("Verdana",Font.BOLD,20);
		b1.setFont(f);
		b3.setFont(f);
		b2.setFont(f);
		b4.setFont(f);
		l1.setFont(f);
		b.setFont(f);
		limage.setBounds(0,0,500,500);
		l1.setBounds(100,30,200,30);
		b1.setBounds(50,80,150,100);
		b2.setBounds(250,80,150,100);
		b3.setBounds(50,200,150,100);
		b4.setBounds(250,200,150,100);
		b.setBounds(180,400,100,30);
		add(limage);
		limage.add(l1);
		limage.add(b1);
		limage.add(b2);
		limage.add(b3);
		limage.add(b4);
		limage.add(b);
		b.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("OK"))
			
		{
			this.setVisible(false);
			Mood m=new Mood();
			
			
		}
	}
	
}
class Login extends JFrame implements ActionListener
{
	JLabel l1,l2,limage;
	JPasswordField p1;
	JTextField t1;
	JButton b1,b2;
	
	Login()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("Login Page");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		ImageIcon i=new ImageIcon("D:\\project\\login.jpeg");
		
		limage=new JLabel(i);
		p1=new JPasswordField();
		t1=new JTextField();
		b1=new JButton("Login");
		b2=new JButton("Prev");
		Font f=new Font("Verdana",Font.BOLD,15);
		l1.setFont(f);
		l2.setFont(f);
	
		limage.setBounds(0,0,500,500);
		l1.setBounds(100,170,100,20);
		l2.setBounds(100,240,100,20);
		t1.setBounds(215,170,150,20);
		p1.setBounds(215,240,100,20);
		b1.setBounds(250,310,100,20);
		b2.setBounds(100,310,100,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(limage);
		limage.add(l1);
		limage.add(l2);
		limage.add(p1);
		limage.add(t1);
		limage.add(b1);
		limage.add(b2);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Login"))
			
		{
			this.setVisible(false);
			Language l=new Language();
			
			
		}
		if(e.getActionCommand().equals("Prev"))
		{
			this.setVisible(false);
		    WelcomePage w=new WelcomePage();
			
		}
	}
}
class SignUp extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2;
	JRadioButton r1,r2;
	JTextField t1,t2,t3,t4,t5,t6;
	JPasswordField p1;
	
	SignUp()
	{
		
	    setLayout(null);
		setSize(500,500);
		setTitle("Sign-up page");
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("First Name");
		l2=new JLabel("Last Name");
		l3=new JLabel("Username");
		l7=new JLabel("Password");
		l4=new JLabel("Age");
		l5=new JLabel("Gender");
		l8=new JLabel("Mobile No");
		l6=new JLabel("Email ID");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t6=new JTextField();
		t5=new JTextField();
		p1=new JPasswordField();
		b1=new JButton("Sign-Up");
		b2=new JButton("Prev");
		
		l1.setBounds(50,50,100,20);
		l2.setBounds(50,90,100,20);
		l3.setBounds(50,130,100,20);
		l7.setBounds(50,170,100,20);
		l4.setBounds(50,210,100,20);
		l5.setBounds(50,250,100,20);
		l8.setBounds(50,290,100,20);
		l6.setBounds(50,330,100,20);
		t1.setBounds(170,50,200,20);
		t2.setBounds(170,90,200,20);
		t3.setBounds(170,130,200,20);
		t4.setBounds(170,210,200,20);
		t6.setBounds(170,290,200,20);
		t5.setBounds(170,330,200,20);
		p1.setBounds(170,170,200,20);
		r1.setBounds(170,250,100,20);
		r2.setBounds(300,250,120,20);
		b2.setBounds(100,400,100,20);
		b1.setBounds(250,400,100,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
		add(l6);
		add(l7);
		add(l8);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(p1);
		add(r1);
		add(r2);
		add(b1);
		add(b2);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Sign-Up"))
		{
		
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/music_rs","root","ritika");
				String query="insert into signup (fname,lname,username,pass,age,gender,mobileno,email) VALUES(?,?,?,?,?,?,?,?)";
				PreparedStatement st=con.prepareStatement(query);
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, new String(p1.getPassword()));
				st.setString(5, t4.getText());
				if(r1.isSelected())
					st.setString(6,"Male");
				if(r2.isSelected())
					st.setString(6,"Female");
				
				st.setString(7,t6.getText());
				st.setString(8,t5.getText());
				System.out.println(st);
				st.execute();
				con.close();
				JOptionPane.showMessageDialog(this,"NAME : "+t1.getText()+"\n"+"Last Name: "+t2.getText()+"\nRecord Updated");
			}
			catch(Exception em)
			{
				JOptionPane.showMessageDialog(this,"\nRecord not updated");
				System.out.println(em);
			}
		
				this.setVisible(false);
				Language l=new Language();
		}
			
		
		if(e.getActionCommand().equals("Prev"))
		{
			this.setVisible(false);
		    WelcomePage w=new WelcomePage();
			
		}
		
		
	}	
}

class WelcomePage extends JFrame implements ActionListener
{ 
     JLabel limage;
	 JButton b1,b2;
	 
	 WelcomePage()
	{
		b1=new JButton("Login");
		b2=new JButton("SignUp");
		ImageIcon i=new ImageIcon("D:\\project\\Welcome.jpg");		
		limage=new JLabel(i);
		
		limage.setBounds(0,0,500,500);
		b1.setBounds(180,200,100,30);
		b2.setBounds(180,250,100,30);
		//Font f=new Font("Verdana",Font.BOLD,15);
		//b1.setFont(f);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(limage);
		limage.add(b1);
		limage.add(b2);
		this.setLayout(null);
		this.setSize(500,500);
		this.setTitle("Welcome page");
		this.setLocation(200,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("SignUp"))
		{
			this.setVisible(false);
			SignUp s=new SignUp();
			
		}
		if(e.getActionCommand().equals("Login"))
		{
			this.setVisible(false);
			Login l=new Login();
			
		}
		
	}
		
}
class LoginDemo 
{
	public static void main(String args[])
	{
		WelcomePage w = new WelcomePage();
		
	}
}
		
		


