package com.tech.recursion;

public class PrintNumberNTO1 {

    public static void main(String[] args) {
        printNumberNTO1(5);
    }

    public static void printNumberNTO1(int num){

        if (num == 0){
            return;
        }
        System.out.println(num);
        printNumberNTO1(num-1);
    }
}
