public class Task_28 {

    private static int[] twoMiddleElementsFromTab(int[] tab){
        if (tab.length % 2 == 0){
            return new int[]{tab[(tab.length/2)-1], tab[tab.length/2]};
        }else return new int[]{(tab.length / 2)+1};
    }

    private static void soutTab(int[] tab){
        for (int i : tab) System.out.print(i + " | ");
    }


    public static void main(String[] args) {

        int[] tab={1,2,3,5,6,7};
        soutTab(twoMiddleElementsFromTab(tab));
    }
}
