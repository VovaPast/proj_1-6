package com.company;
import java.util.Scanner;
public class Main {
    public static void search() {
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ведите предложение ");
            String str = scn.nextLine();
            System.out.println("Ведите слово для подсчёта ");
            String slovo = scn.nextLine();

            String[] s = str.split(" ");
            int a = 0;
            for (int i = 0; i < s.length; i++) {
                if (slovo.equals(s[i])) {
                    a++;
                }
            }
            System.out.println("Кол-во слов в предложении : "+a);
        }
    }

    public static void main(String args[]){
        search();
    }
}