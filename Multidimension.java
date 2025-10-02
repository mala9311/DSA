import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        /*
         1 2 3
         4 5 6 

         */
        int[][] arr = {
            {1 ,2 ,3},
            {4 ,5 ,6}
        };
       // System.out.println(Arrays.deepToString(arr));
       
        // Print using Arrays.deepToString
        System.out.println(Arrays.deepToString(arr));

        // Print in matrix form
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


      //  System.out.println(arr[][]);
    }
    
}
