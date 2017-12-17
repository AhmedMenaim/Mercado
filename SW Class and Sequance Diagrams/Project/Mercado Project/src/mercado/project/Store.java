package mercado.project;

import java.util.Vector;

public class Store {

    private String storeName;
    private String ownerName;
    private String Email;
    private String Phone;
    private String Address;
    int NumberOfViews=0;
    public Vector<Product> StoreProducts=new Vector<Product>();
    
    
    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email=Email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone=Phone;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }
}