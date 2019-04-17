package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E2NonTerminalStreamOperation {

    public static void main(String[] args) {


        //The non-terminal stream operations of the Java Stream API are operations that transform or filter the elements in the stream.
        //When you add a non-terminal operation to a stream, you get a new stream back as result.
        //The new stream represents the stream of elements resulting from the original stream with the non-terminal operation applied.

        List<String> stringList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stringStreamExample = stringList.stream();

        Stream<String> non_TerminalOpStream =
                stringStreamExample
                        //Chaining non-terminal operation instead of do it separately
                        .map(value-> value.toUpperCase())
                        .map(value -> value.toLowerCase())
                        .map(value -> value.substring(0,3));

        non_TerminalOpStream.forEach(item -> System.out.println(item));
    }
}
