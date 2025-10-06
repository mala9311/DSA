public class Single_no {
    public static void main(String[] args) {
        int[] nums ={2,2,1};
        int single =0;
        for(int num : nums){
            single ^= num;
           

        }
        System.out.println(single);
    }

}
