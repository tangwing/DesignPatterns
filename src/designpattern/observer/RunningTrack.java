package designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class RunningTrack {

	private float length;
//	private Thread[] 
	private ArrayList<Thread>listOfThreads = null; 
	//private int countOfAthlete;
	
	public RunningTrack(float length)//, int countOfAthlete)
	{
		this.length = length;
		//this.countOfAthlete = countOfAthlete;
		listOfThreads = new ArrayList<Thread>();
	}
	
	public void addAthlete(Athlete newAthlete)
	{
		Thread th = new Thread(newAthlete);
		th.setPriority((int)(Math.random()*10)+1);
		listOfThreads.add(th);
	}
	
	public void startRace()
	{
		Iterator<Thread> iterator = listOfThreads.iterator();
		while(iterator.hasNext())
		{
			iterator.next().start();
		}
	}
	
	public float getLength()
	{
		return length;
	}
}
