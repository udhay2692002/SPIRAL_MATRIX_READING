public class readinspiral {


    public static void main(String[] args)
    {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//OUTPUT: 1,2,3,6,9,8,7,4,5
        int rowstart=0;
        int colstart=0;
        int rowend=matrix.length-1;
        int colend=matrix.length-1;

           for (int i = colstart; i <= colend; i++) {
               System.out.print(matrix[rowstart][i]);
           }
           rowstart++;

           for (int j = rowstart; j <= rowend; j++) {
               System.out.print(matrix[j][colend]);
           }
           colend--;


           for (int k = colend; k >= colstart; k--) {
               System.out.print(matrix[rowend][k]);
           }
           rowend--;

           for (int l = rowstart; l >= rowend; l--) {
               System.out.print(matrix[l][colstart]);
           }
           colstart++;

           for (int m = colstart; m <= colend; m++) {
               System.out.print(matrix[rowstart][m]);
           }
    


    }



}


