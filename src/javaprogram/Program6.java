package javaprogram;

public class Program6 {
    public static void main(String[] args){
        /*int i;
        int j;
        int k;
        int n = 6;
         for(i = 1 ; i <= 6 ; i++)
         {
             for(k=1; k<=(n-i); k++)
             {
                 System.out.print(" ");
             }
             for(j=1; j<=i; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }


*/

        int rows = 5; // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Print spaces for the left side
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars for the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
