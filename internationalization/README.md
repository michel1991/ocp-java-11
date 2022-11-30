# Which of the following statements about resource bundles are correct? (Choose all that apply.)
* A. All keys must be in the same resource bundle to be used.
* B. A resource bundle is loaded by calling the new ResourceBundle() constructor.
* C. Resource bundle values are always read using the Properties class.
* D. Changing the default locale lasts for only a single run of the program.
* E. If a resource bundle for a specific locale is requested, then the resource bundle for the default locale will not be used.
* F. It is possible to use a resource bundle for a locale without specifying a default locale

Option A is incorrect because Java will look at parent bundles if a key is not found in a specified resource bundle.
Option B is incorrect because resource bundles are loaded from static factory methods.
In fact, ResourceBundle is an abstract class, so calling that constructor is not even possible.
Option C is incorrect, as resource bundle values are read from the ResourceBundle object directly.
Option D is correct because the locale is changed only in memory.
Option E is incorrect, as the resource bundle for the default locale may be used if there is no resource bundle for the specified locale (or its locale without a country code).
Finally, option F is correct. The JVM will set a default locale automatically, making it possible to use a resource bundle for a locale, even if a locale was not explicitly set.

# Assume that all of the files mentioned in the answer choices exist and define the same keys. Which one will be used to find the key in line 8?
```java
Locale.setDefault(new Locale("en", "US"));
var b = ResourceBundle.getBundle("Dolphins");
System.out.println(b.getString("name"));
```
A. Dolphins.properties
B. Dolphins_US.properties
C. Dolphins_en.properties
D. Whales.properties
E. Whales_en_US.properties
F. The code does not compile.

# Java will first look for the most specific matches it can find, starting with Dolphins_en_ US.properties.
Since that is not an answer choice, it drops the country and looks for Dolphins_en.properties, making option C correct.
Option B is incorrect because a country without a language is not a valid locale.

Fill in the blanks: When formatting text data, the _________________ class supports parametrized String values, while the _________________ class has built-in support for missing values.
A. TextFormat, Properties
B. MessageFormat, Properties
C. Properties, Formatter
D. StringFormat, Properties
E. Properties, TextFormat
F. Properties, TextHandler
G. None of the above

The MessageFormat class supports parametrized String values that take input values, while the Properties class supports providing a default value if the property is not set.
For this reason, option B is correct.

# Which of the following are true statements about internationalization and localization in Java?
A. Internationalization requires that you create resource bundles for every possible language.
B. Currencies are formatted as String values the same across all locales.
C. Dates are formatted as String values the same across all locales.
D. Integers are formatted as String values the same across all locales.
E. Java supports adapting your application to different languages, but not countries as these may change over time.
F. None of the above.

Internationalization is the process of designing your program to be able to be adapted to multiple locales.
It doesn’t mean you actually have support any of them. For this reason, option A is incorrect.
Options B, C, and D are incorrect, as each of those can change depending on the locale.
Java provides built-in formatters for each, such as getCurrencyInstance() and getNumberInstance() in the NumberFormat class, and numerous methods in the DateTimeFormatter class.
Option E is also incorrect, as locale can include an optional country. If a country does change, though, your application may need to be updated.

