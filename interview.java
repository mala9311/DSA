public class interview {
    public static void main(String[] args) {
        int n[]= {10,5,17,30,40};
         int min  = n[0];
         for(int i =1; i<n.length;i++){
            if(min>n[i]){
                min = n[i];
            }
         }
         System.out.println(min);
    }
    
}
