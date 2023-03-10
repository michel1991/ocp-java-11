
### Which of the following are properly formatted locale identifiers? (Choose all that apply.)
* A. ab_cd
* B. Ef
* C. gh
* D. IJ
* E. km_NO
* F. None of the above

A locale consists of a required lowercase language code, followed by an optional uppercase country code.
Option A is incorrect because the country code is lowercase. Options B and D are incorrect because the language code should not contain uppercase characters.
Option C correctly defines a language code with no country, while option E defines both in the correct format.

### Which of the following are valid locale formats? (Choose two.)
* A. hi
* B. hi_IN
* C. IN_hi
* D. in_hi
* E. HI_IN
* F. IN

In Java, a locale can be represented by a language code in lowercase,
or a language and country code, with language in lowercase and country in uppercase.
For these reasons, options A and B are correct.
Options C, D, and E are incorrect because the lowercase language must be before the uppercase country.
Option F is incorrect because the language is missing.
Remember, the exam won’t expect you to know which language and country codes exist,
but it will expect you to know how to use them.

## Fill in the blank so the code correctly compiles and creates a Locale reference. Locale loc = Locale.____________________;

*  A. get("Italian")
*  B. of(Locale.ITALIAN)
*  C. get(Locale.ITALIAN)
*  D. getLocale("Italian")
*  E. of("Italian")
*  F. None of the above

There are no get()or of()methodsin Locale.
You need to use a constructor or a predefined Locale constant to obtain a Localereference.
Therefore, option F is the correct answer. Options B and C are close in that Locale.ITALIAN does reference a Locale object.
However, it should not be passed to the nonexistent get() method.

### Which of the following are not valid Locale formats? (Choose two.)
*  A. nl_BE
*  B. fr_CA
*  C. uk_ua
*  D. CR
*  E. no
*  F. ro_RO

In Java, a locale can be represented by a language code in lowercase,
or a language and country code, with language in lowercase and country in uppercase.
Option C is invalid because both values are lowercase.
Option D is invalid because the value is in uppercase.
The rest of the options are valid locale formats.
Remember, the exam won’t expect you to know which language
and country codes exist, but it will expect you to know how to use them.
