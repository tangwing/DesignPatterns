package designpattern.observer;

import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUI extends JFrame{

	public static Graphics g=null;
	public static GUI gg = null;
	public GUI()
	{
//		JPanel panel = new JPanel();
//		add(panel);
//		panel.
		MyCanvasObserver mco = new MyCanvasObserver();
		add(mco);
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
