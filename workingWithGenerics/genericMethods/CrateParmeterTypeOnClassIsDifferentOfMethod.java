package workingWithGenerics.genericMethods;
class CrateParmeterTypeOnClassIsDifferentOfMethod<T>{
        <T> T tricky(T t){
            return t;
       }
}
