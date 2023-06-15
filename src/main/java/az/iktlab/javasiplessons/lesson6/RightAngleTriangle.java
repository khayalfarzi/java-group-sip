package az.iktlab.javasiplessons.lesson6;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class RightAngleTriangle {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
