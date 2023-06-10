package az.iktlab.javasiplessons.lesson5;

import java.util.Scanner;

public class SwitchExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();

        switch (elem) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
