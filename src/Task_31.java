import java.util.Arrays;

public class Task_31 {

    private static Boolean[] getOnlyTrue(Boolean[] tab){
        int count = 0;
        for (Boolean b : tab) {
            if (b.equals(true))count++;
        }
        Boolean[] temp = new Boolean[count];
        Arrays.fill(temp, true);
        return temp;
    }

    protected static void soutTab(Boolean[] tab) {
        for (Boolean i : tab) System.out.print(i + " | ");
    }

    public static void main(String[] args) {

        soutTab(getOnlyTrue(new Boolean[]{true,false,true,true,true,false,false,false}));
    }
}
