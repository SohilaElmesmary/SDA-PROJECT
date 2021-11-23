import java.io.IOException;
import java.util.ArrayList;

public class AdminUser {
    ArrayList<Driver> pending;
 public void verifyDriver(int num) throws IOException {
	 pending.get(num-1).setstate(true);
         String name=pending.get(num-1).getRegisteredDriver().getName();
         String email=pending.get(num-1).getRegisteredDriver().getEmail();
         String password=pending.get(num-1).getRegisteredDriver().getPassword();
         String Id=pending.get(num-1).getNationalId();
         pending.get(num-1).register( email,name, password, Id);
	 
 }

    public void setPending() {
        this.pending = Driver.getpending();
    }

    public ArrayList<Driver> getPending() {
        return pending;
    }
    
 
} 
