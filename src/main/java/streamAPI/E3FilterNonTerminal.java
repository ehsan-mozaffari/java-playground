package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class E3FilterNonTerminal {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(10);
        integerList.add(20);
        integerList.add(300);

        Stream<Integer> integerStream = integerList.stream();
        // Because Lambda Expression implements Java Functional Interface this fits with non-terminal operations.
        // For instance Function or Predicate interfaces. Lambda can implements these interfaces.
        Stream<Integer> graterThanTwentyStream = integerStream.filter(val -> val >= 20);

        graterThanTwentyStream.forEach(integerVal -> System.out.println("FilterResult:"+integerVal));


        Stream<Integer> intStream2 = integerList.stream();

        Predicate<Integer> graterThanTwentyPredicate = (Integer i) -> i >= 20;
        Predicate<Integer> lowerThanTenPredicate = (Integer i) -> i < 10;
        System.out.println(graterThanTwentyPredicate.test(10));

        Stream<Integer> graterThanTwentyStreamWithPredicate = intStream2.filter(graterThanTwentyPredicate.and(lowerThanTenPredicate));
        graterThanTwentyStreamWithPredicate.forEach(i -> System.out.println("Filter with Predicate result: "+i));

    }
}
