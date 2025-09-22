public class interview {
    public static void main(String[] args) {
        int n[]= {10,5,17,30,40};
        // Find minimum element in Array
         int min  = n[0];
         for(int i =1; i<n.length;i++){
            if(min>n[i]){
                min = n[i];
            }
         }
         System.out.println(min);

        // Find Maximum element in Array
        int max = n[0];
        for(int i = 1; i<n.length;i++){
            if(max<n[i]){
                max = n[i];
            }
        }
        System.out.println(max);
    }
    
}
