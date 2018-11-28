package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            s[i] = scan.next();
        }
        if (s[3].equals(s[4])) {
            s[0] = s[0].concat(s[1]);
            System.out.println("Строка №4 равна строке №5, тогда складываем строку №1 со строкой №2 :");
            System.out.println(s[0]);
        }
        else {
            s[0] = s[0].concat(s[2]);
            System.out.println("Строка №4 не равна строке №5, тогда складываем строку №1 со строкой №3 :");
            System.out.println(s[0] + "\n");
        }
    }
    }

