package Matrix_calc;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static Matrix_calc.Operations.*;
class OperationsTest {

    @org.junit.jupiter.api.Test
    void sumTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double[][] arr2={{67,57,2},
                         {24,14,59},
                         {97,26,4}};
        double[][] arr={{124,150,15},
                        {96,96,102},
                        {163,83,32}};
        assertArrayEquals(arr,sum(arr1,arr2));
    }

    @org.junit.jupiter.api.Test
    void raznTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double[][] arr2={{67,57,2},
                         {24,14,59},
                         {97,26,4}};
        double[][] arr={{-10,36,11},
                        {48,68,-16},
                        {-31,31,24}};
        assertArrayEquals(arr,razn(arr1,arr2));
    }

    @org.junit.jupiter.api.Test
    void matrixMultiplicationTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double[][] arr2={{67,57,2},
                         {24,14,59},
                         {97,26,4}};
        double[][] arr={{7312,4889,5653},
                        {10963,6370,5154},
                        {8506,5288,3607}};
        assertArrayEquals(arr,MatrixMultiplication(arr1,arr2));
    }

    @org.junit.jupiter.api.Test
    void multiplyTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double k=85;
        double[][] arr={{4845,7905,1105},
                        {6120,6970,3655},
                        {5610,4845,2380}};
        assertArrayEquals(arr,multiply(k,arr1));
    }

    @org.junit.jupiter.api.Test
    void transpTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double[][] arr={{57,72,66},
                        {93,82,57},
                        {13,43,28}};
        assertArrayEquals(arr,transp(arr1));
    }

    @org.junit.jupiter.api.Test
    void detTest() {
        double[][] arr1={{57,93,13},
                         {72,82,43},
                         {66,57,28}};
        double a=50607;
        assertEquals(a,det(arr1));
    }

    @org.junit.jupiter.api.Test
    void inverseMatrixTest() {
        double[][] arr1={{1,-2,0},
                         {3,4,2},
                         {-1,3,1}};
        double[][] arr={{-0.25,0.25,-0.5},
                        {-0.625,0.125,-0.25},
                        {1.625,-0.125,1.25}};
        assertArrayEquals(arr,InverseMatrix(arr1));
    }

    @org.junit.jupiter.api.Test
    void matrixPowTest() {
        double[][] arr1={{1,-2,0},
                         {3,4,2},
                         {-1,3,1}};
        double k=4;
        double[][] arr={{-133,-178,-108},
                        {213,296,178},
                        {235,321,191}};
        assertArrayEquals(arr,MatrixPow(arr1,k));
    }
}