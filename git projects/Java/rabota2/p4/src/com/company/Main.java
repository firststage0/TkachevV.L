package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int[][] A = {
                {2, 3, 1, 3, 1, 2},
                {3, 1, -4, 6, 4, 2},
                {6, 3, 5, 2, 8, 1},
                {2, 3, 1, 3, 1, 2},
                {3, 1, 4, 6, 4, -2},
                {6, 3, 5, 2, 8, 1}};
        int s = A[0][1];

       for(int j = 2; j < A.length; j++){
            for(int i = 0; i < j - 1; i++){
                if(A[i][j] > 0){
                    n += 1;
                    s *= A[i][j];
                }
            }
        }
        double result = Math.pow(s, n);
        System.out.println("Результат = " + result);
    }
}

 /*
    Дан двумерный массив А, размеров (n,n)(или квадратная матрица А). Найти среднее геометрическое
    положительных элементов верхней стреугольной матрицы, исключая главную диагональ.
 */