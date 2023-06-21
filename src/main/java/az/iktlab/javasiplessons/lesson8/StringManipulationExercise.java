package az.iktlab.javasiplessons.lesson8;

public class StringManipulationExercise {

    public static void main(String[] args) {

        String word = "Salam";

        int count = countVowels(word);

        System.out.println(count);
    }

    public static int countVowels(String word) {
        int count = 0;
        char[] chars = word.toLowerCase().toCharArray();

        for (char elem : chars) if (isExistVowels(elem)) count++;

        return count;
    }

    public static boolean isExistVowels(char element) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) if (element == vowel) return true;

        return false;
    }
}
