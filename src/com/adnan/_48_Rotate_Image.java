package com.adnan;

public class _48_Rotate_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        rotate(arr);
        print2D(arr);
    }
    public static void rotate(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;



        while(top<bottom){
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }



        for(int i =0;i<matrix.length;i++){
            for(int j = i+1 ; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    static void print2D (int[][] matrix){
        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
}
