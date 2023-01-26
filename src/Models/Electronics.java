package Models;

public class Electronics {

    String company = "Baltra";
    boolean warranty;

    public String getCompany() {
        System.out.println("Company: "+this.company);
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isWarranty() {
        System.out.println("Warranty: "+this.warranty);
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public Electronics(boolean warranty) {
        this.warranty = warranty;
    }

    public void getDevice(){
        System.out.println("Device: Electronics");
    }
}
