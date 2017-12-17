package mercado.project;

import java.util.Vector;

public class Cart {

    private int numberOfProducts;
    private double totalMoney;
    public Vector<Product>CustomerProducts=new Vector<Product>();

    public int getNumberOfProducts() {
        return this.numberOfProducts;
    }
    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts=numberOfProducts;
    }
    public double getTotalMoney() {
        return this.totalMoney;
    }
    public void setTotalMoney(int totalMoney) {
        this.totalMoney=totalMoney;
    }
}