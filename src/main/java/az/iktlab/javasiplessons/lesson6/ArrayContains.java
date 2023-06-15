package az.iktlab.javasiplessons.lesson6;

public class ArrayContains {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 56, 7, 8};

        int elem = 4;

        String result = "not found";
        for (int i = 0; i < arr.length; i++) {

            if (elem == arr[i]) {
                result = "found";
                break;
            }
        }

        System.out.println(result);
    }
}
