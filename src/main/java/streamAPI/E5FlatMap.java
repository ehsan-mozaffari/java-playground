package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E5FlatMap {

    public static void main(String[] args) {

        //??????????????????????????????????????????????????????????????????????????????????????????????????
        //Maps a single element to multiple Element
//        List<String> stringList = new ArrayList<>();
//
//        stringList.add("One flew over the cuckoo's nest");
//        stringList.add("To kill a muckingbird");
//        stringList.add("Gone with the wind");
//
//        List<String> stringList2 = new ArrayList<>();
//        stringList2.add("stringlist2->1");
//        stringList2.add("stringlist2->2");
//        stringList2.add("stringlist2->3");
//
//        Stream<String> stringStream = stringList.stream();
//
//        stringStream.flatMap((value) -> {
//            String[] split = value.split(" ");
//            System.out.println(Arrays.asList(split));
//            return (Stream<String>) Arrays.asList(split).stream();
//        }).forEach((value) -> System.out.println(value)) ;


        /*String[] stringsA = {"a1", "a2"};
        String[] stringsB = {"b1", "b2"};

        List<String[]> twoDimensionStringList = new ArrayList<>();
        twoDimensionStringList.add(stringsA);
        twoDimensionStringList.add(stringsB);

        Stream<String[]> stream = twoDimensionStringList.stream();

        stream.flatMap(v ->{
            System.out.println("FlatMap: "+v);
            return (Stream<String>) Arrays.stream(v);
        });*/

        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream()).sorted().distinct()
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);
    }
}
