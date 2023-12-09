### Which of the following code snippets appearing in a method are valid.

* A. for(var x : System.getProperties().entrySet()){
         var m = x.getKey();
        }
        System.getProperties() returns a Properties object.
        Properties class extends Hashtable<Object, Object>, which means
        the types for the key and the value are Object and Object respectively.
        (FYI, HashTable class implements the Map interface.)

        Map has a method named entrySet(), which returns Set<Map.Entry<K,V>>.
        Since, in the case of Properties, K and V are typed to Object and Object respectively,
        x is typed to Map.Entry<Object, Object> and, therefore, m is typed to Object.
        
* B. for(var x : System.getProperties().keySet()){
            System.out.println(x.length());
        }
    Map has a method named keySet(), which returns Set<K>. As explained above,
    K is typed Object in this case. Therefore, x.length() will not compile.
    It will work if this is changed to :   System.out.println(x);
* C. var obj = null;
    A var declaration must have an initializer that the compiler can use to infer the type without any ambiguity.
* D. var k = System.out::println;
        System.out::println is a valid a method reference, however,
        the compiler cannot determine the type of the object that will be pointed
        to by k using this method reference. That is why, var k will not compile.
        The error message will say, "method reference needs an explicit target-type".
* E. var _ = new ArrayList<>();
    Since Java 9, _ has been made a keyword. Therefore, it cannot be used as a variable name anymore.
    If you change the variable name to something like _al, this statement will be valid.
* F. var _  = 10;
    Since Java 9, _ has been made a keyword. Therefore,
    it cannot be used as a variable name anymore. Otherwise, this statement is valid.
    
NOTE: Some candidates have reported getting a question
    that uses System.getProperties() method. Information presented in this question
    is sufficient and you do not need to dig any deeper into this method.
    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/JMboSLUVPzk  
(Correct is A)