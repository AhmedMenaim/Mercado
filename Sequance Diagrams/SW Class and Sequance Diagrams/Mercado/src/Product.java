public class Product {

    private String productName;
    private int productId;
    private double price;
    private String type;
    private int productSaleCounter;
    private String Discount;

    public String getProductName() {
        return this.productName;
    }

    /**
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return this.productId;
    }

    /**
     *
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return this.price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    public int getProductSaleCounter() {
        return this.productSaleCounter;
    }

    /**
     *
     * @param productSaleCounter
     */
    public void setProductSaleCounter(int productSaleCounter) {
        this.productSaleCounter = productSaleCounter;
    }

    public String getDiscount() {
        // TODO - implement Product.getDiscount
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Discount
     */
    public void setDiscount(String Discount) {
        // TODO - implement Product.setDiscount
        throw new UnsupportedOperationException();
    }

}