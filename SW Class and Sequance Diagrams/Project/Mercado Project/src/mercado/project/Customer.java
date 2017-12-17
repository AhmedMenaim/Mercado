package mercado.project;

import java.util.Vector;
import static mercado.project.Database.SystemProducts;

public class Customer extends User {
    public int numberOfProductsBought = 0;
    public Cart c;
    public int Voucher = 0;

    public void viewProduct(Product p) {
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Product Price: " + p.getPrice());
        System.out.println("Product Type: " + p.getType());
        System.out.println("Product Discount: " + p.getDiscount());
        p.NumberOfViews++;

    }

    public void viewStore(String storename) {
        Store s = new Store();
        for (int i = 0; i < Database.Stores.size(); i++) {
            if (Database.Stores.get(i).getStoreName() == storename) {
                System.out.println("Store Name: " + Database.Stores.get(i).getStoreName());
                System.out.println("StoreOwner Name: " + Database.Stores.get(i).getOwnerName());
                System.out.println("Store Address: " + Database.Stores.get(i).getAddress());
                System.out.println("Store Email: " + Database.Stores.get(i).getEmail());
                System.out.println("Store Phone: " + Database.Stores.get(i).getPhone());
                System.out.println();
                System.out.println("Store Products");
                for (int j = 0; j < Database.Stores.get(i).StoreProducts.size(); j++) {
                    System.out.println((j + 1) + ". " + Database.Stores.get(i).StoreProducts.get(j).getProductName());
                }
                s.NumberOfViews++;
                break;
            } else {
                System.out.println("Store Doesn't Exist in System..!");
            }
        }
    }

    public boolean VerifyVC(String id, String pw) {
        if (id.length() == 6 && pw.length() == 4) {
            return true;
        }
        return false;
    }

    public void Pay(Cart c) {
        Customer u=new Customer();
        System.out.println("Which Way You want to pay with:");
        System.out.println("1.Cash \n 2.Visa Card \n 3.Voucher Cards");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("You Will Pay " + c.getTotalMoney() + " L.E on deliver");
        } else if (choice == 2) {
            System.out.print("Enter Visacard ID: ");
            String vc = in.next();
            System.out.print("Enter Password: ");
            String pw = in.next();
            if (VerifyVC(vc, pw)) {
                System.out.println("the Total Money You Will Pay From Your Balance is " + c.getTotalMoney() + " L.E");
            } else {
                System.out.println("Wrong Visa ID or Password");
            }
        } else if (choice == 3) {
            if (this.Voucher >= c.getTotalMoney()) {
                System.out.println("Done");
                this.Voucher -= c.getTotalMoney();
                System.out.println("Your Voucher Balance = " + this.Voucher);
            }
        }
        u.numberOfProductsBought++;
    }

    public void removeProductFromCart(Product P) {
        boolean exist = false;
        for (int i = 0; i < c.CustomerProducts.size(); i++) {
            if (c.CustomerProducts.get(i) == P) {
                c.CustomerProducts.remove(P);
                exist = true;
                break;
            }
        }
        if (exist == true) {
            System.out.println("Removed Successfully");
        } else {
            System.out.println("Product Doesn't Exist !");
        }
    }

    public void addProductToCart(Product P) {
        c.CustomerProducts.add(P);
        c.setTotalMoney((int) (c.getTotalMoney() + P.getPrice()));
        c.setNumberOfProducts(c.getNumberOfProducts() + 1);
    }

    public void SuggestProduct(Product P) {
        Database.SuggestedProducts.add(P);
    }

    public void VeiwBrand(String Brandname)
    {
        Brand b=new Brand();
        for (int i = 0; i < Database.Brands.size(); i++) {
            if (Database.Brands.get(i).getBrandName() == Brandname) {
                System.out.println("Brand Name: " + Database.Brands.get(i).getBrandName());
                System.out.println("Brand country: " + Database.Brands.get(i).getCountry());
                System.out.println("Brand branches: " + Database.Brands.get(i).getBranches());
                System.out.println(" Email: " + Database.Brands.get(i).getEmail());
                System.out.println(" Phone: " + Database.Brands.get(i).getPhone());
                System.out.println();
                b.brandVists++;
                break;
            } else {
                System.out.println("Store Doesn't Exist in System..!");
            }
        }
    }
}
