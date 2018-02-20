package matrix_manipulation;

import java.util.Scanner;

public class MatrixMultiplicationMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m1, m2, n1, n2;

        System.out.print("Please enter the dimensions of first matrix: ");
        m1 = scanner.nextInt();
        n1 = scanner.nextInt();

        Matrix matrix1 = new Matrix(m1, n1);

        System.out.println("Please initialize the matrix.");
        for (int i = 0; i < matrix1.getRowDim(); ++i)
            for (int j = 0; j < matrix1.getColDim(); ++j) {
                int elem = scanner.nextInt();
                matrix1.set(i, j, elem);
            }

        System.out.print("Please enter the dimensions of second matrix: ");
        m2 = scanner.nextInt();
        n2 = scanner.nextInt();

        Matrix matrix2 = new Matrix(m2, n2);

        System.out.println("Please initialize the matrix.");
        for (int i = 0; i < matrix2.getRowDim(); ++i)
            for (int j = 0; j < matrix2.getColDim(); ++j) {
                int elem = scanner.nextInt();
                matrix2.set(i, j, elem);
            }

        System.out.println("The result of multiplication is:");
        Matrix res = Matrix.multiply(matrix1, matrix2);
        res.print();
    }
}

