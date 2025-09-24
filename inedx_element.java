import java.util.Scanner;
public class inedx_element {
    public static void main(String[] args) {
        int number[] = {1,3,4,5,2,7,8};
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number from 1 to 10 :"); 
       int n = sc.nextInt();
       boolean found = false;
       for(int i = 0; i<number.length;i++){
        if(n == number[i]){
            System.out.println("number is present at"+ i +" of your n" +n);
            found = true;
            break;

        }
        
        }
        if(!found){
            System.out.println("not found "+ n);
        }
       }
    }
    

