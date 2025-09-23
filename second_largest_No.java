public class second_largest_No {
    public static void main(String[] args) {
        int number[] = {3,20,40,35,31};
        int First = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        for(int i :number){
            if(i>First){
                Second = First;
                First = i;
            }
            else if(i>Second && i != First){
                Second =i;
            }

        }
        System.out.println("First max no. :" +First + " Second max no." +Second);

    }
    
}
