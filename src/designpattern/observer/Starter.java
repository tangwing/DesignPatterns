package designpattern.observer;

public class Starter {

	public static RunningTrack rt = null;
	public static SimpleObserver so = new SimpleObserver();
	public static  MyCanvasObserver mco = new MyCanvasObserver();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getReady();
		new GUI();
		startRace();
//		while(true)
//		{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			gui.repaint();
//		}
	}
	
	public static void getReady()
	{
		rt = new RunningTrack(20);
		for(int i=0; i<10; i++)
		{
			Athlete a = new Athlete(String.valueOf((char)('A'+i)), "French", i, rt);
			a.addObserver(mco);
			rt.addAthlete(a);
		}
	}
	
	public static void startRace()
	{
		rt.startRace();
	}

}
