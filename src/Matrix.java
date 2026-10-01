import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Kérem a kétdimenziós mátrix első dimenziójának méretét: ");
    int x = sc.nextInt();
    IO.println("Kérem a kétdimenziós mátrix második dimenziójának méretét: ");
    int y = sc.nextInt();

    int[][] matrix = new int[x][y];
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
            IO.println("Kérem a mátrix " + row + ". sor " + column + ". oszlopának értékét: ");
            matrix[row][column] = sc.nextInt();
        }
    }
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
            IO.println(matrix[row][column]);
        }
    }
}