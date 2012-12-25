package designpattern.observer;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUI extends JFrame{

	public static Graphics g=null;
	public static GUI gg = null;
	public GUI()
	{
		JPanel panel = new JPanel();
		add(panel);
		panel.add(new MyCanvasObserver());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
//		if(g!=null)
//		{
//			g = getGraphics();
//		}
//		if(gg == null)
//			gg=this;
	}
}
