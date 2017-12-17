package mercado.project;

import java.util.Vector;

public class Product {

    private String productName;
    private int productId;
    private double price;
    private String type;
    private int productSaleCounter;
    private String Discount;
    private int Quantity;
    public int NumberOfViews;
    public Product(){
        productName="";
        productId=0;
        price=0.0;
        type="";
        productSaleCounter=0;
        Discount="";
        Quantity=0;
        NumberOfViews=0;
    }
    public Product(String n,int pid,double p,String t , int psc,String d){
        productName=n;
        productId=pid;
        price=p;
        type=t;
        productSaleCounter=psc;
        Discount=d;
        Quantity++;
    }
    public String getProductName() {
        return this.productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return this.productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getProductSaleCounter() {
        return this.productSaleCounter;
    }
    public void setProductSaleCounter(int productSaleCounter) {
        this.productSaleCounter = productSaleCounter;
    }

    public String getDiscount() {
        return this.Discount;
    }
    public void setDiscount(String Discount) {
        this.Discount=Discount;
    }
    public int getQuantity() {
        return this.Quantity;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}