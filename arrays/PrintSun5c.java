package arrays;
/**
 Given:
    public class TableTest {
        static String[][] table;
        public static void main(String[] args) {
            String[] x = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
            String[] y1 = { "1", "2", "3", "4", "5" };
            String[] y2 = { "a", "b", "c" };
            
            table = new String[3][];
            table[0] = x;
            table[1] = y1;
            table[2] = y2;
    
            //INSERT CODE HERE
    
        }
    }
    What can be inserted in the above code to make it print Sun5c?
    
    A.
      for(String[] row : table){
        System.out.print(row[row.length]);
        }
    Remember that since indexing starts with 0, length is always 1 greater than the last index.
    Therefore, row[row.length] will throw ArrayIndexOutOfBoundsException
    
    B.
        int i = 0;     
        for(String[] col : table){
            i++;
            if(i==col.length){
                System.out.print(table[col.length][i]);
            }
        }

    C.
      for(var row : table){
            System.out.print(row[row.length-1]);
        }
        
    D.
      for(int i=0; i<table.length-1; i++){
            int j = table[i].length-1;
            System.out.print(table[i][j]);
        }
           This is almost correct. Since the for condition is i < table.length-1 It will only print Sun5 and leave out the c.
     
     --------
      Correct(C)
 */
 class TableTest { // public
    static String[][] table;
    public static void main(String[] args) {
        String[] x = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        String[] y1 = { "1", "2", "3", "4", "5" };
        String[] y2 = { "a", "b", "c" };
        
        table = new String[3][];
        table[0] = x;
        table[1] = y1;
        table[2] = y2;

        //INSERT CODE HERE
        for(var row : table){
            System.out.print(row[row.length-1]);
        }

    }
}

public class PrintSun5c {
    public static void main(String[] args) {
        TableTest.main(args);
    }
}