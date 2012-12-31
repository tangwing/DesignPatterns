package designpattern.observer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class MyCanvasObserver extends JComponent implements Observer{

	//A static table containing all the positions of athletes
	//which will be updated in real-time
	public static Set<Athlete> hsAth;
	public int count = 0;
	public MyCanvasObserver()
	{
		hsAth = new HashSet<Athlete>();
		this.setBackground(Color.green);
		this.setPreferredSize(new Dimension(1200, 600));
		//pack();
		setVisible(true);
	}
	
	@Override
	public void  update(Observable arg0, Object arg1) {
		
		Athlete a = (Athlete)arg0;
		String msg = "Line "+a.getLineNumber()+",Athlete "+a.getName()+" is at position "+a.getPosition();
		if(((Boolean)arg1).booleanValue()==true)
			msg+=". He/she arrives The end point!";
		System.out.println(msg);
		hsAth.add(a);
//		if(GUI.g != null)
//			paint(GUI.g);
		//count++;
		//if(this.getGraphics()!=null)paintComponent(this.getGraphics());
//		synchronized (MyCanvasObserver.class) {
//			
			//this.repaint();
//		}
		//GUI.gg.revalidate();//repaint();
		//this.revalidate();
	}
	
	public void update(Graphics g)
	{
		super.update(g);
		System.out.println("update!");
	}
	//Draw the ground and athletes according to hsAth
	public void repaint()
	{
		super.repaint();
		System.out.println("Repaint!");
	}
	
	public void paint(Graphics g)
	{
		//super.paint(g);
		System.out.println("In paint!");
		drawPlayGround(g);
		drawAthletes(g);
	}
	public void paintComponent(Graphics g)
	{
		//super.paint(g);
		System.out.println("In paintCom!");
		drawPlayGround(g);
		drawAthletes(g);
	}
	private void drawPlayGround(Graphics g)
	{
		System.out.println("In drawPlayGround!");
		g.setColor(Color.gray);
		g.fillRect(100, 50, 1000, 500);
		g.setColor(Color.white);
		for(int i=0; i<9; i++)
		{
			g.drawLine(100, 100+i*50, 1100, 100+i*50);
		}
	}
	
	private void drawAthletes(Graphics g)
	{
		System.out.println("In drawAthletes!");
		Iterator<Athlete> i = hsAth.iterator();
		g.setColor(Color.red);
		while(i.hasNext())
		{
			Athlete a = i.next();
			g.fill3DRect((int)(100+10*a.getPosition()), 55+50*a.getLineNumber(),
					40, 40, true);
			System.out.println(a.getPosition()+";"+a.getLineNumber());
		}
	}


}
