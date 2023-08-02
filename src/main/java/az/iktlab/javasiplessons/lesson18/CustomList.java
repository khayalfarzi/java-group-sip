package az.iktlab.javasiplessons.lesson18;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Human> {

    List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }
}
