package io.marks;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import io.PathUtility;

/**
  Docs: 
   Resets the stream. If the stream has been marked, then attempt to reposition it at the mark.
   If the stream has not been marked, then attempt to reset it in some way appropriate to the particular stream,
   for example by repositioning it to its starting point. Not all character-input streams support the reset() operation,
   and some support reset() without supporting mark().
  
   What will the following code print when run?
   Assume that the file test.txt contains:
    A
    B
    C
    D
    E
  
   A.  Mark Not Supported
   B. ABCB
        <exception stack trace>
   C. ABC
        <exception stack trace>
  D. ABCBB
  E. ABCBD
  
  A Reader object just gives you a readable stream. Normally, you cannot
  go back in a stream to read the data that has already been read. However,
  some readers do allow this facility by maintaining the data in a buffer. The markSupported,
  mark, and reset methods help you go back and forth in the data stream if the underlying reader supports it.
  They allow you to set a point in the stream by calling the mark method.
  This point is like a bookmark in a book. You can return back to the same point by calling the reset method.
  Any call to read after reset will return the data right after the bookmark.

   BufferedReader does provide this facility, therefore r.markSupported() returns true.

    Now, the mark method sets the bookmark in the stream right after A.
    The parameter 100 is the limit on the number of characters that may be read while still preserving the mark.
    The two readLines calls after calling mark will return B and C.
    The call to reset will move the reader back to point right after A and therefore,
    the subsequent call to readline will return B. The second call to reset will again move
    the reader back to the point after A. The final call to readLine will thus return B.


You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/cFY3m9xNsEY
   
   (Correct D) 
  
 */
public class MarkTest {

    public static void main(String[] args) {

        String path = PathUtility.getResourcePath()
                                .append(PathUtility.getFileSeparator())
                                .append("mark_test.txt")
                                .toString()
        ;
        // "c:\\temp\\test.txt"
        try (Reader r = new BufferedReader(new FileReader(path))) {
            if (r.markSupported()) {
                BufferedReader in = (BufferedReader) r;
                System.out.print(in.readLine());
                in.mark(100);
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                in.reset();                   
                System.out.print(in.readLine());
                in.reset();                     
                System.out.println(in.readLine());
            }else{
                System.out.println("Mark Not Supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
