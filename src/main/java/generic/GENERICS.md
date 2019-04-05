# Java Generics

#### What is Generic? 
Actually, the <code>\<YOUR-TYPE></code> in front of the variables or classes is called generic.  
For example:  
<code>List\<Integer></code> is a *list* of *Strings*.  
<code>Map<Integer, String></code> is a *Map* with an *Integer* Keys and *String* Values.    
<code><?></code> is a Generic WildCard representing an unknown type.  
<br/>
#### Why Generics
It would be nice if we could write a single sort method that could sort the elements in an Integer array, a String array, 
or an array of any type that supports ordering. From _JDK 1.5_ **Generics** added to reach this goal.  
Java **Generic** methods and generic classes enable programmers to specify, with a single method declaration, 
a set of related methods, or with a single class declaration, a set of related types, respectively. 
In another words, _Generics allow you to abstract over types_.  
**Generics** also provide compile-time type safety that allows programmers to catch invalid types at **compile** time instead of runtime.  
<br/>

#### Generics Glossary

##### Formal Type Parameter: 
Is a Custom Definition Type Parameter which is replaced by **Actual Type Argument** in the _compilation_ time 
by an operation called **Parameterized Type** (invocation) via Java Compiler.   
Note: If not specified then it replaced by <code>Object</code> type.
```java
public class ArrayList<T>{
    T[] elems;
}
```

</code>

##### Actual Type Argument:
Is a target real type that substituted instead of the _Formal Type Parameter_ in 
_Classes_, _Interfaces_ or _Methods_ definition in **.class** file. For instance, in the example of Formal type parameter,
if we call <code> new ArrayList<Integer></code> the Java Compiler parameterized the Integer Type into this:
```java
public class ArrayList<Integer>{
    Integer[] elems;
}
```
Expert's Note: It's a little bit tricky that a generic type declaration is compiled once and for all, and turned into a single class file,
just like an ordinary class or interface declaration. So, don't confuse it by this concept that Java Compiler duplicates 
the code for each type, actually this part is managed by JVM.  
Note2: Remember to always give the Parameter Type an Object instead of primitive types.

##### Reification: 
Means to convert something abstract (Parametric Type) into something concrete (Concrete/Actual Type) by specialization.

### How to define Generics
...........3 examples of generics with link
To find out more please [see this](GENERICS-EXAMPLES.md)


### Java Generic Type Naming Convention
We recommend that you use pithy(single character if possible) and best to avoid lower cases to distinguish _formal type parameters_ from the ordinary _Classes_ and _Types_.  
Recommended to use the following Naming in your code.
* E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
* K – Key (Used in Map)
* V – Value (Used in Map)
* N – Number
* T – Type
* S,U,V etc. – 2nd, 3rd, 4th types

<br/>

**Note**: When you define a type in your method consider it as an <code>Object</code> type 
unless you extend or implemented from another *class* or *interface* type.  

#### Restriction on Generics
To find out what the restriction of generics [see this](GENERICS-RESTRICTION.md) 


### Bounded Type Parameters
There may be times when you'll want to restrict the kinds of types that are allowed 
to be passed to a type parameter. For example, a method that operates on numbers 
might only want to accept instances of Number or its subclasses. 
This is what bounded type parameters are for.  
To declare a bounded type parameter, list the type parameter's name, followed by the extends keyword, followed by its upper bound.  
See [Example 3](GENERICS-EXAMPLES.md#example-3---generic-method-bounded-type-parametere3genericmethodboundedtypeparametersjava-)

