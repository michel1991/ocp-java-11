### What change, if any, should be made to the following method to improve security?

``` java
    10: public List˂String˃ accessNetworkList(String fileName) {
    11:    return AccessController.doPrivileged(
    12:          new PrivilegedAction˂List˂String˃˃() {
    13:       public List˂String˃ run() {
    14:          try {
    15:             return Collections.unmodifiableList(
    16:                Files.readAllLines(Path.of(fileName)));
    17:          } catch (IOException e) {
    18:             throw new SecurityException("No access");
    19:          } } });
    20: }
```



* A. On line 10, the method should be marked private.
* B. On line 15, an ArrayList instance should be returned instead of an unmodifiable list.
* C. Prior to line 16, the fileName should be validated against a list of constants.
* D. The exception on line 18 should be removed and an empty List should be returned.
* E. None of the above, as the code is safe as i
                    
The method does not validate the input filename,
which gives the user carte blanche to access the entire file system.
The input should be validated in some way. One option to validate
the data would be to check it against a list of known constants,
making option C correct. The rest of the options do not improve security.