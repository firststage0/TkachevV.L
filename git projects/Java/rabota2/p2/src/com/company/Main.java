package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 8, 5, 4, 13};
        int ind = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] == 0){
                ind = i;
                for(int b = a.length - 1; b > ind; b--){
                    for(int j = ind; j < b; j++){
                        if( a[j] > a[j+1]){
                            int vrp = a[j];
                            a[j] = a[j+1];
                            a[j+1] = vrp;
                        }
                    }
                }
            }
        }
        System.out.println("Index = " + ind);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
/*
Дан одномерный массив a(n), в котором находится единственный нулевой элемент
Найти где он находится, и упорядочить по возрастанию элементы, расположенные за ним.
Выдать на экран номер элемента и упорядоченный массив
*/



