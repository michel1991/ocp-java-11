package workingWithGenerics.genericMethods;
class UsingTypeOnClassIsDifferentOfMethod{
    static String createName(){
       CrateParmeterTypeOnClassIsDifferentOfMethod<String> crate = new CrateParmeterTypeOnClassIsDifferentOfMethod<String>();
       return crate.tricky("michjobs");
    }
        
    static int create(int size){
       CrateParmeterTypeOnClassIsDifferentOfMethod<String> crate = new CrateParmeterTypeOnClassIsDifferentOfMethod<String>();
       return crate.tricky(size);
    }

    public static void main(String... args){
       String name = createName();
       System.out.println("the name create is " + name);

         System.out.println("the name create size is " + create(1));

    }

}
