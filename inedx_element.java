import java.util.Scanner;
public class inedx_element {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7};
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number from 1 to 10 :"); 
       int n = sc.nextInt();
    //    boolean found = false;
    int index =1;
       for(int i = 0; i<number.length;i++){
        if(n == number[i]){
            // System.out.println("number is present at"+ i +" of your n" +n);
            // found = true;
            index = i;
            break;

        }}
        System.out.println("iNDEX of" + n +" is"+index);
        
        // if(!found){
        //     System.out.println("not found "+ n);
        // }
        sc.close();
       }
    }
    

