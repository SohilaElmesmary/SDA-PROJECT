import java.util.ArrayList;

public class User  {

	ArrayList<RegisterationUser> registeredUsers;
	ArrayList<RegisterationUser> logedInUsers;
	private String source;
	private String destination;
	private int counter=1;
	Offer o;
	
	public User() {
		logedInUsers = new ArrayList<RegisterationUser>();
	    registeredUsers = new ArrayList<RegisterationUser>();
	   
	}
   
	public void requestRide(String source , String destination) {
		this.setSource(source);
		this.setDestination(destination);
		counter++;
	}

	public void login(String email , String password ) {
		RegisterationUser logedInUser = new RegisterationUser(email , password);
        logedInUsers.add(logedInUser);
		
	}

	public void register(String email , String name , String password , String type) {
		RegisterationUser registredUser = new RegisterationUser(email ,name, password, "User");
       registeredUsers.add(registredUser);
		
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getCounter() {
		return counter;
	}
 
	public void setOffer (Offer p)
	   {
		   this.o=p;
		   
	   }
	   public Offer getOffer()
	   {
		return o;
	   }
	
	   public int Ratedriver() {
			return 10;
		}

}
