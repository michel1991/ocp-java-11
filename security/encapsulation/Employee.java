package security.encapsulation;
/**
   What can be added to the following Person class so that it is properly encapsulated and the code prints 29?
     class Person{
        //Insert code here
    }
    public class Employee extends Person{
            public static void main(String[] args) {
                Employee e = new Employee();
                e.setAge(29);
                System.out.println(e.getAge());
            }
    }
    
    A.
       private int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        
    B.
      protected int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        -------
        protected is not a valid way to encapsulate a field because any class in a package can access the field.

    C.
        int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        --------------
        No access modifer to age means it has default access i.e. all the members of the package can access it. This breaks encapsulation.
        
    D.
       private int age;
        private int getAge() {
            return age;
        }
        private void setAge(int age) {
            this.age = age;
        }
    If you make getAge and setAge private, you cannot call them from Employee class.

    E.
        private int age;
        public int getAge() {
            return age;
        }
        protected void setAge(int age) {
            this.age = age;
        }
        
    -------------------------------
    This is a ambiguous question because it doesn't give all the information.
    It really depends on the business logic of the class and the whole application whether the accessor methods (and specially the setter)
    should be public or protected or even private. The field should be private.
    Expect such questions in the exam.

    correct(A, E)
 */

class Person { // public 
    private int age;
    public int getAge() {
        return age;
    }
    protected void setAge(int age) {
        this.age = age;
    }

}

public class Employee extends Person{
        public static void main(String[] args) {
            Employee e = new Employee();
            e.setAge(29);
            System.out.println(e.getAge());
        }
}