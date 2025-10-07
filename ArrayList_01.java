import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(23);
        // list.add(34);
        // list.add(12);
        // list.add(2);
        // list.add(67);
        // list.add(77);
        // System.out.println(list);
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        //INPUT
        for(int i =0; i<= 5;i++){
            list.add(sc.nextInt());
        }
        //get item at any index
        for(int i =0;i<=5;i++){
            System.out.println(list.get(i));  // pass index here,list[index] syntax will not work here
        }

        System.out.println(list);

    }
}
