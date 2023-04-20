package arrays.errors;
public class ArrayCreationWithoutSize {
    /**
      How many of the following are legal declarations?
        A. None
        B. One
        C. Two
        D. Three
        E. Four

        When creating an array object, a set of elements or size is required.
        Therefore, lion and bear are incorrect.
        The brackets containing the size are required to be after the type,
        making ohMy incorrect. The only one that is correct is tiger,
        making the correct answer option B.

     */
  static void creation(){
      float[] lion = new float[];
      float[] tiger = new float[1];
      float[] bear = new[] float;
      float[] ohMy = new[1] float;

  }
}