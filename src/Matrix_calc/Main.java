package Matrix_calc;

import java.util.Scanner;

import static Matrix_calc.Input_output.*;
import static Matrix_calc.Operations.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i == 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер операции, корую хотите выполнить");
            System.out.println("1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.println("5.Транспонирование");
            System.out.println("6.Определитель матрицы");
            System.out.println("7.Обратная матрица");
            System.out.println("8.Возведение матрицы в степень");
            System.out.println("0.Выход");
            int n = in.nextInt();
            if (n == 1) {//сложение
                System.out.println("Введите 1 матрицу");
                double[][] arr1 = MatrixInput(0);
                System.out.println("Введите 2 матрицу");
                double[][] arr2 = MatrixInput(0);
                double[][] arr3 = sum(arr1, arr2);
                if (arr3 == null) i = 0;
                else {
                    MatrixPrint(arr3);
                    i = 1;
                }
            } else if (n == 2) {//вычитание
                System.out.println("Введите 1 матрицу");
                double[][] arr1 = MatrixInput(0);
                System.out.println("Введите 2 матрицу");
                double[][] arr2 = MatrixInput(0);
                double[][] arr3 = razn(arr1, arr2);
                if (arr3 == null) i = 0;
                else {
                    MatrixPrint(arr3);
                    i = 1;
                }
            } else if (n == 3) {
                System.out.println("Введите номер варианта умножения");
                System.out.println("1.Матрица на число");
                System.out.println("2.Матрица на матрицу");
                System.out.println("3.Матрица на строку");
                System.out.println("4.Матрица на столбец");
                System.out.println("0.Изменить операцию");
                n = in.nextInt();
                if (n == 0) {
                    i = 0;
                } else if (n == 1) {
                    System.out.println("Введите матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите число");
                    double a = in.nextDouble();
                    double[][] arr = multiply(a, arr1);
                    MatrixPrint(arr);
                    i = 1;
                } else if (n == 2) {
                    System.out.println("Введите 1 матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите 2 матрицу");
                    double[][] arr2 = MatrixInput(0);
                    double[][] arr3 = MatrixMultiplication(arr1, arr2);
                    if (arr3 == null) i = 0;
                    else {
                        MatrixPrint(arr3);
                        i = 1;
                    }
                } else if (n == 3) {
                    System.out.println("Введите матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите строку");
                    double[][] arr2 = MatrixInput(1);
                    double[][] arr3 = MatrixMultiplication(arr1, arr2);
                    if (arr3 == null) i = 0;
                    else {
                        MatrixPrint(arr3);
                        i = 1;
                    }
                } else if (n == 4) {
                    System.out.println("Введите матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите столбец");
                    double[][] arr2 = MatrixInput(2);
                    double[][] arr3 = MatrixMultiplication(arr1, arr2);
                    if (arr3 == null) i = 0;
                    else {
                        MatrixPrint(arr3);
                        i = 1;
                    }
                } else {
                    System.out.println("Данный пункт не найден, повторите ввод");
                    i = 0;
                }
            } else if (n == 4) {
                System.out.println("Введите номер варианта деления");
                System.out.println("1.Матрица на число");
                System.out.println("2.Матрица на матрицу");
                System.out.println("0.Изменить операцию");
                n = in.nextInt();
                if (n == 0) {
                    i = 0;
                } else if (n == 1) {
                    System.out.println("Введите матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите число");
                    double a = 1 / in.nextDouble();
                    double[][] arr = multiply(a, arr1);
                    MatrixPrint(arr);
                    i = 1;
                } else if (n == 2) {
                    System.out.println("Введите 1 матрицу");
                    double[][] arr1 = MatrixInput(0);
                    System.out.println("Введите 2 матрицу");
                    double[][] arr2 = MatrixInput(3);
                    double[][] arr = MatrixMultiplication(arr1, InverseMatrix(arr2));
                    i = 1;
                } else {
                    System.out.println("Данный пункт не найден, повторите ввод");
                    i = 0;
                }
            } else if (n == 5) {//транспонирование
                double[][] arr1 = MatrixInput( 0);
                double[][] arr = transp(arr1);
                MatrixPrint(arr);
                i = 1;
            } else if (n == 6) {//определитель
                double[][] arr1 = MatrixInput(3);
                double d = det(arr1);
                System.out.println(d);
                i = 1;
            } else if (n == 7) {//обратная матрица
                double[][] arr1 = MatrixInput(3);
                double[][] arr = InverseMatrix(arr1);
                MatrixPrint(arr);
                i=1;
            } else if (n==8) {//возведение матрицы в степень
                System.out.println("Введите матрицу:");
                double[][] arr1=MatrixInput(3);
                System.out.println("Введите степень");
                int k=in.nextInt();
                double[][] arr=MatrixPow(arr1,k);
                MatrixPrint(arr);
                i=1;
            } else if (n == 0) {
                System.exit(0);
            } else {
                System.out.println("Данный пункт не найден, повторите ввод");
                i = 0;
            }
        }
    }
}