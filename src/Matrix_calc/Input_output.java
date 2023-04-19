package Matrix_calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Input_output {
    public static double[][] MatrixInput() {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Введите колличество строк");
        a = in.nextInt();
        System.out.println("Введите колличество столбцов");
        b = in.nextInt();
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

    public static double[][] MatrixInputFile(int a, int b,int l) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Matrix.txt"));
        double[][] array = new double[a][b];
        for (int i=0;i<l;i++){
            scanner.nextLine();
        }
        for (int i = 0; i < a; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < b; j++) {
                array[i][j] = Double.parseDouble((line[j]));
            }
        }
        return array;
    }
    public static double NumberInputFile(int l) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Matrix.txt"));
        for (int i=0;i<l;i++){
            scanner.nextLine();
        }
        double a=scanner.nextDouble();
        return a;
    }
    public static void MatrixPrintFile(double[][] arr) throws FileNotFoundException {
        PrintWriter write=new PrintWriter("MatrixRes.txt");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                write.print(arr[i][j]+" ");
            }
            write.println();
        }
        write.close();
    }
    public static void PrintFile(double a) throws FileNotFoundException {
        PrintWriter write=new PrintWriter("MatrixRes.txt");
        write.println(a);
        write.close();
    }
}