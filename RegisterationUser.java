

public class RegisterationUser  {
		   private String Name; 
		   private String Email; 
		   private String Password;
		   private String Type;
                   private boolean state;
		   public RegisterationUser(String email , String name , String password , String type) {
			   this.Email=email;
			   this.Name=name;
			   this.Password=password;
			   this.Type=type;
                           state=false;
		   }

		public RegisterationUser(String email2, String password2) {
			// TODO Auto-generated constructor stub
		}

		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getType() {
			if (Type.equalsIgnoreCase("driver"))
					
			return Type;
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
                public void setstate(boolean state)
                {
                    this.state=state;
                }
                public boolean getstate()
                {
                    return state;
                }
		
		//public abstract void login();
		//public abstract void register();

    public void setState(boolean state) {
        this.state = state;
    }
		}
		
