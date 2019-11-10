// 
// 
// 

import java.util.Random;

public class Floor{
    public static void main(String[] args){
        int n = 20;
        int m = 30;
        float alpha = 0.5f;
        int[][] floor = new int[n][m];
        Random gen = new Random();
        for(int i =0; i<n; i++){
            for(int j=0;j<m;j++){
                if(Math.random()<alpha){
                    floor[i][j] = gen.nextInt(2); 
                }
            }
            System.out.println(java.util.Arrays.toString(floor[i]));

        }
    }
}