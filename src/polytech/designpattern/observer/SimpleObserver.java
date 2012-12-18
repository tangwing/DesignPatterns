package polytech.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		Athlete a = (Athlete)arg0;
		String msg = "Line "+a.getLineNumber()+",Athlete "+a.getName()+"is at position "+a.getPosition();
		if(((Boolean)arg1).booleanValue()==true)
			msg+=". He/she arrives The end point!";
		System.out.println(msg);
	}

	
}
