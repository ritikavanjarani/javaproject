import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class italy_veg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_veg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\Italy_veg.jpeg");
		limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Stuffed Shells-----RS250");
		c2=new JCheckBox("White Pesto Pasta----------RS270");
		c3=new JCheckBox("Herby Pasta with Garlic----------RS290");
		c4=new JCheckBox("Spaghetti al Limone----------RS260");
		c5=new JCheckBox("Creamy Pasta--------RS280");
		c6=new JCheckBox("Stuffed Grilled Zucchini--------RS300");
		c7=new JCheckBox("Spinach Pie Parma--------RS270");
		c8=new JCheckBox("Italian Cheese Loaf----------RS290");
		c9=new JCheckBox("Spinach and Artichoke Pizza----------RS310");
	   c10=new JCheckBox("Italian Mushrooms----------RS280");
	   c11=new JCheckBox("Cheese Ravioli-----------RS300");
	   c12=new JCheckBox("Linguine--------RS320");
	   c13=new JCheckBox("Spring Green Risotto--------RS260");
	   c14=new JCheckBox("White Pizza--------RS270");
	   c15=new JCheckBox("Arborio Rice--------RS280");
	   c16=new JCheckBox("Grilled Veggie Pizza--------RS280");
	   c17=new JCheckBox("Cheese Focaccia--------RS300");
	   c18=new JCheckBox("Arugula Sandwiches--------RS260");
	   c19=new JCheckBox("Pasta with Asparagus--------RS290");
	   c20=new JCheckBox("Veggie Lasagna--------RS310");
	   c21=new JCheckBox("Garlic Bread--------RS350");
	   c22=new JCheckBox("Ziti Bake--------RS360");
	   c23=new JCheckBox("Mixed Olive Crostini--------RS390");
	   c24=new JCheckBox("White Pesto Pasta--------RS280");
		b1=new JButton("PREVIOUS");
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
		limage.setBounds(0,0,1000,1000);
        c1.setBounds(210,150,250,30);
		 cb1.setBounds(470,150,50,20);
		 c2.setBounds(210,200,250,30);
		 cb2.setBounds(470,200,50,20);
		 c3.setBounds(210,250,250,30);
		 cb3.setBounds(470,250,50,20);
		 c4.setBounds(210,300,250,30);
		 cb4.setBounds(470,300,50,20);
		 c5.setBounds(210,350,250,30);
		 cb5.setBounds(470,350,50,20);
		 c6.setBounds(210,400,250,30);
		  cb6.setBounds(470,400,50,20);
		 c7.setBounds(210,450,250,30);
		  cb7.setBounds(470,450,50,20);
		 c8.setBounds(210,500,250,30);
		  cb8.setBounds(470,500,50,20);
		  c9.setBounds(210,550,250,30);
		  cb9.setBounds(470,550,50,20);
		  c10.setBounds(210,600,250,30);
		  cb10.setBounds(470,600,50,20);
		  c11.setBounds(210,650,250,30);
		  cb11.setBounds(470,650,50,20);
		  c12.setBounds(210,700,250,30);
		  cb12.setBounds(470,700,50,20);
		   c13.setBounds(560,150,250,30);
		 cb13.setBounds(820,150,50,20);
		 c14.setBounds(560,200,250,30);
		 cb14.setBounds(820,200,50,20);
		 c15.setBounds(560,250,250,30);
		 cb15.setBounds(820,250,50,20);
		 c16.setBounds(560,300,250,30);
		 cb16.setBounds(820,300,50,20);
		 c17.setBounds(560,350,250,30);
		 cb17.setBounds(820,350,50,20);
		 c18.setBounds(560,400,250,30);
		  cb18.setBounds(820,400,50,20);
		 c19.setBounds(560,450,250,30);
		  cb19.setBounds(820,450,50,20);
		 c20.setBounds(560,500,250,30);
		  cb20.setBounds(820,500,50,20);
		  c21.setBounds(560,550,250,30);
		  cb21.setBounds(820,550,50,20);
		  c22.setBounds(560,600,250,30);
		  cb22.setBounds(820,600,50,20);
		  c23.setBounds(560,650,250,30);
		  cb23.setBounds(820,650,50,20);
		  c24.setBounds(560,700,250,30);
		  cb24.setBounds(820,700,50,20);
		  l1.setBounds(200,100,310,30);
		   l2.setBounds(550,100,310,30);
		 b1.setBounds(500,750,100,30);
		 //lamount.setBounds(580,620,200,30);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		limage.add(c1);
		 limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		 limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		 limage. add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+250*x;
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+260*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+260*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+260*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class italy_nonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_nonveg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
	ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\nonveg italian.jpg");
		limage=new JLabel(i); 
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
		b1=new JButton("PREVIOUS");
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
		limage.setBounds(0,0,1000,960);
		 c1.setBounds(250,150,250,30);
		 cb1.setBounds(510,150,50,20);
		 c2.setBounds(250,200,250,30);
		 cb2.setBounds(510,200,50,20);
		 c3.setBounds(250,250,250,30);
		 cb3.setBounds(510,250,50,20);
		 c4.setBounds(250,300,250,30);
		 cb4.setBounds(510,300,50,20);
		 c5.setBounds(250,350,250,30);
		 cb5.setBounds(510,350,50,20);
		 c6.setBounds(250,400,250,30);
		  cb6.setBounds(510,400,50,20);
		 c7.setBounds(250,450,250,30);
		  cb7.setBounds(510,450,50,20);
		 c8.setBounds(250,500,250,30);
		  cb8.setBounds(510,500,50,20);
		  c9.setBounds(250,550,250,30);
		  cb9.setBounds(510,550,50,20);
		  c10.setBounds(250,600,250,30);
		  cb10.setBounds(510,600,50,20);
		  c11.setBounds(250,650,250,30);
		  cb11.setBounds(510,650,50,20);
		  c12.setBounds(250,700,250,30);
		  cb12.setBounds(510,700,50,20);
		   c13.setBounds(600,150,250,30);
		 cb13.setBounds(860,150,50,20);
		 c14.setBounds(600,200,250,30);
		 cb14.setBounds(860,200,50,20);
		 c15.setBounds(600,250,250,30);
		 cb15.setBounds(860,250,50,20);
		 c16.setBounds(600,300,250,30);
		 cb16.setBounds(860,300,50,20);
		 c17.setBounds(600,350,250,30);
		 cb17.setBounds(860,350,50,20);
		 c18.setBounds(600,400,250,30);
		  cb18.setBounds(860,400,50,20);
		 c19.setBounds(600,450,250,30);
		  cb19.setBounds(860,450,50,20);
		 c20.setBounds(600,500,250,30);
		  cb20.setBounds(860,500,50,20);
		  c21.setBounds(600,550,250,30);
		  cb21.setBounds(860,550,50,20);
		  c22.setBounds(600,600,250,30);
		  cb22.setBounds(860,600,50,20);
		  c23.setBounds(600,650,250,30);
		  cb23.setBounds(860,650,50,20);
		  c24.setBounds(600,700,250,30);
		  cb24.setBounds(860,700,50,20);
		  l1.setBounds(250,100,310,30);
		   l2.setBounds(600,100,310,30);
		b1.setBounds(250,750,100,30);
		 //lamount.setBounds(580,620,200,30);
		  b1.addActionListener(this);
		 add(limage);
		limage.add(l1);
		limage.add(l2);
		 limage.add(b1);
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		  limage.add(c4);
		 limage.add(c5);
		  limage.add(c6);
		 limage.add(c7);
		  limage.add(c8);
		  limage.add(c9);
		  limage.add(c10);
		  limage.add(c11);
		  limage.add(c12); 
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24); 
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class mexican_veg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	mexican_veg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Vegetarian Empanadas-----RS300");
		c2=new JCheckBox("Mexican Bean Soup----------RS310");
		c3=new JCheckBox("Vegan Delight----------RS320");
		c4=new JCheckBox("Casserole----------RS330");
		c5=new JCheckBox("Crispy Potato Tacos--------RS340");
		c6=new JCheckBox("Mexican Lasagna--------RS350");
		c7=new JCheckBox("Black Beans and Rice--------RS360");
		c8=new JCheckBox("Mexican Pizza----------RS370");
		c9=new JCheckBox("Mexican Corn Salad----------RS380");
	   c10=new JCheckBox("Vegetarian Tacos----------RS390");
	   c11=new JCheckBox("Quinoa Salad-----------RS400");
	   c12=new JCheckBox("Cottage Breakfast Burrito--------RS370");
	   c13=new JCheckBox("Mexican Cauli-Rice--------RS400");
	   c14=new JCheckBox("Fuego del Dragon--------RS360");
	   c15=new JCheckBox("Tomato Quesadilla--------RS270");
	   c16=new JCheckBox("Mexican Tortilla Pan--------RS280");
	   c17=new JCheckBox("Speedy Vegan Burrito--------RS290");
	   c18=new JCheckBox("Crispy Tortilla Pizza--------RS350");
	   c19=new JCheckBox("Vegan Mexican Quinoa--------RS290");
	   c20=new JCheckBox("Speedy Gonzales--------RS310");
	   c21=new JCheckBox("Lentil Tacos-------RS350");
	   c22=new JCheckBox("Nachos--------RS360");
	   c23=new JCheckBox("Burrito--------RS390");
	   c24=new JCheckBox("blue corn nachos--------RS280");
		b1=new JButton("PREVIOUS");
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
		b1.setBounds(570,750,100,30);
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
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+310*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+340*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+380*x;
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
			total=total+400*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class mexican_nonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	mexican_nonveg()
	{
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Skillet Enchiladas-----RS300");
		c2=new JCheckBox("Margarita Chicken----------RS310");
		c3=new JCheckBox("Chili-Stuffed Poblano----------RS320");
		c4=new JCheckBox("Fantastic Fish Tacos----------RS330");
		c5=new JCheckBox("Blue-Ribbon Beef Nachos--------RS340");
		c6=new JCheckBox("Shrimp Tostadas--------RS350");
		c7=new JCheckBox("Steak Fajitas--------RS360");
		c8=new JCheckBox("Chimichangas----------RS370");
		c9=new JCheckBox("Beef Taco Skillet----------RS380");
	   c10=new JCheckBox("Texas Tacos----------RS390");
	   c11=new JCheckBox("Noodles & Ground Beef-----------RS400");
	   c12=new JCheckBox("Chili Lime Shrimp--------RS370");
	   c13=new JCheckBox("Chicken & Cheese Tortilla Pie--------RS400");
	   c14=new JCheckBox("Chicken Fajita Salad--------RS360");
	   c15=new JCheckBox("Sweet 'n' Spicy Chicken--------RS270");
	   c16=new JCheckBox("Chicken Tostada Salad--------RS280");
	   c17=new JCheckBox("Baked Chimichangas--------RS290");
	   c18=new JCheckBox("Shrimp Gazpacho--------RS350");
	   c19=new JCheckBox("Turkey Posole--------RS290");
	   c20=new JCheckBox("Skirt Steak Tacos--------RS310");
	   c21=new JCheckBox("Chicken Verde-------RS350");
	   c22=new JCheckBox("Mexican Chicken  Pizza--------RS360");
	   c23=new JCheckBox("Chicken Fajitas--------RS390");
	   c24=new JCheckBox("Pinto Bean Tostadas--------RS280");
		b1=new JButton("PREVIOUS");
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
		 b1.setBounds(570,750,100,30);
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
		  this.setSize(1000,960);
		  this.setLayout(null);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+310*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+340*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+380*x;
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
			total=total+400*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class Chinesenonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery1 x;
	Chinesenonveg()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Egg And Garlic Fried Rice:-----RS300");
		c2=new JCheckBox("Stir-Fried Chilli Chicken:----------RS310");
		c3=new JCheckBox("Chicken Manchow Soup:----------RS320");
		c4=new JCheckBox("chickken chowmein----------RS330");
		c5=new JCheckBox("Chicken Lollipops--------RS340");
		c6=new JCheckBox("Dragon Chicken--------RS350");
		c7=new JCheckBox("Sweet and sour pork--------RS360");
		c8=new JCheckBox("Kung Pao chicken----------RS370");
		c9=new JCheckBox("Sweet N sour chicken----------RS380");
	   c10=new JCheckBox("Butter Garlic Prawns----------RS390");
	   c11=new JCheckBox("Diced Chicken-----------RS400");
	   c12=new JCheckBox("Egg Drop Soup--------RS370");
	   c13=new JCheckBox("Deep Fried Wontons--------RS400");
	   c14=new JCheckBox(" Chicken Balls--------RS360");
	   c15=new JCheckBox("Pork Ribs--------RS270");
	   c16=new JCheckBox("Chicken Wings--------RS280");
	   c17=new JCheckBox("Prawn Toast--------RS290");
	   c18=new JCheckBox("Crispy Crab--------RS350");
	   c19=new JCheckBox("Grilled Lobster--------RS290");
	   c20=new JCheckBox("Chicken Salad--------RS310");
	   c21=new JCheckBox("Prawn Potstickers-------RS350");
	   c22=new JCheckBox("Chive Potstickers--------RS360");
	   c23=new JCheckBox("Chicken Drumstick--------RS390");
	   c24=new JCheckBox("Tea Smoked Chicken--------RS280");
		b1=new JButton("PREVIOUS");
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
		  b1.setBounds(570,750,100,30);
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
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+310*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+340*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+380*x;
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
			total=total+400*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}
class Chinese extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery z;
	Chinese()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Chinese Broccoli-----RS250");
		c2=new JCheckBox("Chinese Cucumber Salad ----------RS260");
		c3=new JCheckBox("Tofu and Broccoli----------RS270");
		c4=new JCheckBox("Garlic Sesame Noodles----------RS280");
		c5=new JCheckBox("Lo Mein--------RS290");
		c6=new JCheckBox("Vegetable Chow Mein--------RS300");
		c7=new JCheckBox("Sichuan Green Beans--------RS320");
		c8=new JCheckBox("Chinese Eggplant----------RS310");
		c9=new JCheckBox("Chinese Cabbage Salad----------RS330");
	   c10=new JCheckBox("Veg Fried Rice----------RS390");
	   c11=new JCheckBox("East West Spring Rolls-----------RS350");
	   c12=new JCheckBox("Stir Fried Tofu With Rice--------RS360");
	   c13=new JCheckBox("Chilli Paneer Dry--------RS270");
	   c14=new JCheckBox("Crunchy Iceberg Dumpling--------RS290");
	   c15=new JCheckBox("Veg Manchurian--------RS300");
	   c16=new JCheckBox("Honey Chilli Potato--------RS230");
	   c17=new JCheckBox("Deal Sesame Noodles--------RS250");
	   c18=new JCheckBox("Chinese Tacos--------RS320");
	   c19=new JCheckBox("Dry Chilli Baby Corn--------RS300");
	   c20=new JCheckBox("Black Bean Noodles--------RS240");
	   c21=new JCheckBox("Spicy Chilli Garlic Noodles--------RS250");
	   c22=new JCheckBox("Tofu fried rice--------RS260");
	   c23=new JCheckBox("Chinese vegan pancakes--------RS240");
	   c24=new JCheckBox("Hot and sour soup--------RS230");
		b1=new JButton("PREVIOUS");
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
		 b1.setBounds(570,750,100,30);
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
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+250*x;
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+260*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
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
			total=total+350*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+300*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+230*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+250*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
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
			total=total+240*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+250*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+260*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+240*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+230*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class Indianveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery v;
	Indianveg()
	{
		//t.setLocation(300,200);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\indian menu.jpg");
		limage=new JLabel(i);
		c1=new JCheckBox("Garlic Mushroom-----RS190");
		c2=new JCheckBox("Malai Kofta----------RS170");
		c3=new JCheckBox("Kathi Rolls----------RS230");
		//c3.setForeground(Color.red);
		c4=new JCheckBox("Litti Choka----------RS220");
		c5=new JCheckBox("Panner Sathe--------RS130");
		c6=new JCheckBox("Panner Chilli--------RS150");
		c7=new JCheckBox("Panner Tikka--------RS150");
		c8=new JCheckBox("Panner Roll----------RS110");
		c9=new JCheckBox("Spring Roll----------RS130");
	   c10=new JCheckBox("Manchurian----------RS175");
	   c11=new JCheckBox("Veg Crispy-----------RS160");
	   c12=new JCheckBox("Manchaw Soup--------RS130");
	   c13=new JCheckBox("Dal-Fry-----------------------RS180");
	   c14=new JCheckBox("Stuffed Mushrooms-----------RS170");
	   c15=new JCheckBox("Paneer-Butter-Masala--------RS210");
	   c16=new JCheckBox("Rajma-MASALA----------------RS200");
	   c17=new JCheckBox("Kadai-Paneer----------------RS220");
	   c18=new JCheckBox("Dal-Khichdi-----------------RS200");
	   c19=new JCheckBox("Dal-Makhani-----------------RS190");
	   c20=new JCheckBox("Veg-Kurma-------------------RS250");
	   c21=new JCheckBox("Aloo-Gobi-------------------RS230");
	   c22=new JCheckBox("ROTI--------------------------RS70");
	   c23=new JCheckBox("Naan--------------------------RS90");
	   c24=new JCheckBox("Jeera-Rice--------------------RS80");
		b1=new JButton("PREVIOUS");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		//lname.setForeground(Color.red);
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
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
	     limage.setBounds(0,0,1000,960);
		 c1.setBounds(300,150,250,30);
		 cb1.setBounds(560,150,50,20);
		 c2.setBounds(300,200,250,30);
		 cb2.setBounds(560,200,50,20);
		 c3.setBounds(300,250,250,30);
		 cb3.setBounds(560,250,50,20);
		 c4.setBounds(300,300,250,30);
		 cb4.setBounds(560,300,50,20);
		 c5.setBounds(300,350,250,30);
		 cb5.setBounds(560,350,50,20);
		 c6.setBounds(300,400,250,30);
		  cb6.setBounds(560,400,50,20);
		 c7.setBounds(300,450,250,30);
		  cb7.setBounds(560,450,50,20);
		 c8.setBounds(300,500,250,30);
		  cb8.setBounds(560,500,50,20);
		  c9.setBounds(300,550,250,30);
		  cb9.setBounds(560,550,50,20);
		  c10.setBounds(300,600,250,30);
		  cb10.setBounds(560,600,50,20);
		  c11.setBounds(300,650,250,30);
		  cb11.setBounds(560,650,50,20);
		  c12.setBounds(300,700,250,30);
		  cb12.setBounds(560,700,50,20);
		  c13.setBounds(650,150,250,30);
		 cb13.setBounds(910,150,50,20);
		 c14.setBounds(650,200,250,30);
		 cb14.setBounds(910,200,50,20);
		 c15.setBounds(650,250,250,30);
		 cb15.setBounds(910,250,50,20);
		 c16.setBounds(650,300,250,30);
		 cb16.setBounds(910,300,50,20);
		 c17.setBounds(650,350,250,30);
		 cb17.setBounds(910,350,50,20);
		 c18.setBounds(650,400,250,30);
		  cb18.setBounds(910,400,50,20);
		 c19.setBounds(650,450,250,30);
		  cb19.setBounds(910,450,50,20);
		 c20.setBounds(650,500,250,30);
		  cb20.setBounds(910,500,50,20);
		  c21.setBounds(650,550,250,30);
		  cb21.setBounds(910,550,50,20);
		  c22.setBounds(650,600,250,30);
		  cb22.setBounds(910,600,50,20);
		  c23.setBounds(650,650,250,30);
		  cb23.setBounds(910,650,50,20);
		  c24.setBounds(650,700,250,30);
		  cb24.setBounds(910,700,50,20);
		  l1.setBounds(300,100,310,30);
		   l2.setBounds(650,100,310,30);
		 b1.setBounds(570,750,100,30);
		 b1.addActionListener(this);
		 add(limage);
		 limage.add(l1);
		 limage.add(l2);
		 limage.add(c1);
		 limage.add(c2);
		 limage.add(c3);
		 limage.add(c4);
		 limage.add(c5);
		 limage.add(c6);
		 limage.add(c7);
		 limage.add(c8);
		 limage.add(c9);
		 limage.add(c10);
		 limage.add(c11);
		 limage.add(c12);
		 limage.add(c13);
		 limage.add(c14);
		 limage.add(c15);
		 limage.add(c16);
		 limage.add(c17);
		 limage.add(c18);
		 limage.add(c19);
		 limage.add(c20);
		 limage.add(c21);
		 limage.add(c22);
		 limage.add(c23);
		 limage.add(c24);
		  limage.add(cb1);
		  limage.add(cb2);
		  limage.add(cb3);
		  limage.add(cb4);
		  limage.add(cb5);
		  limage.add(cb6);
		  limage.add(cb7);
		  limage.add(cb8);
		  limage.add(cb9);
		  limage.add(cb10);
		  limage.add(cb11);
		  limage.add(cb12);
		  limage.add(cb13);
		  limage.add(cb14);
		  limage.add(cb15);
		  limage.add(cb16);
		  limage.add(cb17);
		  limage.add(cb18);
		  limage.add(cb19);
		  limage.add(cb20);
		  limage.add(cb21);
		  limage.add(cb22);
		  limage.add(cb23);
		  limage.add(cb24);
		  limage.add(b1);
		  this.setLayout(null);
		  this.setSize(1000,960);
		  this.setTitle("Hotel");
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+190*x;
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+170*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+230*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+220*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+130*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+150*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+150*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+110*x;
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+130*x;
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+175*x;
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+160*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+130*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+180*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+170*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+210*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+200*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+220*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+200*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+190*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+250*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+230*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+70*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+90*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+80*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class Indiannonveg extends JFrame implements ActionListener
{
	JLabel l1,limage,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery1 r;
	Indiannonveg()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                              Price                               QTY");
		l2=new JLabel("      Menu                              Price                               QTY");
		//ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\background.jpg");
		//limage=new JLabel(i); 
		//s=new JLabel("STARTERS");
		//lamount=new JLabel();
		c1=new JCheckBox("Macher Jhol-----RS300");
		c2=new JCheckBox("Machcha Besarou----------RS310");
		c3=new JCheckBox("Parsi Fish Curry----------RS320");
		c4=new JCheckBox("Hilsa Fish Curry----------RS330");
		c5=new JCheckBox("Assamese Fish Curry--------RS340");
		c6=new JCheckBox("Chepala Iguru--------RS350");
		c7=new JCheckBox("Meen Curry--------RS360");
		c8=new JCheckBox("Goan Fish Head Curry----------RS370");
		c9=new JCheckBox("Bihari Fish Curry----------RS380");
	   c10=new JCheckBox("Malabari Prawn Curry----------RS390");
	   c11=new JCheckBox("Andhra Crab Meat Masala-----------RS400");
	   c12=new JCheckBox("Rogan Josh--------RS370");
	   c13=new JCheckBox("Gongura Mamsam--------RS400");
	   c14=new JCheckBox("Nihari Mutton--------RS360");
	   c15=new JCheckBox("Champaran Mutton Curry--------RS270");
	   c16=new JCheckBox("Mutton Kofte--------RS280");
	   c17=new JCheckBox("Laal Maas--------RS290");
	   c18=new JCheckBox("Chicken Vindaloo--------RS350");
	   c19=new JCheckBox("Chicken Kolhapuri--------RS290");
	   c20=new JCheckBox("Chicken Korma--------RS310");
	   c21=new JCheckBox("chicken tikka--------RS350");
	   c22=new JCheckBox("chicken handi--------RS360");
	   c23=new JCheckBox("chicken platter--------RS390");
	   c24=new JCheckBox("Brain--------RS280");
		b1=new JButton("PREVIOUS");
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
		 b1.setBounds(570,750,100,30);
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
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			total=total+310*x;
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+320*x;
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+330*x;
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+340*x;
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+380*x;
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
			total=total+400*x;
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+370*x;
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+400*x;
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+270*x;
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+290*x;
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+310*x;
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+350*x;
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+360*x;
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+390*x;
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			total=total+280*x;
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class delivery1 extends JFrame implements ActionListener
{
	JButton t1,t2,t3,t4,t5;
	order previous;
	delivery1()
	{
		t1=new JButton("Indian");
		t2=new JButton("Chinese");
		t3=new JButton("Mexican");
		t4=new JButton("Italian");
		t5=new JButton("Prev");
		t1.setBounds(400,100,200,50);
		t2.setBounds(400,200,200,50);
		t3.setBounds(400,300,200,50);
		t4.setBounds(400,400,200,50);
		t5.setBounds(200,480,100,30);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					order o =new order();
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indiannonveg s=new Indiannonveg();
		}
		if(e.getActionCommand().equals("Chinese"))
		{
			this.setVisible(false);
			Chinesenonveg h=new Chinesenonveg();
		}
		if(e.getActionCommand().equals("Mexican"))
		{
			this.setVisible(false);
			mexican_nonveg mn=new mexican_nonveg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
			italy_nonveg in=new italy_nonveg();
		}
	}
}
class delivery extends JFrame implements ActionListener
{
	JButton t1,t2,t3,t4,t5;
	order previous;
	delivery()
	{
		t1=new JButton("Indian");
		t2=new JButton("Chinese");
		t3=new JButton("Mexican");
		t4=new JButton("Italian");
		t5=new JButton("Prev");
		t1.setBounds(400,100,200,50);
		t2.setBounds(400,200,200,50);
		t3.setBounds(400,300,200,50);
		t4.setBounds(400,400,200,50);
		t5.setBounds(200,480,100,30);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					order o=new order();	
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indianveg z=new Indianveg();
		}
		if(e.getActionCommand().equals("Chinese"))
		{
			this.setVisible(false);
		    Chinese c=new Chinese();
		}
		if(e.getActionCommand().equals("Mexican"))
		{
			this.setVisible(false);
			mexican_veg mv=new mexican_veg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
		    italy_veg iv=new italy_veg();
		}
	}
}
class order extends JFrame implements ActionListener
{
	JButton d1,d2,d3,d4,d5,d6;
	market previous;
	order()
	{
		d1=new JButton("VEG");
		d2=new JButton("NON-VEG");
		d3=new JButton("DESSERTS");
		d4=new JButton("DRINKS");
		d5=new JButton("Prev");
		d1.setBounds(400,100,200,50);
		d2.setBounds(400,200,200,50);
		d3.setBounds(400,300,200,50);
		d4.setBounds(400,400,200,50);
		d5.setBounds(200,480,100,30);
		add(d1);
		add(d2);
		add(d3);
		add(d4);
		add(d5);
	    d1.addActionListener(this);
		d5.addActionListener(this);
		d2.addActionListener(this);
		d3.addActionListener(this);
		d4.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Prev"))
				{
					this.setVisible(false);
					market m=new market();
				}
		if(e.getActionCommand().equals("VEG"))
		{
			this.setVisible(false);
		   delivery d=new delivery();
		}
		if(e.getActionCommand().equals("NON-VEG"))
		{
			this.setVisible(false);
		    delivery1 d=new delivery1();
		}
		
		/*if(e.getActionCommand().equals("DESSERTS"))
		{
			this.setVisible(false);
			Desserts d=new Desserts();
		}
		if(e.getActionCommand().equals("DRINKS"))
		{
			this.setVisible(false);
				   delivery d=new delivery();
		}*/
	}
}
class market extends JFrame implements ActionListener
{
	JButton j1,j2,j3,j4,j5;
	market()
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
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		//j6.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Bombay Taqueria"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Ralphys"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Euthopia"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Solitaire"))
				{
					this.setVisible(false);
					order o=new order();
				}
				if(e.getActionCommand().equals("Ummrao"))
				{
					this.setVisible(false);
					order o=new order();
				}	
	}
}
class Test extends JFrame implements ActionListener
{
	JLabel u1,p1,limage;
	JTextField f1;
	JButton b1;
	JPasswordField pass;
	Test()
	{
		ImageIcon i=new ImageIcon("D:\\Sahilkjava2021\\loginpic.jpg");
		limage=new JLabel(i); 
		u1=new JLabel("USERNAME");
		p1=new JLabel("PASSWORD");
		f1=new JTextField();
		b1=new JButton("Login");
		pass=new JPasswordField();
		u1.setForeground(Color.white);
		p1.setForeground(Color.white);
		limage.setBounds(0,0,1000,1000);
		f1.setBounds(450,300,200,30);
		u1.setBounds(300,300,150,30);
		p1.setBounds(300,350,150,30);
		pass.setBounds(450,350,200,30);
		b1.setBounds(400,450,100,30);
		limage.add(pass);
		limage.add(p1);
		limage.add(u1);
		limage.add(f1);
		limage.add(b1);
         b1.addActionListener(this);
		 add(limage);
		 this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String username=f1.getText();
		String passw=pass.getText();
		if(username.equals("admin")&&passw.equals("abc"))
		{
			if(e.getActionCommand().equals("Login"))
				{
					this.setVisible(false);
					market m=new market();
				}
		}
		else if(username.equals("sahil")&&passw.equals("123"))
		{
			if(e.getActionCommand().equals("Login"))
				{
					this.setVisible(false);
						market m=new market();           
				}
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Incorrect Username or password");
		}
	}
public static void main(String args[])
	{
		Test T=new Test();
	}
}