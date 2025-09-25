import java.util.*;
public class FindRankAndIndex {
    public static void main(String[] args) {
        int number[] = {1,3,69,6,9,88};
        Scanner sc = new Scanner(System.in);

        System.out.println("REnter the number: ");
        int n =sc.nextInt();

        //save the original index
        int originalIndex = -1;
        for(int i = 0;i<number.length;i++){
            if(number[i] == n){
                originalIndex = i;
                break;
            }
        }
    

        // Sort array in ascending order
        int sortedArray[] = number.clone(); // clone to preserve original
        Arrays.sort(sortedArray);

        boolean found = false;
        for (int i = 0; i < sortedArray.length; i++) {
            if (n == sortedArray[i]) {
                int rankFromHighest = sortedArray.length - i;
                System.out.println(n + " is the " + rankFromHighest + " highest element");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(n + " is not in the array");
        } else {
            System.out.println("Original index of " + n + " is: " + originalIndex);
         
    }
    sc.close();
}
}
