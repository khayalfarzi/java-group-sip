package az.iktlab.javasiplessons.lesson2;

public class Exercises {

    public static void main(String[] args) {

        int su = 5;
        int ayran = 6;

        int qab = su; // 5
        su = ayran; // 6
        ayran = qab; // 5

        su = su + ayran; // 11
        ayran = su - ayran; // 5
        su = su - ayran;

        System.out.println(su); // 5
        System.out.println(ayran); // 6
    }
}
