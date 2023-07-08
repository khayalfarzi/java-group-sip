package az.iktlab.javasiplessons.lesson11;

import java.io.Serializable;

public class Human implements Alive, Serializable {

    public int sub() {
        return 1;
    }

    public int sub(int elem) {
        return elem;
    }

    public int sub(int elem, int elem1) {
        return elem + elem1;
    }

    public int sub(double elem, long elem1) {
        return (int) (elem + elem1);
    }

    public int sub(long elem, long elem1) {
        return (int) (elem + elem1);
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

}
