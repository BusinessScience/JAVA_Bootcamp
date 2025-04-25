public class Task_27 {

    private static int first(int[] numbers){
        return numbers[0];
    }

    private static int last(int[] numbers){
        return numbers[numbers.length-1];
    }

    private static int sum(int[] numbers){
        if (numbers.length > 2) return -1;
        return numbers[0] + numbers[1];
    }

    private static int sumElements(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        return sum;
    }

    private static int sumElements2(int[] numbers){
        int sum = 0;
        for (int number : numbers) sum += number;
        return sum;
    }

    private static int sumFirstLast(int[] numbers){
        return numbers[0] + numbers[numbers.length-1];
    }

    private static int elemMiddle(int[] numbers){
        return numbers[numbers.length/2];
    }

    private static int[] addTwoTable(int[] tab1, int[] tab2){
        int[] temp = new int[tab1.length + tab2.length];
        for (int i = 0; i < temp.length; i++) {
            if (i < tab1.length) temp[i] = tab1[i];
            else temp[i] = tab2[i-tab1.length];
        }
        return temp;
    }

    private static void soutTab(int[] tab){
        for (int i : tab) System.out.print(i + " | ");
    }
    
    private static int maxElemFromTable(int[] tab){
        int max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) max = tab[i];
        }
        return max;
    }

    private static int[] reverseTable(int[] tab){
        int[] temp = new int[tab.length];
        int j= tab.length-1;
        for (int i = 0; i < tab.length; i++, j--) {
            temp[j] = tab[i];
        }
        return temp;
    }


    public static void main(String[] args) {

        int[] numbers = {3,4,5,3,2};
        int[] numbers2 = {3,4};

        System.out.println(first(numbers));
        System.out.println(last(numbers));
        System.out.println(sum(numbers2));
        System.out.println(sumElements(numbers) + sumElements(numbers2));
        System.out.println(sumElements2(numbers) + sumElements2(numbers2));
        System.out.println(sumFirstLast(numbers));
        System.out.println("Element środkowy: " + elemMiddle( numbers));

        soutTab(addTwoTable(numbers2, numbers));

        System.out.println("\n\nElem Max: " + maxElemFromTable(numbers));
        soutTab(reverseTable(addTwoTable(numbers2, numbers)));
    }
}