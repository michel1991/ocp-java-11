package definingAnInterface;
class CanBurrowImplWithPrimitiveReturnTypeAsDeclaration implements CanBurrow{
  public float getSpeed(int age){
      return  age + 1.0f;
   }
}
