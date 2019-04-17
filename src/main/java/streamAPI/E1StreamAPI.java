package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E1StreamAPI {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stringStream = stringList.stream();// Obtain an stream instance

        Long count = stringStream
                .map(value -> value.toLowerCase()) //Non-Terminal operation: adds a listener to the stream without doing anything else
                .count();//Terminal operation: starts the internal iteration of the elements, calls all listener and returns a result.
                        //The call to the count() method is a terminal operation.
                        // This call starts the iteration internally, which will result in each element being converted to lowercase and then counted.

        Stream<String> stream1 = stringStream.map(i -> i.toLowerCase()).map(i -> i.toUpperCase());


    }
}