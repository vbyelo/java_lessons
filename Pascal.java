// Trojkąt Pascala

public class Pascal {
    public static void main(String[] args){
        int num = 12;
        int[][] pascal = new int[num][];
        for (int i=0;i<num;i++){
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for(int j=1;j<i;j++){
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
            System.out.println(java.util.Arrays.toString(pascal[i]));
        }  
    }
}