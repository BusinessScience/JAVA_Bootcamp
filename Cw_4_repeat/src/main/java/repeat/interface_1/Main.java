package repeat.interface_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TurnLeftRight d1 = new DriveFast();
        TurnLeftRight d2 = new DriveSlow();

        List<TurnLeftRight> drive = new ArrayList<>();
        drive.add(d1);
        drive.add(d2);

        for (TurnLeftRight t : drive)
            System.out.println(t.toString());
    }
}
