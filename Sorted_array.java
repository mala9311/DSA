public class Sorted_array {
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,8,6};
        boolean sorted = true;
        for(int i = 0; i< number.length-1;i++){
            if(number[i]>number[i+1]){
                sorted = false;
               break;
            }
        }
        System.out.println("IS SORTED :" +sorted);
    }
    
}
