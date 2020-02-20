# Strings in Java

## Memory Representation
  * Strings are reference types, also called as non-primitive data types. They are represented in memory using a character array.
 From the Java documentation, 

```java
 public final class String {
  private final char value[];
 }
 ```

## String Manipulation
 * The `final char value[]` shows that Strings are immutable in Java. The following code `String s = new String("hello world!");`, creates a new 
String object with value `hello world!` in the memory, and `s` refers to this object.

 * Any operation that modifies an existing String will create a new String object in the memory. Consider this code, where we try
  to append to an existing String - 
 ```java
 String s = new String("hello world!");
 s += " from NYC";
 ```
 * When we modify `s`, a new String object will be created in the memory with the value `hello word from NYC`. Now `s` refers 
  to this new String object. The previously created object ( `hello world!`) still remains in the memory. Hence, it is not memory
  efficient as it creates new object whenever modified. 

 * A memory efficient way of manipulating Strings is making use of **StringBuilder** or **StringBuffer** classes in Java.

## String Comparison 
 * Since Strings are reference types, they should always be compared using the `.equals()` method. This compares the contents of
 the objects (deep comparison).
 * When `==` operator is used to compare Strings, it checks if the objects are referenced to the same memory location.
 
 ```java
        String s1 = new String("hello world!");
        String s2 = s1;
        String s3 = new String("hello world!");
        
        System.out.println(s1 == s2); // prints 'true'
        System.out.println(s1.equals(s2)); // prints 'true'
        System.out.println(s1 == s3); // prints 'false' (shallow comparison)
        System.out.println(s1.equals(s3)); // prints 'true' (deep comparison)
 
 ```
