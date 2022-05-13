public class Sum_Matrix {
    private static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] organs) {
        System.out.println(sum(matrix));
    }

    public static int sum(int[][] matrix) {
        int sum=0;
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return (sum);
    }
}
