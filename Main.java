import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
            AdminUser admin=new AdminUser();
		Scanner input = new Scanner(System.in);
        System.out.println("Registration Page");
        System.out.println("NOTE: your username is a unique one so it cannot be changed.");
        System.out.printf("Username: ");
        String user = input.next();
        System.out.printf("Email: ");
        String email = input.next();
        System.out.printf("Password: ");
        String pass = input.next();
        System.out.printf("Confirm Password: ");
        String conf = input.next();
        int length = pass.length();
        String passInt =pass;
        String confInt = conf;
        System.out.printf("Are you a driver or user: ");
        String type = input.next();
        File file = new File("C:\\Users\\asus\\User.txt");
        File file2 = new File("C:\\Users\\asus\\Driver.txt");
        file.createNewFile();
        file2.createNewFile();
        if (length < 6) {
            System.out.println("Too short password, password must be 6 characters or more");
        } else {
            if (passInt.equals(confInt)) {

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String current;
                    boolean checkname = false;
                    while ((current = br.readLine()) != null) {
                        if(current.equalsIgnoreCase(user)){
                            checkname = true;
                    }
                }
                if (checkname) {
                    System.out.println("Username is already exists and used, please type another one");
                } else if(type.equalsIgnoreCase("User")){
                    
                    try {
                        FileWriter f = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(f);
                        bw.write(user);
                        bw.write(pass);
                        bw.close();
                        System.out.println("You registered succesfully");
                        User U = new User();
                        U.register(email, user, pass, "User");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if(type.equalsIgnoreCase("Driver"))
                {
                	try {
                		 System.out.println("Enter License:");
                		 String license=input.next();
                		 System.out.println("Enter National Id:");
                		 String Id =input.next();
                        FileWriter f2 = new FileWriter(file2.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(f2);
                        bw.write(user);
                        bw.write(pass);
                        bw.write(license);
                        bw.write(Id);
                        bw.close();
                        System.out.println("You registered succesfully");
                        Driver D = new Driver();
                        admin.setPending();
                        admin.getPending();
                        System.out.println("As an admin choose the number of driver to verify");
                        int num=input.nextInt();
                        
                        admin.verifyDriver(num);
                        D.register(email, user, pass, Id);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } 
            catch (Exception e) {
            }
        } else  {
            System.out.println("Password and confirm password are not matching");
        }
     }
  }
}