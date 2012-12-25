package designpattern.observer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

@SuppressWarnings("serial")
public class MyCanvasObserver extends Canvas implements Observer{

	//A static table containing all the positions of athletes
	//which will be updated in real-time
	public static Set<Athlete> hsAth;
	
	public MyCanvasObserver()
	{
		hsAth = new HashSet<Athlete>();
		this.setBackground(Color.green);
		this.setSize(1200, 600);
	}
	
	@Override
	public synchronized void update(Observable arg0, Object arg1) {
		
		Athlete a = (Athlete)arg0;
		String msg = "Line "+a.getLineNumber()+",Athlete "+a.getName()+"is at position "+a.getPosition();
		if(((Boolean)arg1).booleanValue()==true)
			msg+=". He/she arrives The end point!";
		System.out.println(msg);
		hsAth.add(a);
//		if(GUI.g != null)
//			paint(GUI.g);
		repaint();
		//GUI.gg.revalidate();//repaint();
		//this.revalidate();
	}
	
//	public void update(Graphics g)
//	{
//		super.update(g);
//	}
	//Draw the ground and athletes according to hsAth
	public void repaint()
	{
		super.repaint();
		if(getGraphics() != null)
			paint(getGraphics());
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		drawPlayGround(g);
		drawAthletes(g);
		System.out.println("In paint!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	private void drawPlayGround(Graphics g)
	{
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
