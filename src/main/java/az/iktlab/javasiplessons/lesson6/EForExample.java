package az.iktlab.javasiplessons.lesson6;

public class EForExample {

    public static void main(String[] args) {

        String cars [] = {"BMW", "Mercedes", "KIA"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car: cars){
            System.out.println(car);
        }


    }
}
