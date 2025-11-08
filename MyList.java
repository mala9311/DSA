import java.util.LinkedList;
public class MyList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("1");
        list.addLast("2");
        System.out.println(list.getFirst());
        System.out.println(list.getLast() );
    }

    
}
