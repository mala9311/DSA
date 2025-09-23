public class sum_element {
    public static void main(String[] args) {
         int number[] ={10,20,30,40,50};
         int sum = number[0];
        for(int i = 1;i<number.length;i++){
            sum += number[i];
        }
            System.out.println(sum);
    }
}
