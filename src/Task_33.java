import Projekt_2.Boat;

import java.util.*;

public class Task_33 {

    private static ArrayList<Integer> lista(ArrayList<Integer> lista){
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i : lista)
            if (i % 3 == 0) temp.add(i);
        return temp;
    }

    private static void soutList(ArrayList<Integer> list){
        for (Integer i : list) System.out.print(i + " | ");
    }

    private static ArrayList<Integer> getSortedList(ArrayList<Integer> list){
        Collections.sort(list);
        return list;
    }

    private static void getFrequencyNumbers(List<Integer> list){
        Collections.sort(list);
        int freq = 0;
        int next = list.get(0) +1;
        for (Integer i : list) {
            if (i != next) {
                freq = Collections.frequency(list, i);
                if (freq == 1) System.out.println(i + " wystepuje: " + freq + " raz");
                else System.out.println(i + " wystepuje " +freq+ " razy");
            }
            next = i;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,4,4,5,5,6,6,7,9,8,13,14,12,20,20));

        getFrequencyNumbers(list);


        lista(list).forEach(e -> System.out.println(e));
        soutList(lista(list));

        System.out.println();
        getSortedList(list).forEach(System.err::print);

        getFrequencyNumbers(list);

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add("Tomek");
        arrayList.add(true);
        arrayList.add('c');


        for (Object s : arrayList){
            if (s instanceof String)
                System.out.println(((String) s).length());

            else if(s instanceof Boolean)
                System.out.println("haha");
            else continue;
        }

        ArrayList<String> newArrayList = new ArrayList<>();

        char c = 'a';
        newArrayList.add(String.valueOf(2));
        newArrayList.add("ktoś");
        newArrayList.add("jakiś");
        newArrayList.add("i po co?");
        newArrayList.add(String.valueOf(c));

        for (String s: newArrayList)
            System.out.println(s);

        System.out.println("Element2: " + newArrayList.get(2));
    }
}
