import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCenter extends Ride{
	ArrayList<Observer> observerList;
	@Override
	public void Notify() {
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();)
	        {
	            Observer o = it.next();
	            o.update();
	        }            
		
	}

	@Override
	public void add(Observer x) {
		// TODO Auto-generated method stub
		
	}
	public  String getChange() {
		return null  ;
		
	}

}
