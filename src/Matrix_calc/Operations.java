package Matrix_calc;

import java.lang.reflect.Array;

public class Operations {
    public static double[][] sum(double[][] a, double[][] b) {
        if (a.length != b.length & a[0].length != b[0].length) {
            System.out.println("Введенные матрицы невозможно сложить!\n" +
                    "Mатрицы возможно сложить если они имеют одинаковую размерность");
            return null;
        }
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static double[][] razn(double[][] a, double[][] b) {
        if (a.length != b.length & a[0].length != b[0].length) {
            System.out.println("Вычитание не возможно!\n" +
                    "Mатрицы возможно вычесть если они имеют одинаковую размерность");
            return null;
        }
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static double[][] MatrixMultiplication(double[][] a, double[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Введенные матрицы невозможно перемножить!\n" +
                    "Mатрицы возможно перемножить если количество столбцов первой матрицы \n" +
                    "равно количеству строк второй матрицы.Пожалуйста повторите ввод");
            return null;
        }
        double[][] arr = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    arr[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return arr;
    }

    public static double[][] multiply(double a, double[][] b) {
        double[][] arr = new double[b.length][b[0].length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                arr[i][j] = a * b[i][j];
            }
        }
        return arr;
    }

    public static double[][] transp(double[][] a) {
        double[][] tr = new double[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                tr[i][j] = a[j][i];
            }
        }
        return tr;
    }

    public static double det(double arr[][]) {
        if (arr.length == 1)
            return arr[0][0];
        int size = arr.length;
        double[][] arr0 = new double[size - 1][size - 1];
        double d = 0, k = 1;
        int s = 0;
        for (int r = 0; r < size; r++) {
            int i = 0, j = 0;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row != 0 && col != r) {
                        arr0[i][j++] = arr[row][col];

                        if (j == size - 1) {
                            j = 0;
                            i++;
                        }
                    }
                }
            }
            d += k * arr[0][r] * det(arr0);
            k *= -1;
        }
        return d;
    }

    public static double[][] InverseMatrix(double[][] a) {
        double d = 1 / det(a);
        double[][] arr1 = transp(a);
        double[][] arr = multiply(d, arr1);
        return arr;
    }

    public static double[][] MatrixPow(double[][] a, double b) {
        double[][] c = a.clone();
        for (int i = 1; i < b; i++) {
            a = MatrixMultiplication(a, c);
        }
        return a;
    }
}