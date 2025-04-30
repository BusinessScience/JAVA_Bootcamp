package repeat.bikes;

public class BikeRental {
    private double income;

    public BikeRental() {
        this.income = 0;
    }

    public double getIncome() {
        return income;
    }

    public Bike orderBike(BikeColors bikeColor, int tireWidth, boolean frameAlu, int days){

        Bike bike = new Bike(bikeColor,tireWidth,frameAlu);
        double price = 0;

        switch (bikeColor){
            case RED: price+= 500;
            break;
            case BLUE: price+= 250;
                break;
            case GREEN: price+=100;
                break;
        }
        price+= ((double) tireWidth/3);

        if (frameAlu)
            price*=2;
        price/=20;
        price*= days;

        this.income = price;
        bike.setPrice(price);

        return bike;
    }
}
