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