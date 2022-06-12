import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Test extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	
	
	Test()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();

		c1=new JCheckBox("Lemon Chicken and Pea Gemelli-----RS300");
		c2=new JCheckBox("Spaghetti with Roasted Chicken ----------RS330");
		c3=new JCheckBox("Skillet Chicken----------RS350");
		c4=new JCheckBox("Chicken Osso Buco----------RS370");
		c5=new JCheckBox("Parmesan Chicken Skillet--------RS400");
		c6=new JCheckBox("Chicken Fettuccine--------RS450");
		c7=new JCheckBox("Chicken Florentine Pasta--------RS430");
		c8=new JCheckBox("Caprese Chicken----------RS360");
		c9=new JCheckBox("Chicken Piccata Pasta----------RS350");
	   c10=new JCheckBox("Chicken Parmesan Stuffed Shells----------RS390");
	   c11=new JCheckBox("Grilled Chicken Risotto-----------RS410");
	   c12=new JCheckBox("Pasta with Grilled Chicken--------RS420");
	   c13=new JCheckBox("Mozzarella Chicken--------RS360");
	   c14=new JCheckBox("Chicken Marsala--------RS430");
	   c15=new JCheckBox("Tuscan Chicken Skillet--------RS380");
	   c16=new JCheckBox("Lemon Chicken Piccata--------RS400");
	   c17=new JCheckBox("Tuscan Garlic Chicken--------RS390");
	   c18=new JCheckBox("Balsamic Chicken--------RS385");
	   c19=new JCheckBox("Asiago Chicken Pasta--------RS300");
	   c20=new JCheckBox("White Sauce Pasta Chicken--------RS420");
	   c21=new JCheckBox("Spaghetti Bolognese--------RS430");
	   c22=new JCheckBox("Panzenella--------RS420");
	   c23=new JCheckBox("bruschetta--------RS400");
	   c24=new JCheckBox("Pasta Carbonara--------RS360");
	  
		b1=new JButton("Next");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		
		
		 c1.setBounds(150,150,250,30);
		 cb1.setBounds(410,150,50,20);
		 c2.setBounds(150,200,250,30);
		 cb2.setBounds(410,200,50,20);
		 c3.setBounds(150,250,250,30);
		 cb3.setBounds(410,250,50,20);
		 c4.setBounds(150,300,250,30);
		 cb4.setBounds(410,300,50,20);
		 c5.setBounds(150,350,250,30);
		 cb5.setBounds(410,350,50,20);
		 c6.setBounds(150,400,250,30);
		  cb6.setBounds(410,400,50,20);
		 c7.setBounds(150,450,250,30);
		  cb7.setBounds(410,450,50,20);
		 c8.setBounds(150,500,250,30);
		  cb8.setBounds(410,500,50,20);
		  c9.setBounds(150,550,250,30);
		  cb9.setBounds(410,550,50,20);
		  c10.setBounds(150,600,250,30);
		  cb10.setBounds(410,600,50,20);
		  c11.setBounds(150,650,250,30);
		  cb11.setBounds(410,650,50,20);
		  c12.setBounds(150,700,250,30);
		  cb12.setBounds(410,700,50,20);
		   c13.setBounds(500,150,250,30);
		 cb13.setBounds(760,150,50,20);
		 c14.setBounds(500,200,250,30);
		 cb14.setBounds(760,200,50,20);
		 c15.setBounds(500,250,250,30);
		 cb15.setBounds(760,250,50,20);
		 c16.setBounds(500,300,250,30);
		 cb16.setBounds(760,300,50,20);
		 c17.setBounds(500,350,250,30);
		 cb17.setBounds(760,350,50,20);
		 c18.setBounds(500,400,250,30);
		  cb18.setBounds(760,400,50,20);
		 c19.setBounds(500,450,250,30);
		  cb19.setBounds(760,450,50,20);
		 c20.setBounds(500,500,250,30);
		  cb20.setBounds(760,500,50,20);
		  c21.setBounds(500,550,250,30);
		  cb21.setBounds(760,550,50,20);
		  c22.setBounds(500,600,250,30);
		  cb22.setBounds(760,600,50,20);
		  c23.setBounds(500,650,250,30);
		  cb23.setBounds(760,650,50,20);
		  c24.setBounds(500,700,250,30);
		  cb24.setBounds(760,700,50,20);
		  l1.setBounds(150,100,310,30);
		   l2.setBounds(500,100,310,30);
		 b1.setBounds(1000,600,70,30);
		 //lamount.setBounds(580,620,200,30);
		  b1.addActionListener(this);
		 //add(limage);
		 
		add(l1);
		add(l2);
		 add(b1);
		 add(c1);
		 add(c2);
		add(c3);
		  add(c4);
		  add(c5);
		  add(c6);
		 add(c7);
		  add(c8);
		  add(c9);
		  add(c10);
		  add(c11);
		  add(c12);
		  
		 add(c13);
		 add(c14);
		 add(c15);
		 add(c16);
		 add(c17);
		 add(c18);
		 add(c19);
		 add(c20);
		 add(c21);
		 add(c22);
		 add(c23);
		 add(c24);
		 
		 
		 
		  add(cb1);
		  add(cb2);
		  add(cb3);
		  add(cb4);
		  add(cb5);
		  add(cb6);
		  add(cb7);
		  add(cb8);
		  add(cb9);
		  add(cb10);
		  add(cb11);
		  add(cb12);
		  add(cb13);
		  add(cb14);
		  add(cb15);
		  add(cb16);
		  add(cb17);
		  add(cb18);
		  add(cb19);
		  add(cb20);
		  add(cb21);
		  add(cb22);
		  add(cb23);
		  add(cb24);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+450*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+430*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+410*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+420*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+430*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+380*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+385*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+420*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+430*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+420*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		
		
		JOptionPane.showMessageDialog(this,"Your total bill is ");
	
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.setLayout(null);
		t.setSize(1000,960);
		t.setTitle("Hotel");
		//t.setLocation(300,200);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}