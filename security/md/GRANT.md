### You go to the library and want to read a book. Which is true?
``` txt
grant {
    permission java.io.FilePermission
    "/usr/local/library/book.txt",
    "read,write";
};
```
* A. The policy is correct.
* B. The policy is incorrect because file permissions cannot be granted this way.
* C. The policy is incorrect because read should not be included.
* D. The policy is incorrect because the permissions should be separated with semicolons.
* E. The policy is incorrect because write should not be included.

The policy compiles and uses correct syntax. However, it gives permissions that are too broad.
The user needs to be able to read a book, so write permissions should not be granted.

###### You ask to borrow one of your friend’s recipe cards.
###### Which statements about these cards, represented as Java policy file grants, are correct? (Choose two.)

``` txt
    grant {
        permission java.io.FilePermission
        "/dessert/icecream/rockyroad.yum","read,write";
        permission java.io.FilePermission
        "/dessert/icecream/mintchip.yum","read";
    };
```

*  A. The policy syntax of the policy file is correct.
*  B. The policy syntax of the policy file is incorrect.
*  C. The policy is incorrect because read should not be included in the first permission.
*  D. The policy is incorrect because write should not be included in the first permission.
*  E. The policy is incorrect because read should not be included in the second permission.
*  F. The policy is incorrect because file permissions cannot be granted this way.

The policy compiles and uses correct syntax, making option A correct.
However, it gives permissions that are too broad.
The user needs to be able to read a recipe,
so write permissions should not be granted, making option D also correct.

### You have just taken over as the build manager for your development team and while
### go through all the build steps you notice that one of the steps of your build involves running
### a tool over your java files for preprocessing. This tool runs with a security file containing the following code:

```txt
    grant codeBase "file:${toolhome}/tool.jar",  {
        permission java.security.AllPermission;
    };

    What should you do?

    Note: Although security policy file is not mentioned in the exam objectives explicitly, we have seen similar question in the exam.
```


* A. Replace the AllPermission line and replace it with the actual permissions that are required.
* B. Stop using the tool.
* C. File a security complain with the tool vendor.
* D. Not do anything because listing just the required permissions would be a maintenance challenge.
Generally, it is preferable to list specific permissions instead of giving a blank check except is certain situations.
* E. Not do anything because it is an internal development step and does not affect final classes.
Generally, whether something affects the final classes or not, should not be a criteria to decide whether all permissions should be granted or not.

The problem statement is a little vague because it does not specify the purpose of the tool and what kinds of activities does it perform.

Generally, it is ok for administrators to use AllPermission.
AllPermission is introduced to simplify the work of system administrators who might need to perform multiple
tasks that require all (or numerous) permissions. It would be inconvenient to require the security policy to iterate through all permissions.
Note that AllPermission also implies new permissions that are defined in the future.

Clearly much caution is necessary when considering granting this permission.
(Correct D)