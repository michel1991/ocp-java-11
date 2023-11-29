
### Which of the following are properly formatted locale identifiers? (Choose all that apply.)
* A. ab_cd
* B. Ef
* C. gh
* D. IJ
* E. km_NO
* F. None of the above

A locale consists of a required lowercase language code,
followed by an optional uppercase country code.
Option A is incorrect because the country code is lowercase.
Options B and D are incorrect because
the language code should not contain uppercase characters.
Option C correctly defines a language code with no country,
while option E defines both in the correct format.

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

###### Fill in the blank so the code correctly compiles
###### and creates a Locale reference. Locale loc = Locale.____________________;

*  A. get("Italian")
*  B. of(Locale.ITALIAN)
*  C. get(Locale.ITALIAN)
*  D. getLocale("Italian")
*  E. of("Italian")
*  F. None of the above

There are no get()or of()methodsin Locale.
You need to use a constructor or a predefined
Locale constant to obtain a Localereference.
Therefore, option F is the correct answer.
Options B and C are close in that Locale.ITALIAN does reference a Locale object.
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

### How long will the effects of calling Locale.setDefault()
#### be active assuming no other calls to that method are made?
* A. Until the end of the method.
*  B. Until the program exits.
*  C. Until the next reboot of the computer.
*  D. It persists after reboot.
*  E. None of the above.

Calling Locale.setDefault() changes the default locale within the program.
It does not change any settings on the computer.
The next time you run a Java program, it will have the original
default locale rather than the one you changed it to.

##### How do you find out the locale of the running program?
* A. Locale.get("default")
* B. Locale.get(Locale.DEFAULT)
* C. Locale.of()
* D. Locale.now()
* E. Locale.getDefault()
* F. None of the above

The Locale object provides getDefault() and setDefault()
methods for working with the default locale, so option E is correct.
The rest of the methods do not exist in the Locale class.

#### Which of the following are considered locales? (Choose three.)
* A. Cultural region
* B. Local address
* C. City
* D. Time zone region
* E. Political region
* F. Geographical region

Oracle defines a locale as a geographical, political,
or cultural region, making options A, E, and F correct.
A local address and city too granular for a locale.
Also, time zones often span multiple locales.

#### Which of the following shows a valid Locale format? (Choose two.)
*  A. iw
*  B. UA
*  C. it_ch
*  D. JA_JP
*  E. th_TH
*  F. ES_HN

In Java, a locale can be represented by a language code in lowercase,
or a language and country code, with language
in lowercase and country in uppercase. For these reasons,
options A and E are correct. Options C, D, and F
are incorrect because the lowercase
language must be before the uppercase country.
Option B is incorrect because the language is missing.
Remember, the exam won’t expect you to know which language
and country codes exist, but it will expect you to know how to use them.

### Which of the following are required to construct a Locale?

* A. language
* B. region
* C. country
    country is the second parameter that may be passed while creating a Locale. It is not required though.
* D. time zone
* E. state
* F culture

Locale needs at least a language to be constructed. It has three constructors -

Locale(String language)
Construct a locale from a language code.
Locale(String language, String country)
Construct a locale from language, country.
Locale(String language, String country, String variant)
Construct a locale from language, country, variant.

For example:
new Locale("fr", "FR"); //language is French, Country is France.
new Locale("fr", "CA"); //language is French, Country is Canada, so this means, you are trying to use Canadian dialect of French.
new Locale("en", "IN"); //language is English, Country is India, so this means, you are trying to use Indian dialect of English.

(Correct is A)


