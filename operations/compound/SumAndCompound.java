package operations.compound;

public class SumAndCompound {
    /**
        * The starting values of ticketsTaken and ticketsSold are 1 and 3, respectively.
        * After the first compound assignment, ticketsTaken is incremented to 2.
        * The ticketsSold value is increased from 3 to 5 since the post-increment operator was used the value of ticketsTaken++ returns 1.
        * On the next line, ticketsTaken is doubled to 4. On the final line, ticketsSold is increased by 1 to 6.
        * The final values of the variables are 4 and 6, for ticketsTaken and ticketsSold, respectively, making options C and F the correct answers.
        * Note the last line does not trigger a compilation error as the compound operator automatically casts the right-hand operand.
        */
        public static void sumAndCompound(){
            System.out.println("begin sumAndCompound");
            int ticketsTaken = 1;
            int ticketsSold = 3;
            ticketsSold += 1 + ticketsTaken++;
            System.out.println();
            ticketsTaken *= 2;
            ticketsSold += (long)1;
            System.out.println("\t ticketsTaken: " + ticketsTaken + " ticketsSold: " + ticketsSold);
            System.out.println("end sumAndCompound");
        }
    
    public static void main(String[] args) {
        sumAndCompound();
    }
}