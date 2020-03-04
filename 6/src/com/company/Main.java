package com.company;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args){
        final item item1= new item(6,30);
        final item item2= new item(3,15);
        final item item3= new item(4,20);
        final item item4= new item(5,25);
        final item[] items = {item1, item2, item3, item4};

        Arrays.sort(items, Comparator.comparingDouble(item::valueePerUnitOfWeight).reversed());

    System.out.println(Arrays.toString(items));
    final int MaxW = 9;
        System.out.println("Максимальный вес рюкзака:" + MaxW);

    int weightSoFar = 0;
    double valueSOfar = 0;
    int currentItem = 0;
    while (currentItem < items.length && weightSoFar != MaxW ){
        if(weightSoFar + items[currentItem].getWeight() < MaxW) {

            valueSOfar += items[currentItem].getValue();
            weightSoFar += items[currentItem].getWeight();
                    }
        else
            { valueSOfar += ((MaxW - weightSoFar)/(double) items[currentItem].getWeight()) *items[currentItem].getValue();
        weightSoFar =MaxW;  }

           currentItem++;
        }
     System.out.println("Ценность выгодного комплекта: " + valueSOfar);
    }
}
class item {
    private  int weight;
    private  int value;

    public item(int weight,int value){
        this.weight = weight;
        this.value = value;
    }
    public  double valueePerUnitOfWeight(){
        return value/(double)weight;
    }
    public int getWeight(){
        return weight;
    }
    public int getValue(){
        return value;
    }
    public String toString(){
        return "{ вес: "+ weight + ", цена: " + value + " }";
    }
}
