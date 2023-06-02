### before answer
* check enums context (enums has implicit static specifier)
* check ; after statement in case anonym class
* in method static with nested class, check that the instance is create correctly with full path of class
* nested class (member properties) is linked to instance method, for this reason be carefull does not use implicit instance in static method (create instance correctly)
    * See some example in DeerInnerClassRequireReferenceOnStaticMethod (error)
    * ColorBadCallMemberClass  (error)

* Anonyms class check  open  { and close } with ;
*  member inner class is linked to instance  of outer class for this reason it can only hold static member porperty with final specifier (method static not allow)
* Remember that all nested classes can have static variables if they are marked final
* respect all rule of interface/abstract class when using it with anonyms class
