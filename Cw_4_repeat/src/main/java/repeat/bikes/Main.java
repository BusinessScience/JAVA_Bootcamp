package repeat.bikes;

public class Main {
    public static void main(String[] args) {

        BikeRental bikeRental = new BikeRental();
        Bike bike = bikeRental.orderBike(BikeColors.GREEN,25, true, 29);
        System.out.println(bike);
    }
}
