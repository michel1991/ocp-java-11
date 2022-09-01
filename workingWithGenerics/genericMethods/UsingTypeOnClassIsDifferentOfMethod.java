package workingWithGenerics.genericMethods;
class UsingTypeOnClassIsDifferentOfMethod{
    static String createName(){
       CrateParmeterTypeOnClassIsDifferentOfMethod<String> crate = new CrateParmeterTypeOnClassIsDifferentOfMethod<String>();
       return crate.tricky("michjobs");
    }

    public static void main(String... args){
       String name = createName();
       System.out.println("the name create is " + name);
    }

}
