package com.tech.recursion;

public class PrintNumber1TON {

    public static void main(String[] args) {
        printNumber1TON(5);
    }

    public static void printNumber1TON(int num){

        if (num == 0){
            return;
        }

        printNumber1TON(num -1);

        System.out.println(num);

    }
}
