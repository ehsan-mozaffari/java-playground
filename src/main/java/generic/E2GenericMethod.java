package generic;

import java.util.Arrays;
import java.util.Collections;

/**
 * This Class shows you that we could use our defined <b>Generic Type</b> for the output of the method.
 * Also it shows us that <code>Collection.reverse</code> util works as a charm because we said that we want
 * The exact type of our input array
 *
 */
public class E2GenericMethod {

    /**
     * Generic Method printArray. It gets a type we defined <i>AT</i> and prints the element of that array based on
     * its type. Note that, the type is the object in the first time so you couldn't pass a <i>String</i> type to this array.
     * @param inputArray
     * @param <AT> Array Type, custom <i>Generic</i> definition
     */
    public static <AT> void printArray(AT[] inputArray){

        //inputArray.getClass().getCanonicalName() method gets the array type that passed as inputArray of this method.
        System.out.println("Array Type = " + inputArray.getClass().getCanonicalName());
        System.out.print("Element of inputArray = ");

        //Display the array elements based on AT type
        for (AT elementOfArray: inputArray){
            System.out.print(elementOfArray + " ");
        }
        System.out.println("\n");
    }

    /**
     * This method reverse the order of Array. We could use POJO (Plain Old Java Object) but I would rather.
     * If you wanna use POJO you need a <code>for</code> and add to your defined new Array from the end of array index.
     * <code>Collection.reverse</code> util works as a charm because we said that we want
     * The exact type of our input array. If you have trouble with <i>Collection Util</i> see the section of Collection.
     * @param array
     * @param <T> generic type. It could be any name!
     * @return
     */
    public static <T> T[] reverseArray(T[] array){

        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        String[] strArray = {"Java", "Haskell", "Kotlin", "Groovy"};

        printArray(reverseArray(intArray));
        printArray(reverseArray(doubleArray));
        printArray(reverseArray(charArray));
        printArray(reverseArray(strArray));
    }
}
