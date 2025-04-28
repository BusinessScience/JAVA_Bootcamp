import java.util.ArrayList;

public class Task_36 {
    public static void main(String[] args) {

        Task_36_Car car1 = new Task_36_Car(Task_36_Model.MERCEDES_E, Task_36_Colors.MERCEDES_E.getColor4());
        Task_36_Car car2 = new Task_36_Car(Task_36_Model.MERCEDES_A, Task_36_Colors.MERCEDES_A.getColor2());
        Task_36_Car car3 = new Task_36_Car(Task_36_Model.MERCEDES_C, Task_36_Colors.MERCEDES_A.getColor1());

        ArrayList<Task_36_Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Object o : cars)
            System.out.println(o);
    }
}
