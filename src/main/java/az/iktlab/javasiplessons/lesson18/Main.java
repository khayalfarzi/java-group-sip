package az.iktlab.javasiplessons.lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ArrayList

        List<Integer> list = List.of(1, 2, 5, 4, 6, 5, 7);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
