package generic;

import java.util.ArrayList;
import java.util.List;

public class E8GenericWildcardBounded {

    public static void main(String[] args) {

        Generic<? extends Number> referenceConstrainedFromAbove = new Generic<Integer>();
        Generic<? super Integer> referenceConstrainedFromBelow = new Generic<Number>();
        //Generic<? super Integer> referenceConstrainedFromBelowError = new Generic<Object>();

        // These two definition are the same
        // Although this wild card accepts Objects and all its subtype
        // but you cannot add Number parents because of Generic class Generic definition
        Generic<?> referencedObjectFromAbove = new Generic<Number>();
        //Generic<? extends Object> sameAsAbove = new Generic<?>();

        List<? super Integer> intListAndAllOfIntegerParents = new ArrayList<Object>();
//        List<? super Integer> intListAndAllOfIntegerParentsNotSubtypeOfNumber = new ArrayList<Double>();
        List<? super Number> numberListAndAllOfNumberParents = new ArrayList<Object>();
        //List<? super Number> numberListDoesntAllowItsChildren = new ArrayList<Integer>();

        List<?> listOfUnknown1 = new ArrayList<Object>();
        List<?> listOfUnknown2 = new ArrayList<Integer>();
        List<?> listOfUnknown3 = new ArrayList<>();
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println(listOfUnknown1.getClass().getTypeName());
        System.out.println(listOfUnknown2.getClass().getTypeName());
        System.out.println(listOfUnknown3.getClass().getTypeName());
        System.out.println(intList.getClass().getTypeName());


    }
}
class Generic <T extends Number> {
    private T t;
    void write(T t) {
        this.t = t;
    }
    T read() {
        return t;
    }
}