public enum Task_36_Model {
    MERCEDES_E("E Klasse"),
    MERCEDES_C("C Klasse"),
    MERCEDES_A("A Klasse");

    private String model;

    Task_36_Model(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Task_36_Model{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}
