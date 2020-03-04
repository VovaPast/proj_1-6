package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner scn = new Scanner(System.in);
            System.out.println("Ведите предложение ");
            String str = scn.nextLine();
            int count = 0;
            if(str.length() != 0 ){
                count++;
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == ' '){
                        count++;
                    }
                }
            }
            System.out.println("Кол-во слов в предложении : "+count);

            String s2 = "";
            s2 = s2 + str.substring(0, 1).toUpperCase(); //первый символ
            for (int i = 1; i < str.length(); i++) {    // слево пробел
                if (" ".equals(str.substring(i-1, i)))
                    s2 = s2 + str.substring(i, i+1).toUpperCase();
                else
                    s2 = s2 + str.substring(i, i+1);
            }

            List<String> arr = Arrays.asList(s2.split(" "));//разбивает строку на массив строк + Arrays.asList создает список из массива
            Collections.sort(arr, new Comparator<String>()   //new Comparator() создает безымянный класс, в котором реализуется метод сравнения
            { public int compare(String o1, String o2)
                { return o1.compareToIgnoreCase(o2); } } );
            System.out.println("Сортировка по алфавиту (в задании небыло указанно как сортировать) : "+arr);
        }
    }
}
