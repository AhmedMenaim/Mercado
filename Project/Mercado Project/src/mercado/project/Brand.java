package mercado.project;

public class Brand {

    private String brandName;
    private String Country;
    private String phone;
    private String Branches;
    private String Email;
    public int brandSales=0;
    public int brandVists=0;
    
    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country=Country;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBranches() {
        return this.Branches;
    }
    public void setBranches(String Branches) {
        this.Branches=Branches;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email=Email;
    }

}