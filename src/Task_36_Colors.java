public enum Task_36_Colors {
    MERCEDES_A("green", "black", "red"),
    MERCEDES_C("green", "black"),
    MERCEDES_E("yellow");

    private String color1;
    private String color2;
    private String color3;
    private String color4;

    Task_36_Colors(String green, String black, String red){
        this.color1 = green;
        this.color2 = black;
        this.color3 = red;
    }

    Task_36_Colors(String green, String black){
        this.color1 = green;
        this.color2 = black;
    }
    Task_36_Colors(String yellow){
        this.color4 = yellow;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String getColor3() {
        return color3;
    }

    public String getColor4() {
        return color4;
    }
}
