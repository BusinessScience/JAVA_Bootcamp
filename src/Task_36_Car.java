public class Task_36_Car {
    private Enum model;
    private String color;

    public Task_36_Car(Enum model, String color) {
        this.model = model;
        this.color = color;
    }

    public Enum getModel() {
        return model;
    }

    public void setModel(Enum model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Task_36_Car{" +
                "model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}
