package mercado.project;

import java.awt.BorderLayout;
import java.util.Vector;

public class StoreOwner extends User {
    private int numberOfProductsOwn;
    public Vector<Store> MyStores = new Vector<Store>();

    public void marketProduct(int Product) {
        // TODO - implement StoreOwner.marketProduct
        throw new UnsupportedOperationException();
    }

    public void suggestProduct(int Product) {
        // TODO - implement StoreOwner.suggestProduct
        throw new UnsupportedOperationException();
    }

    public void Updatestore(String name) {
        boolean exist=false;
        for (Store s : MyStores) {
            if (s.getStoreName() == name) {
                int choice;
                System.out.println("Choose Which data you Want To Update");
                System.out.println(" 1.Email \n 2.Phone Number \n 3.Address \n 4.close");
                choice = in.nextInt();
                while (true) {
                    if (choice == 1) {
                        s.setEmail(in.next());
                    } else if (choice == 2) {
                        s.setPhone(in.next());
                    } else if (choice == 3) {
                        s.setAddress(in.next());
                    } else if (choice == 4) {
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

    public void Addstore() {
        Store s = new Store();
        System.out.print("Enter Store Name: ");
        String sn = in.next();
        for (int i = 0; i < Database.Stores.size(); i++) {
            if (Database.Stores.get(i).getStoreName() == sn) {
                System.out.println("Store Already Exist.. Try Again");
                return;
            } else {
                s.setStoreName(sn);
                break;
            }
        }

        System.out.print("Enter Owner Name: ");
        s.setOwnerName(in.next());

        System.out.println("Enter Store E-mail: ");
        s.setEmail(in.next());

        System.out.println("Enter Store Phone Number: ");
        s.setPhone(in.next());

        System.out.println("Enter Store Address: ");
        s.setAddress(in.next());

    }

    public boolean Removestore(String name) {
        for (Store s : MyStores) {
            if (s.getStoreName() == name) {
                MyStores.remove(s);
                return true;
            }
        }
        return false;
    }

    public void Viewstore(String name) {
        boolean exist = false;
        for (Store s : MyStores) {
            if (s.getStoreName() == name) {
                System.out.println("Store Info: ");
                System.out.print("Store Name: " + s.getStoreName());
                System.out.print("Store Owner Name: " + s.getOwnerName());
                System.out.print("Store Address: " + s.getAddress());
                System.out.print("Store Phone Number: " + s.getPhone());
                System.out.print("Store E-Mail: " + s.getEmail());
                System.out.println();
                System.out.println("Store Products: ");
                for (int j = 0; j < s.StoreProducts.size(); j++) {
                    System.out.println((j + 1) + " ." + s.StoreProducts.get(j).getProductName());

                }
                exist = true;
                break;
            }
        }
        if (exist == false) {
            System.out.println("Store Doesn't Exist !");
        }

    }

    public int ViewNumberOfProductViews(String name, String storename) {
        int x = 0;
        for (int i = 0; i < MyStores.size(); i++) {
            if (MyStores.get(i).getStoreName() == storename) {
                for (int j = 0; j < MyStores.get(i).StoreProducts.size(); j++) {
                    if (MyStores.get(i).StoreProducts.get(j).getProductName() == name) {
                        x = MyStores.get(i).StoreProducts.get(j).NumberOfViews;
                        break;
                    }
                }
            } else {
                System.out.println("Wrong Store Name !!");
            }
        }
        return x;
    }

}
