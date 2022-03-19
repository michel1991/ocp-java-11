import java.util.Arrays;
public class SearchWithSortArray{
 public static void main(String[] args){
    int[] numbers = {2, 4, 6, 8};
    System.out.println("index search 2 is " +Arrays.binarySearch(numbers, 2) + " array value is {2, 4, 6, 8}");
    System.out.println("index search 4 is " +Arrays.binarySearch(numbers, 4) + " array value is {2, 4, 6, 8}");
    System.out.println("index search 1 is " +Arrays.binarySearch(numbers, 1) + " array value is {2, 4, 6, 8}");
    System.out.println("index search 3 is " +Arrays.binarySearch(numbers, 3) + " array value is {2, 4, 6, 8}");
    System.out.println("index search 9 is " +Arrays.binarySearch(numbers, 9) + " array value is {2, 4, 6, 8}");
 }
 
}
