package mercado.project;

import java.util.Scanner;

/**
 * @author Abanoub Magdy
 */
public class MercadoProject {
   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("1.Register\n2.Login\n3.Exit");
        int choice=in.nextInt();
        OUTER:
        while (true) {
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    {
                        User u=new User();
                        u.Register();
                        Database.Users.add(u);
                        System.out.println("Registeration Successfully ^_^ ");
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
