public class Main {
    public static void main(String[] args) {

        int fila = 2;
        int colunma = 1;
        int[][] matrix = new int[fila][colunma];

        for (int i = 0; i < fila ; i++) {
            for (int j = 0; j < colunma; j++) {
                matrix[i][j] = i*fila + j;
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}