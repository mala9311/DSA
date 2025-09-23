import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int number[] = {2,4,6,8,9,10};
       //***********Using for loop**********
       
       for(int i =number.length -1;i> 0;i--){
        }
         System.out.println("Reverse the Arrays :"  + Arrays.toString(number));

       // Using while loop
       
       int start = 0;
       int end = number.length -1;
       while(start<end) {
        int temp = number[start];
        end = number[start];
        start = number[temp];
       }
       System.out.println("Reverse the Arrays :" +Arrays.toString(number));

    }
    
}
