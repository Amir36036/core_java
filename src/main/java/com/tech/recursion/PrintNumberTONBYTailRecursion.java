package com.tech.recursion;

public class PrintNumberTONBYTailRecursion {

    public static void main(String[] args) {
        printNumberTONBYTailRecursion(5, 1);
    }

    public static void printNumberTONBYTailRecursion(int num, int k){

        if (num ==0){
            return;
        }

        System.out.println(k);
        printNumberTONBYTailRecursion(num-1, ++k);
    }


}
