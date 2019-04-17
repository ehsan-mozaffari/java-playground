package functionalInterface.predicate;

import java.util.function.Predicate;

public class E2Predicate {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = s ->{
            return s.equals("Hello");
        };

        System.out.println(stringPredicate.test("Hello"));
        System.out.println(stringPredicate.test("Hello World"));

        Predicate<Integer> integerPredicate = i -> i > 0;

        System.out.println(integerPredicate.test(5));
        System.out.println(integerPredicate.test(-5));
    }
}
