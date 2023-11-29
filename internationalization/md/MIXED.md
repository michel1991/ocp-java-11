#### Identify the correct statement about i18n.

* A. I18N class allows you to port your code for multiple regions and/or languages.
    There is no class named I18N.
* B. You should use Locale and formatter objects such as NumberFormat and DateFormat to generate locale specific output.
* C. The i18n method of NumberFormat and DateFormat allows you to generate locale specific output.
* D. Using default locale for NumberFormat and DateFormat automatically ensures that the formatted text will be localized to the location setting of the machine on which the code is run.
    (Assuming that default locale hasn't been explicitly changed by any means.)
    When not passed to the getInstance() method, the default Locale is used,
    which is same as the one set by the operating system. If you want to change it, (for example,
    if you want to generate French format on a US machine), you must create a new Locale("fr", "FR")
    object and use the following methods to get an appropriate NumberFormat or DateFormat instance -
    
    NumberFormat:
    NumberFormat getInstance(Locale locale)
    
    DateFormat:
    DateFormat getDateInstance(int style, Locale locale)
    
    Note that DateFormat does not have getInstance(Locale locale) method.
* E. i18n stands for Internationalization and it is handled automatically by Java.
    While i18n indeed stands for Internationalization, it is not done automatically.
    You have to write code to internationalize your output.

(Correct is B, D)