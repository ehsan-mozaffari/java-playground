package generic;

import java.util.ArrayList;
import java.util.List;

public class E5GenericAndSubtyping {

    public interface PayloadList<E, P> extends List<E>{
        void setPayload(int index, P val);
    }

    public static void main(String[] args) {

        List<Number> numberList = new ArrayList<>();
        numberList.add(new Integer(10));
        numberList.add(new Double(1.5));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        //Couldn't do it. Because although Integer father is Number,
        //the father of integerList -because it is a List a last- is Collection and not a List of Numbers.
        //And the father of numberList ( a list of Number(Integer, Double, Float,... type)) is Collection Also.
        //in other words, List<Integer> or List<Double> or ... are not subtypes of List<Number>. Just as we
        //know already that Integer is a subtype of Number not a subtype of Double (Double is also a subtype of Number) and so on.
        //It goes as well for Generic Formal Types.

//        numberList = integerList;
        System.out.println("Couldn't compile above line! Incompatible type. See the comment for more.");

        PayloadList<String,String> stringPayloadList ;
        PayloadList<String,Integer> integerPayloadList ;


    }
}
