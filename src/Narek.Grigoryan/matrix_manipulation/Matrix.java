package matrix_manipulation;


import java.util.stream.IntStream;

public class Matrix {

    int[][] matrixArray;//modificator
    int rowDim;
    int colDim;

    public Matrix(int rowDim, int colDim) {
        this.rowDim = rowDim;
        this.colDim = colDim;
        this.matrixArray = new int[rowDim][colDim];
    }

    public Matrix() {
        matrixArray = new int[0][0];
    }

    public void set(int row, int col, int elem) {
        if (row < rowDim && col < colDim) {
            matrixArray[row][col] = elem;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();//move up, index in message
        }
    }

    public int getColDim() {
        return colDim;
    }

    public int getRowDim() {
        return rowDim;
    }

    public int get(int row, int col) {
        if (row < rowDim && col < colDim)
            return matrixArray[row][col];

        throw new ArrayIndexOutOfBoundsException();
    }

    public int[] getRow(final int rowNumber) {
        return matrixArray[rowNumber];
    }

    public int[] getCol(final int colNumber) {
        return IntStream.range(0, rowDim)
                .map(i -> matrixArray[i][colNumber])
                .toArray();
    }

    public void print() {
        for (int i = 0; i < rowDim; ++i) {
            for (int j = 0; j < colDim; ++j)
                System.out.print(matrixArray[i][j] + " ");

            System.out.println();
        }

    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.colDim != b.rowDim)
            throw new RuntimeException("Illegal matrix dimensions.");

        Matrix result = new Matrix(a.rowDim, b.colDim);

        for (int i = 0; i < a.rowDim; ++i)
            for (int j = 0; j < b.colDim; j++)
                result.matrixArray[i][j] = dotProduct(a.getRow(i), b.getCol(j));


        return result;
    }

    public static int dotProduct(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                .map(i -> a[i] * b[i])
                .sum();
    }

}
