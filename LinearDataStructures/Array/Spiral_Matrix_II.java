public class Spiral_Matrix_II {

    public static int[][] spiral_Matrix_II(int n){
        int[][] nums = new int[n][n];
        int startX = 0, startY = 0;
        int i, j;
        int count = 1;
        int offset = 1;
        int loop = 1;

        while(loop <= n/2){

            for(j = startY; j < n - offset; j++){
                nums[startX][j] = count++;
            }

            for(i = startX; i < n - offset; i++){
                nums[i][j] = count++;
            }

            for(; j > startY; j--){
                nums[i][j] = count++;
            }

            for(; i > startX; i--){
                nums[i][j] = count++;
            }

            offset++;
            startX++;
            startY++;
            loop++;
        }

        if(n%2 == 1){
            nums[startX][startY] = count;
        }

        return nums;
    }

    public static void main(String[] args) {
        
        int n = 5;
        
        int[][] nums = spiral_Matrix_II(n);

        
        System.out.println("The Spiral Matrix is:");
        for(int[] row : nums){
            for(int num : row){
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        

    }
}