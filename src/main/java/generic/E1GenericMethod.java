package generic;

/**
 * Using Java Generic concept, we might write a generic method for sorting an array of objects,
 * then invoke the generic method with Integer arrays, Double arrays, String arrays and so on,
 * to sort the array elements.
 */
public class E1GenericMethod {

    /**
     * Generic Method printArray. It gets a type we defined <i>AT</i> and prints the element of that array based on
     * its type. Note that, the type is the object in the first time so you couldn't pass a <i>String</i> type to this array.
     * Please note, I use AT type because I want you know we could name Generic any thing.
     * However for the sake of matching the type with <i>Regular Expression</i> we have to pick this type from [A-Z][0-9]
     * like we have done it in the <code>reverseArray</code> method in <i>E2GenericMethod</i> example.
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

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        String[] strArray = {"Java", "Haskell", "Kotlin", "Groovy"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        printArray(strArray);

    }
}
