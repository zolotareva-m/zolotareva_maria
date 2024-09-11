package ru.vsu.cs.zoloareva.first;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);

        int mid = a + b + c - (min + max);

        System.out.println(mid);
    }
}