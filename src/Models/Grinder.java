package Models;

public class Grinder extends Electronics {

    int bladeSpeed;

    public int getBladeSpeed() {
        System.out.println("Blade Speed: "+this.bladeSpeed);
        return bladeSpeed;
    }

    public void setBladeSpeed(int bladeSpeed) {
        this.bladeSpeed = bladeSpeed;
    }

    public Grinder(boolean warranty, int bladeSpeed) {
        super(warranty);
        this.bladeSpeed = bladeSpeed;
    }

    public void getProduct(){
        System.out.println("Product: Grinder");
    }
}
