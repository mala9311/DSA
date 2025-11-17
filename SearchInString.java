public class SearchInString {
    public static void main(String[] args) {
        String name = "Mala";
        char target = 'a';
        System.out.println(search(name ,target));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        // for each loop
        for(char ch :str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        // for(int i = 0; i< str.length(); i++){
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        
        return false;
    }
}

