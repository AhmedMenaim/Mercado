package mercado.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Database {
    public static Vector<User>Users= new Vector<User>();
    public static Vector<StoreOwner>StoreOwners=new Vector<StoreOwner>();
    public static Vector<Customer>Customers=new Vector<Customer>();
    public static Vector<Admin>Adminstrators=new Vector<Admin>();
    public static Vector<Product>SystemProducts=new Vector<Product>();
    public static Vector<Store>Stores=new Vector<Store>();
    public static Vector<Brand>Brands=new Vector<Brand>();
    public static Vector<Stat>Statistics=new Vector<Stat>();
    public static Vector<Product>SuggestedProducts=new Vector<Product>();
    Database(){
    }

   /* public void SaveAccounts() throws IOException {
        fw = new FileWriter("Normal Accounts.txt", true);
        bw = new BufferedWriter(fw);
        //System.out.println(students);
        for (int i = 0; i < Normal.size(); i++) {
            bw.write(Normal.get(i).Name);
            bw.newLine();
            bw.write(Normal.get(i).Password);
            bw.newLine();
            bw.write(Normal.get(i).ID);
            bw.newLine();
            Normal.get(i);
			
            bw.write("------------------------");
            bw.newLine();
        }
        bw.close();

        fw = new FileWriter("Storeowner Accounts.txt", true);
        bw = new BufferedWriter(fw);
        for (int i = 0; i < storeowner.size(); i++) {
            bw.write(storeowner.get(i).Name);
            bw.newLine();
            bw.write(storeowner.get(i).Password);
            bw.newLine();
            bw.write(storeowner.get(i).ID);
            bw.newLine();
            bw.write("------------------------");
            bw.newLine();
        }
        bw.close();
    }
*/
 
}
