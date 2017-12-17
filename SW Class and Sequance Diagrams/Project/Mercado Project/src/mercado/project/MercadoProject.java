package mercado.project;

import java.util.Scanner;
import static mercado.project.Database.Users;

/**
 * @author Abanoub Magdy
 */
public class MercadoProject {
   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        OUTER:
        while (true) {
            System.out.println("1.Register\n2.Login\n3.Exit");
            int choice=in.nextInt();
            switch (choice) {
                case 1:
                    {
                        User u = new User();
                        u.Register(u);
                        System.out.println("Registeration Successfully ^_^ ");
                        /*System.out.println("Vector Size: "+Users.size());
                        for(int i=0;i<Users.size();i++){
                            System.out.println("Username: "+Users.get(i).getUserName()+" Password: "+Users.get(i).getPassword()+" Type: "+Users.get(i).getType());
                        }*/
                        break;
                    }
                case 2:
                    {
                        String un, pw,t;
                        System.out.print("Enter Your Username:");
                        un=in.next();
                        System.out.print("Enter Your Password:");
                        pw=in.next();
                        System.out.print("Enter Your Type(Customer or Store Owner or Admin):");
                        t=in.next();
                        User u=new User();
                        u.SignIn(un, pw, t);
                        
                        break OUTER;
                    }
                case 3:
                    break OUTER;
                default:
                    break;
            }
        }
    }
    
}
