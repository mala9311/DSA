import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int number[] = {2,4,6,8,9,10};
         int start = 0;
       int end = number.length -1;
       //***********Using for loop**********
       
       for(int i =number.length -1;i> 0;i--){
        int temp = number[start];
        number[start] = number[end];
        number[end]= temp;
       
    }
         System.out.println("Reverse the Arrays :"  + Arrays.toString(number));

       // Using while loop
       
      
       while(start<end) {
        int temp = number[start];
        number[start] = number[end];
        number[end]= temp;
        start++;
        end--;
       }
       System.out.println("Reverse the Arrays :" +Arrays.toString(number));

    }
    
}
