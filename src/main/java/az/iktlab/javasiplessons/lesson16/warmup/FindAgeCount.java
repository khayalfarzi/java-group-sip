package az.iktlab.javasiplessons.lesson16.warmup;

import java.util.Random;

public class FindAgeCount {

    private static final Random rnd = new Random();

    public static void main(String[] args) {

        int[] ages = generateAges(150, 10_000_000);
        int[] counts = calculateAges(ages);
        printArray(counts);
    }

    private static int[] generateAges(int bound, int maxSize) {
        int[] ages = new int[maxSize];

        // fill the array
        for (int i = 0; i < ages.length; i++)
            ages[i] = rnd.nextInt(bound);

        return ages;
    }

    private static int[] calculateAges(int[] ages) {
        int[] counts = new int[150];

        for (int age : ages)
            counts[age]++;

        return counts;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " = " + array[i]);
        }
    }
}
