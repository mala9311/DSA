import java.util.*;

public class Arraylist_Projects {
        public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<String>();
    boolean isTrue = true;
while(isTrue){
    System.out.println("--- Menu---");
    System.out.println("1:---Add Tasks---");
    System.out.println("2:---View Tasks---");
    System.out.println("3:---Remove Tasks---");
    System.out.println("4:--Exit---");
    System.out.print("Which Operation Do you want to perform :");
    int choice = sc.nextInt();
    sc.nextLine();
      
    switch (choice) {
        case 1:
            System.out.println("Enter Tasks : ");
            String task = sc.nextLine();
            tasks.add(task);
            System.out.println("Task added");
             break;
        case 2:
        if(tasks.size()==0){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Your Tasks : ");
            for(int i =0;i<tasks.size();i++){
                System.out.println(tasks.get(i));
            }
        }
            
            break;
        case 3:
            System.out.println("Enter the number of tasks which you want to remove : ");
            int index = sc.nextInt();
            index = index-1;
            if(index <0 || index > tasks.size()){
                System.out.println("Invalid Input");
            }
            else{
                tasks.remove(index);
            System.out.println("Your tasks is deleted");
            }
            break;
            case 4:
            isTrue = false;
            System.out.println("Good Bye :)");
            break;
            default:
            System.out.println("Invalid Number");
            break;
    }

        }
sc.close();
             }
}
    

