package az.iktlab.javasiplessons.lesson5;

public class WhileLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);

            if (i == 5)
                continue;
            i++;
        }

        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j < 0);

    }
}
