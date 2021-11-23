import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {
   
	private boolean state=false;
	private String nationalId; 
	private int lisence; 
	private int balance;
        RegisterationUser registeredDriver;
	ArrayList<RegisterationUser>logedInDrivers;
	ArrayList<FavoriteArea> favoriteArea;
	static ArrayList<Driver>pending=new ArrayList<Driver>();
	public Driver() {
	    logedInDrivers = new ArrayList<RegisterationUser>();
            pending.add(this);
	}

    public void setState(boolean state) {
        this.state = state;
    }
	
        

	public void login(String email , String password ) {
		RegisterationUser loggedInDriver = new RegisterationUser(email , password);
                logedInDrivers.add(loggedInDriver);
		
	}

	public void register(String email , String name , String password , String Id) throws IOException {
                //setRegisteredDriver(new RegisterationUser(email, name, password, Id));
		if(this.getRegisteredDriver().getstate())
                {
                    File file2 = new File("info\\verfiedDriver.txt");
                      FileWriter f2 = new FileWriter(file2.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(f2);
                        bw.write(name);
                        bw.write(password);
                        bw.write(email);
                        bw.write(Id);
                        bw.close();
                        System.out.println("Registeration is complete");
                }
                else
                { 
                	setRegisteredDriver(new RegisterationUser(email, name, password, Id));
                    setNationalId(Id);
                    
                }
                
                
		
	}

    public RegisterationUser getRegisteredDriver() {
        return registeredDriver;
    }

    public void setRegisteredDriver(RegisterationUser registeredDriver) {
        this.registeredDriver = registeredDriver;
    }
    
        

	public int getLisence() {
		return lisence;
	}

	public String getNationalId() {
		return nationalId;
	}

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
        
	public void AddFavArea(FavoriteArea fav) {
		favoriteArea.add(fav);
		
	}
	public void Startride() {
		System.out.println("Ride started");
	}
	public void Endride() {
		System.out.println("Ride Ended");
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
        public static ArrayList<Driver> getpending()
         {
            return pending;
                    
          }


		public void setstate(boolean b) {
			this.state=b;
			
		}
		public boolean getstate() {
			
			return state ;
		}
        
	}