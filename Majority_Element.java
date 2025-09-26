//import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
         int number[] ={1,5,1,3,2,1,8,1,1};
         int n = number.length;
        //  First Method
    //    for(int i = 0; i< n; i++){
    //       int fre = 0;
    //         for(int j= 0; j< n;j++){
    //             if(number[i] == number[j]){
    //                 fre++;
    //                }
    //         }
    //        if(fre > n/2){
    //         System.out.println("MJ element" + number[i]);
    //         break;
    //        }
        //  }
         // Second Method
     //   int n[] ={1,2,3,2,1,4,2,2,2,1};
        // Arrays.sort(n);
        // int L = n.length;
        //  int count = 1;
        // for(int i= 1;i<L;i++){
           
        //     if(n[i] == n[i-1]){
        //         count++;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     if(count> L/2){
        //         System.out.println("Majority Element " + n[i]);
        //         break;
        //     }
        // }
        // Third Method *Moore's Voting Algorithm
            int count = 0;
            int candidate = 0;
            
            for(int i = 0;i<n;i++){
                if(count ==0){
                    candidate = number[i];
                }
                if(candidate == number[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
                System.out.println("MJ element " + candidate);
             }
    
}
