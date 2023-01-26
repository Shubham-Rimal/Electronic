import Models.DryGrinder;

public class Main {
    public static void main(String[] args) {

        DryGrinder d1 = new DryGrinder(true, 25, "2022");
        d1.getDevice();
        d1.getProduct();
        d1.getProductType();
        d1.getDateManufacture();
        d1.getBladeSpeed();
        d1.getCompany();
        d1.isWarranty();
    }
}