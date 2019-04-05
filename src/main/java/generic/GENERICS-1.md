# Java Generics 0-0-0-0-0

### Generics, Inheritance, and Subtypes
As you already know, it is possible to assign an object of one type to an object of another type provided that the types are compatible.
```java
Object someObject = new Integer(10); //OK
Number number = new Integer(10); // OK
```
this is called an "is a" relationship. 
Since an <code>Integer</code> is a kind of <code>Object</code> and also is a kind of <code>Number</code>, 
the assignments of above are allowed.  
However the following code doesn't accepted.
```java
List<Number> numberList = new ArrayList<Integer>();
``` 
Because <code>List\<Integer></code> is not a subtype of <code>List\<Number></code>.  
![generics subtype Relationship](doc/img/generics-subtypeRelationship.gif)

See [the example](E5GenericAndSubtyping.java).  

#### Generic Classes and Subtyping
You can subtype a generic class or interface by extending or implementing it.
The relationship between the type parameters of one class or interface and the type parameters of another are determined 
by the `extends` and `implements` clauses.  
Using the `Collections` classes as an example, `ArrayList<E>` implements `List<E>`, and `List<E>` extends `Collection<E>`. 
So `ArrayList<String>` is a subtype of `List<String>`, which is a subtype of `Collection<String>`. 
So long as you do not vary the type argument, the subtyping relationship is preserved between the types.
![sample hierarchy](doc/img/generics-sampleHierarchy.gif)  

Now imagine we want to define our own list interface, `PayloadList`, that associates an optional 
value of generic type `P` with each element. Its declaration might look like:
```java
interface PayloadList<E,P> extends List<E> {
  void setPayload(int index, P val);
  ...
}
```
The following parameterizations of `PayloadList` are subtypes of `List<String>`:
* `PayloadList<String,String>`
* `PayloadList<String,Integer>`
* `PayloadList<String,Exception>`
![payload list hierarchy](doc/img/generics-payloadListHierarchy.gif)  
See [the example](E5GenericAndSubtyping.java).
#### Wildcard and Subtyping 
You could resolve the issue of Subtyping the above List
![](doc/img/generics-listParent.gif)  
by using 
[Wildcard]() .
In order to access `Number`'s method through `list<Integer>`'s elements use upper-bounded Wildcard:
```java
List<? extends Integer> intList = new ArrayList<>();
List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
```
Because `Integer` is a subtype of `Number`, and `numList` is a list of `Number` objects, 
a relationship now exists between `intList` (a list of `Integer` objects) and `numList`. 
The following diagram shows the relationships between several `List` classes declared with both upper and lower bounded wildcards.  
![wild card subtypes](doc/img/generics-wildcardSubtyping.gif)



### Bounded Type Parameters
There may be times when you'll want to restrict the kinds of types that are allowed 
to be passed to a type parameter. For example, a method that operates on numbers 
might only want to accept instances of Number or its subclasses. 
This is what bounded type parameters are for.  
To declare a bounded type parameter, list the type parameter's name, followed by the extends keyword, followed by its upper bound.  
See [Example 3](GENERICS-EXAMPLES.md#example-3---generic-method-bounded-type-parametere3genericmethodboundedtypeparametersjava-)  