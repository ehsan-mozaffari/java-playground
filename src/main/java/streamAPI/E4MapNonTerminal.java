package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class E4MapNonTerminal {

    public static String toStr(Integer i){
        return "String value: " + i.intValue();
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Stream<Integer> intStream = integerList.stream();

        // Stream map() converts (maps) an element to another object.
        // We could do this with a translator or a class of customer
        Stream<Double> mapIntStreamToDouble = intStream.map( (Integer element) -> element.doubleValue());

        mapIntStreamToDouble.forEach(i-> System.out.println(i));

        Function<Integer, String> integerToStringFunction = (Integer intInput) -> toStr(intInput);
//        Function<Integer, String> integerToStringFunctionRef = E4MapNonTerminal::toStr;

        System.out.println(integerToStringFunction.apply(10));

        Stream<Integer> intStream2 = integerList.stream();
        Stream<String> stringStream = intStream2.map(integerToStringFunction);

        //I donno why the stream is closed
        stringStream.forEach(i -> System.out.println(i));


    }
}
