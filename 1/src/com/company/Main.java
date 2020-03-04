package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите целое число");
            Scanner scn = new Scanner(System.in);
            if (scn.hasNextInt()) {
                int n = scn.nextInt();
                int i;
                boolean q = false;
                for (i = 2; i < n; i++) {
                    if (n % i == 0) {
                        q = true;
                        break;
                    }
                }
                if (q) {
                    System.out.println("Число является составным ");
                } else {
                    System.out.println("Число является простым ");
                }
                if (n % 2 == 0) {
                    System.out.println("Число является чётным");
                }
                else System.out.println("Число является не чётным");
            }
            else System.out.println("ERROR. Вы ввели число которое не является целым");
        }
    }
}
