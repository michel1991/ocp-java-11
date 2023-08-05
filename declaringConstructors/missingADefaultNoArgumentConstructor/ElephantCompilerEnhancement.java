package declaringConstructors.missingADefaultNoArgumentConstructor;
class ElephantCompilerEnhancement extends Mammal{
    public ElephantCompilerEnhancement(){
        super(); // does not compile because add by compiler
    }
    
}