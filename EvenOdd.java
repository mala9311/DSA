public class EvenOdd {
    public static void main(String[] args) {
        int number[] = {2,34,6,3,79,5,99};
        int even =0; int odd = 0;
     
        for(int i = 0;i<number.length; i++){
            if(number[i]%2==0){
              
               even++;
                
            }
            else{
              
              odd++;
            }
            
        }
        
        System.out.print("Even no :" + even +   " Odd no :" + odd);
    }
    
}
