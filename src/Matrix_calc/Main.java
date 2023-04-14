package Matrix_calc;

import java.util.Scanner;

import static Matrix_calc.Input_output.*;
import static Matrix_calc.Operations.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, v = 1;
        double[][] arr1 = new double[0][], arr2 = new double[0][], arr3 = new double[0][];
        double k = 0;
        System.out.println("Введите номер варианта ввода");
        System.out.println("1.Две матрицы");
        System.out.println("2.Матрица и число");
        System.out.println("3.Одна матрица");
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Введите 1 матрицу");
            arr1 = MatrixInput();
            System.out.println("Введите 2 матрицу");
            arr2 = MatrixInput();
        } else if (n == 2) {
            System.out.println("Введите матрицу");
            arr1 = MatrixInput();
            System.out.println("Введите число");
            k = in.nextDouble();
        } else if (n == 3) {
            System.out.println("Введите матрицу");
            arr1 = MatrixInput();
        }
        while (v == 1) {
            i=0;
            while (i == 0) {
                System.out.println("Введите номер операции, которую хотите выполнить");
                System.out.println("1.Сложение");
                System.out.println("2.Вычитание");
                System.out.println("3.Умножение");
                System.out.println("4.Деление");
                System.out.println("5.Транспонирование");
                System.out.println("6.Определитель матрицы");
                System.out.println("7.Обратная матрица");
                System.out.println("8.Возведение матрицы в степень");
                System.out.println("0.Выход");
                n = in.nextInt();
                if (n == 1) {//сложение

                    arr3 = sum(arr1, arr2);
                    if (arr3 == null) i = 0;
                    else {
                        MatrixPrint(arr3);
                        i = 1;
                    }
                } else if (n == 2) {//вычитание
                    arr3 = razn(arr1, arr2);
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
                        arr3 = multiply(k, arr1);
                        MatrixPrint(arr3);
                        i = 1;
                    } else if (n == 2) {
                        arr3 = MatrixMultiplication(arr1, arr2);
                        if (arr3 == null) i = 0;
                        else {
                            MatrixPrint(arr3);
                            i = 1;
                        }
                    } else if (n == 3) {

                        arr3 = MatrixMultiplication(arr1, arr2);
                        if (arr3 == null) i = 0;
                        else {
                            MatrixPrint(arr3);
                            i = 1;
                        }
                    } else if (n == 4) {

                        arr3 = MatrixMultiplication(arr1, arr2);
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
                        double[][] arr = multiply(k, arr1);
                        MatrixPrint(arr);
                        i = 1;
                    } else if (n == 2) {
                        double[][] arr = MatrixMultiplication(arr1, InverseMatrix(arr2));
                        i = 1;
                    } else {
                        System.out.println("Данный пункт не найден, повторите ввод");
                        i = 0;
                    }
                } else if (n == 5) {//транспонирование

                    double[][] arr = transp(arr1);
                    MatrixPrint(arr);
                    i = 1;
                } else if (n == 6) {//определитель
                    double d = det(arr1);
                    System.out.println(d);
                    i = 1;
                } else if (n == 7) {//обратная матрица
                    double[][] arr = InverseMatrix(arr1);
                    MatrixPrint(arr);
                    i = 1;
                } else if (n == 8) {//возведение матрицы в степень
                    double[][] arr = MatrixPow(arr1, k);
                    MatrixPrint(arr);
                    i = 1;
                } else if (n == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Данный пункт не найден, повторите ввод");
                    i = 0;
                }
            }
            System.out.println("Желаете ли провести операции с полученной матрицей?");
            System.out.println("1.Да");
            System.out.println("2.Нет");
            v = in.nextInt();
            if (v==1){
                arr1=arr3.clone();
                System.out.println("С каким элементом желаете провести операцию?");
                System.out.println("1.Матрица");
                System.out.println("2.Число");
                System.out.println("3.Та же самая матрица");
                int a=in.nextInt();
                if (a==1){
                    System.out.println("Введите матрицу");
                    arr2 = MatrixInput();
                } else if (a==2) {
                    System.out.println("Введите число");
                    k = in.nextDouble();
                } else if (a==3) {
                    arr2=arr3.clone();
                }
            }
        }
    }
}