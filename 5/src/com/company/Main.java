package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите N (конец последовательности)");
            if (scn.hasNextInt()) {
            int n = scn.nextInt();
                if (n < 100) {
                    int[] arr = new int[n];
                    int i;
                    for (i = 0; i < n; i++)
                        arr[i] = i;

                    for (i = 0; i < n; i++) {
                        int x = arr[i];
                        int x1 = x;
                        int x2 = 0;
                        while (x / 1 != 0) {
                            x2 *= 10;
                            x2 += x % 10;
                            x /= 10;
                        }
                        if ((x1 == x2) == true)
                            System.out.println(x1);
                    }
                }
                else { System.out.println("ERROR! N должно быть меньше 100");
                }
            }
            else { System.out.println("ERROR! N должно быть числом");
            }
        }
    }
}