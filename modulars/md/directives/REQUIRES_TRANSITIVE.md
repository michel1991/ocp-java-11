### Consider the following code appearing in a module-info.java

```java
 module com.amazing.movies{
   requires transitive com.amazing.customer;
}
``` 

Identify correct statements.

* A. Any module that requires the com.amazing.movies module must also require the com.amazing.customer module.
* B. Any module that requires the com.amazing.movies module can use the com.amazing.customer module without requiring it.
* C. Only a module that requires the com.amazing.movies module can use the com.amazing.customer module.
* D. Any module that requires the com.amazing.customer module must also require the com.amazing.movies module.
* E. Any module that requires the com.amazing.movies module must require the com.amazing.customer module instead of com.amazing.movies.

requires transitive <module name> means that any module that reads the module containing
this clause implicitly also reads the transitive module.
This is very helpful when a module class's method returns a type defined in another module.

For example, let's say you have two modules finance and accounts.
finance module has a class named Report, which returns a list of Accounts through its getAccounts() method.
The Account class, on the other hand, is defined in the accounts module.

Now, any other module that calls Report.getAccounts(),
will normally need to have two requires clauses - requires finance; and requires accounts;.
But if the finance module contains requires transitive account; clause, the requires accounts;
clause will not be necessary. Any module that requires the finance module will automatically allowed to use the accounts module.
 (Coorect B)