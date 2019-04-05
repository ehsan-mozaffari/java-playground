# Java Generics

#### Restriction on Generics
##### Cannot Instantiate Generic Types with Primitive Types
```java
public class ArrayList<T>{
    T[] elems;
}
public static void main(String[] args){
    ArrayList<int> al = new ArrayList<int>();
}
```
It throws compilation error. You can substitute only **non-primitive types** for the type parameter. 
It's because the Type parameter is <code>Object</code> and neither be replaced by _primitive types_ 
nor even with **Java Autoboxing**.  
##### Cannot Declare Static Fields Whose Types are Type Parameters
...............because JVM doesn't know which type should it give to that static field
##### Cannot Create Instances of Type Parameters
##### Cannot Use Casts or instanceof With Parameterized Types
##### Cannot Create Arrays of Parameterized Types
##### Cannot Create, Catch, or Throw Objects of Parameterized Types
##### Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type

<br/>