package advancedDesign;
/**
   What is the result of the following code?

    A. byteint
    B. intbyte
    C. Compiler error on line 5

    The code compiles fine, so options C, D, and E are incorrect.
    The call to print() on line 15 invokes the overloaded print() method on line 8 because short can be widened to int.
     The call to print() on line 16 invokes the print() method on line 2 because it is an exact match.
     Therefore, the output is intbyte, and the answer is option B.

 */
 class BytePrinter { // 1:
    public void print(byte b) { //  2:
        System.out.print("byte"); //  3:
    } //  4:
    public void print(Byte b) { // 5:
        System.out.print("Byte"); //    6:
    } //    7:
    public void print(int i) { //   8:
        System.out.print("int"); //   9:
    } //  10:
    public static void main() { //    11:
        var printer = new BytePrinter(); //   12:
        short x = 10; //   13:
        byte y = 12; //  14:
        printer.print(x); //       15:
        printer.print(y); //  16:
    } //  17:
} //     18:

public class BytePrinterOverloadWithAutoBoxing {
    public static void main(String[] args) {

    }
}