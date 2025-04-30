package repeat.bikes;

public class Bike {
    private BikeColors color;
    private int tireWidth;
    private boolean frameAlu;
    private double price;

    public Bike(BikeColors color, int tireWidth, boolean frameAlu) {
        this.color = color;
        this.tireWidth = tireWidth;
        this.frameAlu = frameAlu;
        this.price = -1;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color=" + color +
                ", tireWidth=" + tireWidth +
                ", frameAlu=" + frameAlu +
                ", price=" + price +
                '}';
    }
}
