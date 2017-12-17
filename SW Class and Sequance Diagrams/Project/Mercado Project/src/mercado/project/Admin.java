package mercado.project;

import static mercado.project.Database.Brands;

public class Admin extends User {
    
    public void addVoucherCard(Customer c) {
        c.Voucher+=10;
    }
    public boolean VerifyProduct(String name){
        for (int i = 0; i <Database.SystemProducts.size(); i++) {
            if (Database.SystemProducts.get(i).getProductName()== name) {
                return true;
            }
        }
        return false;
    } 
    
    public void addProduct(Product p) {
        if(VerifyProduct(p.getProductName())){
            System.out.println("Product Already Exist .. You Want To Increase Quantity ? (Enter Yes or No)");
            String D=in.next();
            if(D.toLowerCase()=="yes"){
                System.out.print("Enter The Amount You Want To Add:");
                int q=in.nextInt();
                p.setQuantity(p.getQuantity()+q);
                System.out.println("Done");
            }else{
                return;
            }
        }else{
            Database.SystemProducts.add(p);
            System.out.println("Product Added To System Successfully");
        }
    }
    
    public void MakeAdmin(String username){
        for(int i=0;i<Database.Users.size();i++){
            if(Database.Users.get(i).getUserName()==username){
                Database.Users.get(i).setType("Admin");
                break;
            }
        }
    }
    
    public void addBrand(Brand b) {
        Brand s = new Brand();
        System.out.print("Enter Brand Name: ");
        String sn = in.next();
        for (int i = 0; i < Database.Brands.size(); i++) {
            if (Database.Brands.get(i).getBrandName() == sn) {
                System.out.println("Store Already Exist.. Try Again");
                return;
            } else {
                s.setBrandName(sn);
                break;
            }
        }

        System.out.println("Enter Brand Name: ");
        s.setBrandName(in.next());

        System.out.println("Enter Brand E-mail: ");
        s.setEmail(in.next());

        System.out.println("Enter Brand Phone Number: ");
        s.setPhone(in.next());

        System.out.println("Enter Brand Country: ");
        s.setCountry(in.next());
        
        System.out.println("Enter Brand Branches: ");
        s.setBranches(in.next());
        
        
    }

    public void updateBrand(String Bname) {
        
           boolean exist=false;
        for (Brand s : Brands) {
            if (s.getBrandName() == Bname) {
                int choice;
                System.out.println("Choose Which data you Want To Update");
                System.out.println(" 1.Name 2.Email \n 3.Phone Number \n 4.Country \n 5.Branches \n 6.close");
                choice = in.nextInt();
                while (true) {
                    if (choice == 2) {
                        s.setEmail(in.next());
                    } else if (choice == 3) {
                        s.setPhone(in.next());
                    } else if (choice == 4) {
                        s.setCountry(in.next());
                    }
                    else if (choice==5){
                        s.setBranches(Bname);
                    }
                    else if (choice==1){
                    s.setBrandName(Bname);
                    }
                    else if (choice == 6) {
                        break;
                    } else {
                        System.out.println("Wrong Choice");
                    }
                }
                exist=true;
                break;
            }
        }
        if(exist==false){
            System.out.println("Store Doesn't Exist !");
        }
        
    }


}