package com.sdacademy.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum =0;
        while (number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("\n"+"Sum:" + sum);
         int c = 8;
         char d = 'a';
         boolean var = d!=c;
        System.out.println(var);

        char x = 'f';
        int y =(int)x;
        System.out.println(y); */

        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        switch (key){
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            case 3:
                System.out.println("#");
                break;
            case 4:
                System.out.println("$");
                break;
            case 5:
                System.out.println("%");
                break;
        }

    }
}
