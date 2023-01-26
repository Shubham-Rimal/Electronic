package Models;

public class DryGrinder extends Grinder {

    String dateManufacture;

    public String getDateManufacture() {
        System.out.println("Manufacture Date: "+this.dateManufacture);
        return dateManufacture;
    }

    public void setDateManufacture(String dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public DryGrinder(boolean warranty, int bladeSpeed, String dateManufacture) {
        super(warranty, bladeSpeed);
        this.dateManufacture = dateManufacture;
    }

    public void getProductType(){
        System.out.println("Product Type: Dry");
    }
}
