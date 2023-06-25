package az.iktlab.javasiplessons.lesson9;

public class MainC {

    public static void main(String[] args) {
        Pet cat1 = new Pet();
        cat1.age = 12;
        cat1.species = "SS";
        cat1.nickname = "Samsung";

        Pet cat = new Pet("SS", "Samsung", 12);

        System.out.println(cat);
        System.out.println(cat1);

        Human human = new Human();
    }
}
