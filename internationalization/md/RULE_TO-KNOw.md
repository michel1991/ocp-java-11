#### Which of the following cannot be instantiated
#### directly by the caller using the constructor? (Choose two.)
* A. Locale
* B. ResourceBundle
* C. Locale.Builder
* D. Properties
* E. DateTimeFormatter
* F. HashMap

The Locale class has a constructor taking a language code and an optional country code.
A Locale.Builder is created only using a constructor.
The Properties and HashMap classes are concrete types of Map, so they have constructors.
By contrast, a ResourceBundle is an abstract class, and instances are typically obtained
by calling the ResourceBundle.getBundle() method, making option B correct.
Similarly, DateTimeFormatter is obtained using a static method, making option E correct.