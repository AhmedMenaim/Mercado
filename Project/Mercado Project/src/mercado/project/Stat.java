package mercado.project;

import java.util.Vector;

public class Stat {

    private int totalVisits;

    public Product bestProduct(Vector<Product> p) {
        int max = 0;
        for (int i = 0; i < p.size(); i++) {

            if (max < p.get(i).NumberOfViews) {
                max = p.get(i).NumberOfViews;
            }

        }
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).NumberOfViews == max) {
                System.out.println("the best product: " +p.get(i).getProductName()+"Number Of Views: "+max);
            }
        }
        throw new UnsupportedOperationException();
    }

    public Store bestStore(Vector <Store> s) {
         int max = 0;
        for (int i = 0; i < s.size(); i++) {

            if (max < s.get(i).NumberOfViews) {
                max = s.get(i).NumberOfViews;
            }

        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).NumberOfViews == max) {
                System.out.println("the best Store: " +s.get(i).getStoreName()+"Number Of Views: "+max);
            }
        }
        return null;
    }

    public Brand bestBrand(Vector <Brand> b) {
        int max = 0;
        for (int i = 0; i < b.size(); i++) {

            if (max < b.get(i).brandVists) {
                max = b.get(i).brandVists;
            }

        }
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).brandVists == max) {
                System.out.println("the best Brands: " +b.get(i).getBrandName()+"number of veiws: "+max);
            }
        }
        return null;
        
    }

    public Customer bestCustomer(Vector <Customer>c) {
        int max = 0;
        for (int i = 0; i < c.size(); i++) {

            if (max < c.get(i).numberOfProductsBought) {
                max = c.get(i).numberOfProductsBought;
            }

        }
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).numberOfProductsBought == max) {
                System.out.println("the best customer: " +c.get(i).getUserName()+"number Of Products Bought: "+max);
            }
        }
        return null;
    }

    public void calcVisits(Vector <User> Users) {
        String un="";
        for(int i=0;i<Users.size();i++){
                if(Users.get(i).getUserName()==un){
                    Users.get(i).NumberOfvisits++;
                    break;
                }
            }
        
    }

    public StoreOwner bestStoreOwner(Vector <Store> s) {
         int max = 0;
        for (int i = 0; i < s.size(); i++) {

            if (max < s.get(i).NumberOfViews) {
                max = s.get(i).NumberOfViews;
            }

        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).NumberOfViews == max) {
                System.out.println("the best Store owner: " +s.get(i).getOwnerName());
            }
        }
        return null;
    }

}
