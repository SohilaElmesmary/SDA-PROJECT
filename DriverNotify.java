
public class DriverNotify implements Observer {
	NotificationCenter x; 
	
	public DriverNotify(NotificationCenter z) {
		this.x=z;
	}
	public void update() {
		this.x.getChange();
	}

}
