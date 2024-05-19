### You are creating an enthu.questionbank module that depends on enthu.internal.db and enthu.external.feeds modules.
### Which of the following files correctly defines this module?

* A.
//In file module-info.java:
   ```java
     module enthu.questionbank{
        requires enthu.internal.db, enthu.external.feeds;
    }
   ```

-----
Each required module must be specified on a separate requires clause.

* B.
    //In file module-info.java:
   ```java
      module enthu.questionbank{
         uses enthu.internal.db, enthu.external.feeds;
     }
   ```

    ----------
    uses clause is a not valid here. It must be requires.
    A uses clause is used for declaring dependence on a service, while a requires clause is used to declare dependence on a module.

* C.
    //In file module-info.java:
   ```java
      module enthu.questionbank{
        import enthu.internal.db;
        import enthu.external.feeds;
    }
   ```
   
    ---------------
    "import" is a not a valid clause. It must be "requires".

* D.
    //In file module-info.java:
    
   ```java
     module enthu.questionbank{
        require enthu.internal.db;
        require enthu.external.feeds;
     }
   ```
    --------
    It must be "requires" not "require".

* E.
  None of the above are valid.
    The correct definition would be:
    //In file module-info.java:
  ```java
    module enthu.questionbank{
        requires enthu.internal.db;
        requires enthu.external.feeds;
    }
   ```
    

Correct (E)