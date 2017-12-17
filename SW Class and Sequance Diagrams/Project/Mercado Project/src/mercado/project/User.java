package mercado.project;

import mercado.project.Database;
import java.awt.*;
import java.util.Scanner;
import java.util.Vector;
import static mercado.project.Database.SystemProducts;
import static mercado.project.Database.Users;

public class User {

    private String userName;
    private String userAddress;
    private String firstName;
    private String lastName;
    private String Email;
    private String Password;
    private int phoneNumber;
    private int Age;
    int NumberOfvisits=0
    private String Type;
    Scanner in= new Scanner(System.in);

    public User(){
        userName="";
        userAddress="";
        firstName="";
        lastName="";
        Email="";
        Password="";
        phoneNumber=0;
        Age=0;
    }
    public User(String fn,String ln , String un , String pw,String email ,int pn , int a ,String ua ){
        userName=un;
        userAddress=ua;
        firstName=fn;
        lastName=ln;
        Email=email;
        Password=pw;
        phoneNumber=pn;
        Age=a;
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email=Email;
    }

    public String getPassword() {
        return this.Password;
    }
    public void setPassword(String Password) {
        this.Password=Password;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return this.Age;
    }
    public void setAge(int Age) {
        this.Age=Age;
    }
    public String getType() {
        return this.Type;
    }
    public void setType(String Type) {
        this.Type=Type;
    }

    public boolean VerifyUserName(String un){
        for(int i=0;i<Users.size();i++){
            if(Users.get(i).userName==un){
                return false;
            }
        }
        return true;
    }
    public static boolean VerifyEmail(String e){
        for(int i=0;i<Users.size();i++){
            if(Users.get(i).Email==e){
                return false;
            }
        }
        return true;
    }

    public boolean VerifyUser(String un , String pw,String t){
        for(int i=0;i<Users.size();i++){
            if(Database.Users.get(i).userName==un && Database.Users.get(i).Password==pw && Database.Users.get(i).Type==t){
                return true;
            }
        }
        return false;
    }

public void Register(User u) {
        System.out.println("Please Enter The Following Data:");

        System.out.print("Enter First Name:");
        u.setFirstName(in.next());

        System.out.print("Enter Last Name:");
        u.setLastName(in.next());

        System.out.print("Enter Username:");
        String un=in.next();
        while(true) {
            if (VerifyUserName(un)) {
                u.setUserName(un);
                break;
            } else {
                System.out.println("Already Used Username .. Try Again");
                un = in.next();
            }
        }
        
        System.out.print("Enter Type(Customer or Store Owner):");
        u.setType(in.next());
      
        
        System.out.print("Enter Email:");
        String e=in.next();
        while(true) {
            if (VerifyEmail(e)) {
                u.setEmail(e);
                break;
            } else {
                System.out.println("You Are Already User Log in With Your Username and Password OR Try Another Email");
                e=in.next();
            }
        }

        System.out.print("Enter Password:");
        u.setPassword(in.next());

        System.out.print("Enter Address:");
        u.setUserAddress(in.next());

        System.out.print("Enter Phone Number:");
        u.setPhoneNumber(in.nextInt());

        System.out.print("Enter Age:");
        u.setAge(in.nextInt());
        
        Database.Users.add(u);
       
    }

    public void SignIn(String un, String pw,String t) {
       User u=new User();
        while(true) {
            if (VerifyUser(un,pw,t)) {
                System.out.println("You Are Logged in Successfully :)");
                break;
            } else {
                System.out.println("You Entered Wrong Username or Password .. Try Again");

                System.out.print("Enter Your Username:");
                un=in.next();
                System.out.print("Enter Your Password:");
                pw=in.next();
            }
        }
        u.NumberOfvisits++;
    }

    public void SignOut() {
        // TODO - implement User.SignOut
        throw new UnsupportedOperationException();
    }

    public void updateData(User u){
        
        int choice;
        System.out.println("Choose Which data you Want To Update");
        System.out.println(" 1.First Name\n 2.Last Name\n 3.Password\n 4.Address\n 5.Phone Number\n 6.Age\n 7.close");
        choice = in.nextInt();
        while(true){
            if(choice==1){
                String temp= in.next();
                u.setFirstName(temp);
            }else if(choice==2){
                String temp=in.next();
                u.setLastName(temp);
            }else if(choice==3){
                String temp=in.next();
                u.setPassword(temp);
            }else if(choice==4){
                String temp=in.next();
                u.setUserAddress(temp);
            }else if(choice==5){
                int temp=in.nextInt();
                u.setPhoneNumber(temp);
            }else if(choice==6){
                int temp=in.nextInt();
                u.setAge(temp);
            }else if (choice==7){
                break;
            }else{
                System.out.println("Wrong Choice");
            }
        }
    }

    public boolean VerifyStore(String StoreName ){
        for (int i = 0; i <Database.Stores.size(); i++) {
            if (Database.Stores.get(i).getStoreName() == StoreName) {
                return true;
            }
        }
        return false;
    }

    public Store getStore(String StoreName ) {
        Store St = new Store();
        for (int i = 0; i < Database.Stores.size(); i++) {
            if (Database.Stores.get(i).getStoreName() == StoreName) {
                St = Database.Stores.get(i);
                break;
            }
        }
        return St;
    }
    public void ExploreProductsInStrore(String storename) {
        if(VerifyStore(storename)){
            Store St=getStore(storename);
            System.out.println("Stores' Products List:");
            for(int i=0;i<St.StoreProducts.size();i++){
                System.out.println((i+1)+"."+St.StoreProducts.get(i).getProductId()+" "+St.StoreProducts.get(i).getProductName()+" "+St.StoreProducts.get(i).getPrice() + " "+St.StoreProducts.get(i).getType());
            }
        }else{
            System.out.println("Wrong Store Name.. Try Again");
            String sn=in.next();
            ExploreProductsInStrore(sn);
        }
    }

    public void viewProduct(String name) {
        for(int i=0;i< SystemProducts.size();i++){
            if(SystemProducts.get(i).getProductName()==name){
                System.out.println("Product ID: "+SystemProducts.get(i).getProductId());
                System.out.println("Product Name: "+SystemProducts.get(i).getProductName());
                System.out.println("Product Price: "+SystemProducts.get(i).getPrice());
                System.out.println("Product Type: "+SystemProducts.get(i).getType());
                System.out.println("Product Discount: "+SystemProducts.get(i).getDiscount());
                break;
            }else{
                System.out.println("Product Doesn't Exist in System..!");
            }
        }
        for(int i=0;i<Database.Stores.size();i++){
            for(int j=0;j<Database.Stores.get(i).StoreProducts.size();j++){
                System.out.println("Store Name: "+Database.Stores.get(i).getStoreName());
                System.out.println("Product ID: "+Database.Stores.get(i).StoreProducts.get(j).getProductId());
                System.out.println("Product Name: "+Database.Stores.get(i).StoreProducts.get(j).getProductName());
                System.out.println("Product Price: "+Database.Stores.get(i).StoreProducts.get(j).getPrice());
                System.out.println("Product Type: "+Database.Stores.get(i).StoreProducts.get(j).getType());
                System.out.println("Product Discount: "+Database.Stores.get(i).StoreProducts.get(j).getDiscount());
                break;
            }
        }

    }
    public void viewProductInStore(String storename){
        Store st=new Store();
        if(VerifyStore(storename)){
            st=getStore(storename);
            System.out.println("Enter ProductName You Want To View:");
            String productname=in.next();
            for(int i=0;i<st.StoreProducts.size();i++){
                if(st.StoreProducts.get(i).getProductName()==productname){
                    System.out.println("Product ID: "+st.StoreProducts.get(i).getProductId());
                    System.out.println("Product Name: "+st.StoreProducts.get(i).getProductName());
                    System.out.println("Product Price: "+st.StoreProducts.get(i).getPrice());
                    System.out.println("Product Type: "+st.StoreProducts.get(i).getType());
                    System.out.println("Product Discount: "+st.StoreProducts.get(i).getDiscount());
                    break;
                }else{
                    System.out.println("Product Doesn't Exist in This Store..!");
            }
          }
        }else{
            System.out.println("Wrong Store Name ..  ");
        }
    }

}