
public class UserNotify implements Observer {
	NotificationCenter x;
	
	@Override
	public void update() {
		this.x.getChange();
	}
	 public UserNotify(NotificationCenter z) {
	    	this.x=z;
	    }
}
