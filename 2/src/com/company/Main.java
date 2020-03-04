package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите 2 целых числа");
            Scanner scn = new Scanner(System.in);
            if (scn.hasNextInt()) {
            int a = scn.nextInt();// 1 число
                if (scn.hasNextInt()) {
                    int b = scn.nextInt();// 2 число
                    System.out.println("НОД равен " + gcd(a, b));
                    System.out.println("НОК равен " + lcm(a, b));
                } else System.out.println("ERROR. Второе число не является целым"); }
            else System.out.println("ERROR. Первое число не является целым"); }
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}