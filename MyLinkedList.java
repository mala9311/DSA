public class MyLinkedList {
    class Node{
        String data;
        Node next;

        Node(String value){
            data = value;
            next =null;
        }
    }
    Node head;

    //Add First Method
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head ==null){
            head =newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }

    //Add Last Method

    public void addLast(String data){
        Node newNode = new Node(data);
         
        if(head ==null){
            head =newNode;
            return;
        }
        Node temp =head;

        while(temp.next != null){
            temp =temp.next;
        }
        temp.next = newNode;
    }

    //Remove First Node

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head =head.next;
    }

    //Remove Last Node

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    //Get First

    public void getFirst(){
        System.out.println(head.data);
    }

    //Get Last Node

    public void getLast(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void show(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

    }
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("3");
        list.removeFirst();
        list.show();
    }
    
}
