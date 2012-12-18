package polytech.designpattern.observer;

public class Starter {

	public static RunningTrack rt = null;
	public static SimpleObserver so = new SimpleObserver();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getReady();
		startRace();
	}
	
	public static void getReady()
	{
		rt = new RunningTrack(100);
		for(int i=0; i<10; i++)
		{
			Athlete a = new Athlete(String.valueOf(('A'+i)), "French", i, rt);
			a.addObserver(so);
			rt.addAthlete(a);
		}
	}
	
	public static void startRace()
	{
		rt.startRace();
	}

}
