package generic;

import java.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class E6GenericWildcardMethod {

    public static void printCollectionObjectType(Collection<Object> o){
        return;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void printCollection(Collection<?> c) {

        for (Object e : c) {
            System.out.println(e);
        }
    }

    // Are the same. <?> is the short form of <? extends Object>. For example,
    // List<?> is the short form of List<? extends Object>
    /*public static void printCollection(Collection<? extends Object> c) {

        for (Object e : c) {
            System.out.println(e);
        }
    }*/
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //!!!!!!!!!!!!!!!! Same Erasure !!!!!!!!!!!!!!!!
    public static void wildTest(List l){

    }

    /*public static void wildTest(List<?> l){

    }*/
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!+

    public static <T extends Number> void wildCardTest(List<? extends T> d) {
        // Mishe har type typi ke behesh bedi bayad bache Number bashe
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        // Uncomment this to test. You have to use Wildcard for this see the documentation
        //printCollectionObjectType(stringList); //Compile Error You could just add List<Object> pass to this method.

        List list = new ArrayList();
        List<? super Object> wildCardList = new ArrayList<>();
        wildCardList = list;
        wildCardList.add(stringList);

//        List<String> c = new ArrayList<String>();
//        c.add("df");
//        Collection<String> stringCollection = new ArrayList<String>();
        //stringCollection.add("dsf");
//        printCollection(stringCollection);

        Collection<String> stringCollection = new ArrayList<String>();
        Collection<?> unknownCollection = new ArrayList<>();

        stringCollection.add("ddd");
        unknownCollection = stringCollection;
//        unknownCollection.add("eeee");
        //unknownCollection.add("dsf");
        printCollection(unknownCollection);


        Collection<?> unCol = new ArrayList<Integer>();
      //  unCol.add(new Integer(1));

    }
}
