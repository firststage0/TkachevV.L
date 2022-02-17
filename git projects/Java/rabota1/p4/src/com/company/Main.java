package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String login = "admen";
        String password = "odmen";
        String l, p;
        System.out.println("Введите логин и пароль");
        System.out.print("логин: "); l = str.nextLine();
        System.out.print("пароль: "); p = str.nextLine();
        if(l.equals(login) && p.equals(password)){System.out.println("Вас узнали. Добро пожаловать!");}
        else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }
    }
}
