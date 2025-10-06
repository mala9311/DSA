public class Convert1d_2d {
    public static void main(String[] args) {
        int[] oneD ={1,2,3,4};
        int m = 2;
        int n = 2;
        int index =0;
        int[][] twoD = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j =0; j< n;j++){
                twoD[i][j] = oneD[index++];
            }
        }
        for(int i = 0; i<m;i++){
            for(int j =0; j< n;j++){
                System.out.println("twoD array " + twoD[i][j]+ " ");
            }
             System.out.println();
        }
    }
    
}
