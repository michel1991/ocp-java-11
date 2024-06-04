### Which of the following texts can occur in a valid resource bundle file?

* A.
    ```
     greetings=bonjour
    ```


*B.
    ```
     <key name="greetings">bonjour</key>
    ```
  

*C.
    ```
         <key name="greetings" value="bonjour" />
    ```


*D.
    ```
        <key>
            <name>greetings</name>
            <value>bonjour"</value>
        </key>
    ```


*E.
    ```
    <key>greetings</key>
    <value>bonjour</value>
    ```



*F.

    ```
    greetings1=bonjour
    greetings2=no bonjour
    ```


*G.
    ```
        greetings1=bonjour,greetings2=no bonjour
    ```


 --
Remember that a resource bundle is a properties file. It is not an xml file.
A properties file is a plain text file that contains key-value pairs.

The key contains all of the characters in the line starting with the first non-white space character
and up to, but not including, the first unescaped '=', ':',
or white space character other than a line terminator.
All of these key termination characters may be included in the key by escaping them with a preceding backslash character;
for example,

\:\=

would be the two-character key ":=". Line terminator characters can be included using \r and \n escape sequences.
Any white space after the key is skipped; if the first non-white space character after the key is '=' or ':',
then it is ignored and any white space characters after it are also skipped. All remaining characters on the line
become part of the associated element string; if there are no remaining characters, the element is the empty string "".
Once the raw character sequences constituting the key and element are identified, escape processing is performed as described above.

As an example, each of the following three lines specifies the key "Truth" and the associated element value "Beauty":

Truth = Beauty
    Truth:Beauty
Truth                    :Beauty

As another example, the following three lines specify a single property:
fruits                           apple, banana, pear, \
                                                                    cantaloupe, watermelon, \
                                                                    kiwi, mango

The key is "fruits" and the associated element is:
"apple, banana, pear, cantaloupe, watermelon, kiwi, mango"
Note that a space appears before each \ so that a space will appear after each comma in the final result; the \, line terminator,
and leading white space on the continuation line are merely discarded and are not replaced by one or more other characters.

Comments in a properties file start with a # or !.
Correct(A, F)