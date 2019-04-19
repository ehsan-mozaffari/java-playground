package generic;

/**
 * In the body of a generic unit, the (formal) type parameter is handled like its
 * upper bound (expressed with extends; Object if not constrained).
 * If the return type of a method is the type parameter, the result (e.g. of type ?)
 * can be referenced by a variable of the type of the upper bound (or Object).
 * In the other direction, the wildcard fits no other type, not even Object: If ? has been applied
 * as the formal type parameter of a method, no actual parameters can be passed to it.
 * However, objects of the unknown type can be read from the generic object and assigned to
 * a variable of a supertype of the upperbound.
 */
public class E7GenericWildcard {

    public static void testWildcard(Generic<? extends Number> gClass){

        gClass.read();
        //ToDo Why? resolve this!
        //gClass.write(new Integer(10));// You couldn't do that.
    }

    public static void main(String[] args) {

        class Generic <T extends Number> {
            private T t;
            void write(T t) {
                this.t = t;
            }
            T read() {
                return t;
            }
        }

        for (Object o: args){
            System.out.println(o);
        }

        Generic<Number> concreteTypeReference = new Generic<Number>();
        Generic<?> wildcardReference = concreteTypeReference;
        Number number = wildcardReference.read();// Object would also be OK

        //wildcardReference.write(new Object());// type error
        //wildcardReference.write(new Integer(10));// type error
        concreteTypeReference.write(new Integer(10));// OK

        Generic<? extends Number> refConFromAbove = new Generic<Integer>();
        //refConFromAbove.write(new Integer(10));//Why?
        refConFromAbove.read();


    }

    public class Generic <T extends Number> {

        private T t;
        void write(T t) {
            this.t = t;
        }
        T read() {
            return t;
        }
    }

}
