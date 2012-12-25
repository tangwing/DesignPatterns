package designpattern.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Athlete extends Observable implements Runnable{

	private String name;

	private String nationality;
	private int lineNumber;
	private float position;
	private RunningTrack rt = null;
	
	private ArrayList<Observer> observerList;
	public Athlete(String name, String nation, int linenum, RunningTrack rt)
	{
		this.name = name;
		nationality = nation;
		lineNumber = linenum;
		position = 0;
		this.rt= rt; 
		observerList = new ArrayList<Observer>();
	}
	

	@Override
	public void run() {
		//notifyObserver(false);
		while(position < rt.getLength())
		{
			position++;
			//if(p)
			notifyObserver(false);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObserver(true);
		
	}

	@Override
	public void addObserver(Observer o)
	{
		observerList.add(o);
	}
	
	@Override
	public void deleteObserver(Observer o)
	{
		observerList.remove(o);
	}
	
	public void notifyObserver(Object arg)
	{
		for(Observer o : observerList)
		{
			o.update(this, arg);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	public float getPosition() {
		return position;
	}
}
