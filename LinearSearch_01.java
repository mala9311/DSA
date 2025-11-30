public class LinearSearch_01 {
    public static void main(String[] args) {

        int [] nums ={23,45,1,9,8,18,-3};
        int target = 18;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    //Search the target and return the element
    //search in the array : return the index if item found
    //otherwise if item not found return -1
        static int linearsearch(int [] arr,int target){
            if(arr.length == 0){
                return -1;
            }
            //run a for loop

            for(int index = 0; index < arr.length; index++){
                //check for element at every index if it is = target
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
            //for each loop for string;
           /*  for (int element : arr ){
                if(element == target){
                    return element;
        }
                    }
           */ 
            //this line will execute if none of the return statements above have
            //hence the target not found
            return -1;
        }
    /*      int a[] ={9,40,21,14,8,98};
        int target = 78;
        boolean found = false;
        for(int i = 0; i< a.length-1 ;i++){
            if(a[i] == target){

                System.out.println("present");
                found = true;
                break;

            }
        }
        if(!found){
            System.out.println("not present");
        }
    */
}
    


