package az.iktlab.javasiplessons.lesson4;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int num = sc.nextInt();

        String day = "";
//        if (num == 1) {
//            day = "MONDAY";
//        } else if (num == 2) {
//            day = "TUESDAY";
//        } // ..

        // SWITCH

        switch (num) {
            case 1:
                day = "MONDAY";
                break;
            case 2:
                day = "TUESDAY";
                break;
            case 3:
                day = "WEDNESDAY";
                break;
            case 4:
                day = "THURSDAY";
                break;
            case 5:
                day = "FRIDAY";
                break;
            case 6:
                day = "SATURDAY";
                break;
            case 7:
                day = "SUNDAY";
                break;
            default:
                day = "NO DAY FOUND";
        }

        System.out.println(day);

        switch (day) {
            case "MONDAY":
                System.out.println(1);
                break;
            case "TUESDAY":
                System.out.println(2);
            case "WEDNESDAY":
                System.out.println(3);
            case "THURSDAY":
                System.out.println(4);
            case "FRIDAY":
                System.out.println(5);
        }
    }
}
