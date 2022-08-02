package com.adnan._378;

public class _Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        

    }
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[m - 1][n - 1];

        while (start < end) {
            int mid = (end - start) / 2 + start;
            int count = 0;
            int j = n - 1;

            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > mid)
                    j--;
                count += j + 1;
            }

            if (count < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start;

    }
}
