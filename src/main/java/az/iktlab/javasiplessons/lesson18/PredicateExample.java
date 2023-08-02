package az.iktlab.javasiplessons.lesson18;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> positive = it -> it > 0;
    static Predicate<Integer> negative = (it) -> it < 0;

    static BiPredicate<Integer, Integer> compare = (it, it1) -> {
        System.out.println(it);
        System.out.println(it1);

        return it > it1;
    };

    public static void main(String[] args) {

//        boolean result = positive.test(34);

        boolean result = negative.and(positive).test(-45);

        System.out.println(result);

        System.out.println(compare.test(5, 27));

    }
}
