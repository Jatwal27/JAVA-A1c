import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        double[][] m = new double[3][3];
        int x = 1;
        Scanner userIn = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter a number for position " + x + ": ");
                m[i][j] = userIn.nextInt();
                x++;
            }
        }
        double sum = MatrixSum.sumMArr(m);
        System.out.println("\nThe sum of the array is " + sum);
    }
}
