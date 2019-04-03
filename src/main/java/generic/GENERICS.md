# Java Generics

It would be nice if we could write a single sort method that could sort the elements in an Integer array, a String array, or an array of any type that supports ordering.  
Java **Generic** methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.  
enerics also provide compile-time type safety that allows programmers to catch invalid types at **compile** time instead of runtime.  
<br/>
<br/>
  

See the following examples:
#### [Example 1 - Generic Method](E1GenericMethod.java) : 
Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.  
This example illustrates how we can print an array of different type using a single Generic method.
#### [Example 2 - Generic Method](E2GenericMethod.java) : 
It's like the Example 1 but shows you how to define a _T_ Generic type in the method input and return type. 
