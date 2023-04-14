package Matrix_calc;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Input_output {
    public static double[][] MatrixInput() {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        //if (k == 0) {//Ввод матрицы
            System.out.println("Введите колличество строк");
            a = in.nextInt();
            System.out.println("Введите колличество столбцов");
            b = in.nextInt();
        /*} else if (k == 1) {//Ввод строки
            a = 1;
            System.out.println("Введите длинну строки:");
            b = in.nextInt();
        } else if (k == 2) {//ввод столбца
            b = 1;
            System.out.println("Введите высоту столбца:");
            a = in.nextInt();
        } else if (k == 3) {//ввод квадратной матрицы
            System.out.println("Введите одну из сторон матрицы:");
            a = in.nextInt();
            b = a;
        }*/
        in.nextLine();
        System.out.println("Введите значения построчно.\n" +
                "Внимание числа введенные за пределами строки будут автоматически удалены");
        double[][] array = new double[a][b];
        for (int i = 0; i < a; i++) {
            String[] line = in.nextLine().split(" ");
            for (int j = 0; j < b; j++) {
                array[i][j] = Double.parseDouble((line[j]));
            }
        }
        return array;
    }

    public static void MatrixPrint(double array[][]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
