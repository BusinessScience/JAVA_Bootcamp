package repeat.bikes;

public enum BikeColors {
    RED("RED"),
    BLUE("BLUE"),
    GREEN("GREEN");

    private String colorValue;

    BikeColors(String color) {
        this.colorValue = color;
    }

    public String getColorValue() {
        return colorValue;
    }
}
