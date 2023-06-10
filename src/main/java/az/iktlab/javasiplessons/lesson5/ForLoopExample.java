package az.iktlab.javasiplessons.lesson5;

public class ForLoopExample {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            if ((i % 2) != 0)
//                System.out.println(i);
//
//            int a = 6;
//        }
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//
//            if (i == 3)
//                continue;
//
//            System.out.println(i);
//            if (i == 5)
//                break;
//        }

       OUTTER: for (int i = 0; i < 10; i++) {
           INNER: for (int j = 0; j < 10; j++) {

                if ((i * j) == 9)
                    break OUTTER;

                System.out.println(i*j);
            }

        }
    }
}
