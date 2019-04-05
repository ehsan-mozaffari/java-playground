package generic;

import java.util.*;

public class E4GenericMethodBoundedTypeParameters {


    public static void main(String[] args) {

        class Pair<K, V> {

            private K key;
            private V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public void setKey(K key) { this.key = key; }
            public void setValue(V value) { this.value = value; }
            public K getKey()   { return key; }
            public V getValue() { return value; }
        }

        class Util {

            //~~~~~~~~~~~~~~These two have the same erasure~~~~~~~~~~~~~~~~~~
            /*public <T> boolean compare(List<T> p1, List<T> p2) {
                return p1.equals(p2);
            }*/
            public <T extends List<T>> boolean compare(T p1, T p2) {
                return p1.equals(p2);
            }
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            public <E extends String, M extends Map<E , Integer>> boolean compare(M p, M m) {
                return true;
            }

            //@@@@@@@@@@@@@These two have the same erasure@@@@@@@@@@@@@@@@@@@@

            /*public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
                return p1.getKey().equals(p2.getKey()) &&
                        p1.getValue().equals(p2.getValue());
            }*/

            public <K, V, T extends Pair<K,V>, U extends T, B extends Boolean> B compare(U u, T t) {

                B returnTrue ;
                returnTrue =(B) Boolean.TRUE;
                return returnTrue;
            }
            //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


            public <A extends Integer, B extends A> A test (B b) {
                return b;
            }

//            public <A extends Integer, B extends A> A test2 (B b) {
//                return Integer.MAX_VALUE;
//            }
        }




        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<String, String> p3 = new Pair<>("apple", "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        Pair<Integer, String> p4 = new Pair<>(1, "apple");

        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        Util u = new Util();
        //TODO Check them out and document them
//        System.out.println(u.compare(integerList, stringList));
//        u.compare(new LinkedHashMap<String, String>(), new HashMap<String, Integer>());
//        u.compare(new LinkedHashMap<String, String>(), new HashMap<String, Integer>());
//        System.out.println(u.compare(p1,p3));

    }




}
