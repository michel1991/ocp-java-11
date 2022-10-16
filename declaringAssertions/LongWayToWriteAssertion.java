package declaringAssertions;

class declaringAssertions{
    public static void main(String... args){
       var value = 5;
       if( value >= 5){
	   // message error can be primitive, Object, passing after point     
          throw new AssertionError(" error ");
       }
    }
}
