
public class RatInAMaze {

    public static void findAllPaths(int i, int j, int N, int[][] matrix, boolean[][] visited, String psf) {
        if (i < 0 || j < 0 || i >= N || j >= N) {
            return;
        }
        if (matrix[i][j] == 0 || visited[i][j] == true) {
            return;
        }

        if (i == N - 1 || j == N - 1) {
            System.out.println("Reached my destination " + psf);
            return;
        }
        visited[i][j] = true;

        findAllPaths(i - 1, j, N, matrix, visited, psf + "U");// up
        findAllPaths(i + 1, j, N, matrix, visited, psf + "D");// down
        findAllPaths(i, j - 1, N, matrix, visited, psf + "L");// left
        findAllPaths(i, j + 1, N, matrix, visited, psf + "R");// right
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1, 1 }, { 0, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };
        int N = matrix.length;
        boolean[][] visited = new boolean[N][N];
        findAllPaths(0, 0, matrix.length, matrix, visited, "");
    }
}
