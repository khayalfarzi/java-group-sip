package az.iktlab.javasiplessons.lesson15.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Iterable
//        Collection
//        List
//        ArrayList
//        LinkedList

        ArrayList intList = new ArrayList();
        intList.add(23);
        intList.add("String");
        intList.add(true);

        System.out.println(intList);

        ArrayList<Integer> ial = new ArrayList<>();
        ial.add(24);
//        ial.add("String");

        System.out.println(ial);

        List<Boolean> bl = new ArrayList<>();
        bl.add(true);
        bl.add(false);
        bl.add(false);
        bl.add(false);
        System.out.println(bl);

        System.out.println(bl.get(0));

        for (int i = 0; i < bl.size(); i++) {
            System.out.println(bl.get(i));
        }

        bl.set(3, true);

        System.out.println(bl);
    }
}
