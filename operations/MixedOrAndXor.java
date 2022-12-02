package operations;
public class MixedOrAndXor {
    /**
    *  What are the outputs of the following code snippet? (Choose all that apply.)
    *   A. 1
        B. 2
        C. 3
        D. 4
        E. 5.0
        F. 6.0
        G. The code does not compile.

      The code compiles and runs without issue, so option G is incorrect.
      The first boolean expression evaluates to true | true ^ false, which reduces to true ^ false, which is true, so penguin is set to a value of 1, making option A correct.
      The second boolean expression evaluates to false || true, which is true, and falcon is set to a value of 3, making option C correct.
      Finally, the last expression evaluates to true ^ !!true, which reduces to true ^ true, which is false, and hawk is set to a promoted double value of 6.0, making option F correct.
     */
      public static void firstExample(){
          boolean flies = true, runs = true, crawls = false;
          int penguin = flies | runs ^ crawls ? 1 : 2;
          long falcon = !flies || runs ? 3 : 4;
          double hawk = flies ^ !!runs ? 5 : 6;
          System.out.println(penguin);
          System.out.println(falcon);
          System.out.println(hawk);
      }

    public static void main(String... args){
        firstExample();
    }

}