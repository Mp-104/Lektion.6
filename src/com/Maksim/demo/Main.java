package com.Maksim.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int[] numbers = {0,10,100,1000,};
        int test;

        Scanner scanner = new Scanner(System.in);
        System.out.println("crash program");

        scanner.nextLine();*/

        /*for (int i = 0; i < numbers.length + 1; i++) {  //Index 4 out of bounds for length 4
            System.out.println(numbers[i]);

        }*/

        System.out.println("before crash");

        try {
            // try to execute code
            System.out.println("Inside - TRY ");
            System.out.println(2/0);

        } catch (Exception error) {
            // catch error if it FAILS
            System.out.println("Inside - CATCH ");
            error.printStackTrace();
        }


        System.out.println("after crash");

        }



    }


