import com.google.common.collect.Lists;

import java.util.ArrayList;

public class Test_Main {
    public static void main(String[] args) {

        ArrayList<Integer> guavaList = Lists.newArrayList(1,2,3,2,1,2,3,4,5,6,453,2,2);
        guavaList.sort(Integer::compareTo);
        guavaList.forEach(e -> System.out.print(e + " | "));
    }
}
