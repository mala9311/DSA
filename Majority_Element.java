import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        //  int n[] ={1,5,1,3,2,1,8,1,1};
          // First Method
    //    for(int i = 0; i< n.length; i++){
    //       int fre = 0;
    //         for(int j= 0; j< n.length;j++){
    //             if(n[i] == n[j]){
    //                 fre++;
    //                }
    //         }
    //        if(fre > n.length/2){
    //         System.out.println("MJ element" + n[i]);
    //         break;
    //        }
    //      }
         // Second Method
        int n[] ={1,2,3,2,1,4,2,2,2,1};
        Arrays.sort(n);
        int L = n.length;
         int count = 1;
        for(int i= 1;i<L;i++){
           
            if(n[i] == n[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count> L/2){
                System.out.println("Majority Element " + n[i]);
                break;
            }
        }
            }
    
}
