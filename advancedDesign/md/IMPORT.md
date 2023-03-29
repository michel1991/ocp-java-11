##### Given the following two classes, each in a different package,
##### which line inserted into the code allows the second class to compile?

```java
    package clothes;
    public class Store {
        public static String getClothes() { return "dress"; }
    }

    package wardrobe;
    // INSERT CODE HERE
    public class Closet {
        public void borrow() {
            System.out.print("Borrowing clothes: "+getClothes());
        }
    }

```

* A. static import clothes.Store.getClothes;
* B. import clothes.Store.*;
* C. import static clothes.Store.getClothes;
* D. import static clothes.Store;

Option A is incorrect because the keywords static and import are reversed.
The Closet class uses the method getClothes() without a reference to the class name Store;
therefore, a static import is required. For this reason,
option B is incorrect since it is missing the static keyword.
Option D is also incorrect since static imports are used with members of the class,
not a class name.
Finally, option C is the correct answer since it properly imports the method into the class using a static import.