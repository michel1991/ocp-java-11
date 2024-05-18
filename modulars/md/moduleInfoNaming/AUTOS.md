#### Which of the following are valid module definitions?

* A.
 //In file module.java:
    ```
        module autos{
        }
    ```
------
  File name of the file that contains module definition must be module-info.java.

* B.
 //In file autos.java:
   ```
      module autos{
      }
  ```
   

* C.
  //In file module-info.java:
   ```
      module autos{
       }
  ```
       

* D.
  ```
    //In file module-info.java:
        module cars{
            exports com.car;
        }
        module trucks{
            requires cars;
        }
  ```

------------------
There can be only one module definition in a module-info.java file because
a module must reside in a directory with the same name as the module name.

* E
 //In file module-info.java:
```
    module-info autos{
    }
```

-----------
Module definition must start with module keyword, not module-info.

--------------------------------
Correct (C)