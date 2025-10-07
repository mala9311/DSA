import java.util.Scanner;
import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the Matrix of 3,3");
        /*
         1 2 3
         4 5 6 

         */
        // int[][] arr = {
        //     {1 ,2 ,3},
        //     {4 ,5 ,6}
        // };
       // System.out.println(Arrays.deepToString(arr));
       
        // Print using Arrays.deepToString
      //  System.out.println(Arrays.deepToString(arr));
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }}
        // Print in matrix form
        for (int row = 0; row < arr.length; row++) {
            // for (int col = 0; col < arr[row].length; col++) {
            //     System.out.print(arr[row][col] + " ");
            // }
            
            // System.out.println();
            System.out.println(Arrays.toString(arr[row]));
        }
        
    }
        // System.out.println("Using Arrays.deepToString:");
       // System.out.println(Arrays.deepToString(arr));


      //  System.out.println(arr[][]);
    }
    

