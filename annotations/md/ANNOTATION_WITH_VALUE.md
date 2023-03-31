### Which annotation can cancel out a warning on a method using the @Deprecated API at compile time?
* A. @FunctionalInterface
* B. @Ignore
* C. @IgnoreDeprecated
* D. @Retention
* E. @SafeVarargs
* F. @SuppressWarnings
* G. None of the above

If @SuppressWarnings("deprecation") is applied to a method that is using a deprecated API,
then warnings related to the usage will not be shown at compile time, making option F correct.
Note that there are no built-in annotations called @Ignore or @IgnoreDeprecated.

### Which annotations require a value to be applied to a declaration? (Choose all that apply.)
* A. @Retention
* B. @Documented
* C. @FunctionalInterface
* D. @SafeVarargs
* E. @Repeatable
* F. @Deprecated
* G. @SuppressWarnings

@Documented, @FunctionalInterface, and @SafeVarargs are marker annotations and do not take any values.
On the other hand, @Retention requires a RetentionPolicy value, making option A correct.
Likewise, @Repeatable requires a containing annotation type,
and @SuppressWarnings requires a String[] value, making options E and G correct, respectively.
Finally, option F is incorrect.
While @Deprecated may take a since() String value or forRemoval() boolean value, both are optional.