/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedure.function;

import java.util.Scanner;

/**
 *
 * @author Phantom
 */
public class ProcedureFunction {

    public static int calc(int a, int b) {
        return a * b;
    }

    public static void Tri1() {
        Scanner inputx = new Scanner(System.in);
        int i, j, x, y, ulang = 0;
        do {
            System.out.println("\"Triangle A\"");
            System.out.print("input X:");
            x = inputx.nextInt();
            for (i = 1; i <= x; i++) {

                for (j = 1; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            do {
                System.out.println("ulangi?(1=yes,2=no):");
                y = inputx.nextInt();
                if (y == 1) {
                    ulang = 1;
                } else if (y == 2) {
                    ulang = 2;
                } else {
                    System.out.println("please input 1 or 2!!");
                    ulang = 0;

                }

            } while (ulang == 0);
        } while (ulang == 1);
    }

    public static void Tri2() {
        Scanner inputx = new Scanner(System.in);
        int i, j, x, y, ulang = 0;
        do {
            System.out.println("\"Triangle B\"");
            System.out.print("input X:");
            x = inputx.nextInt();
            for (i = x; i > 0; i--) {

                for (j = i; j > 1; j--) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            do {
                System.out.println("ulangi?(1=yes,2=no):");
                y = inputx.nextInt();
                if (y == 1) {
                    ulang = 1;
                } else if (y == 2) {
                    ulang = 2;
                } else {
                    System.out.println("please input 1 or 2!!");
                    ulang = 0;
                }

            } while (ulang == 0);
        } while (ulang == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tryAgain = 0, x, y;
        do {
            do {
                System.out.println("Menu:\n1.triangle A\n2.Triangle B\n3.Exit");

                System.out.print("Input menu:");
                x = input.nextInt();

                if (x == 1) {
                    Tri1();

                } else if (x == 2) {
                    Tri2();

                } else if (x == 3) {
                    tryAgain = 2;

                } else {
                    System.out.println("Please input 1,2 or 3!!");
                }
            } while (x != 1 && x != 2 && x != 3);
            if(tryAgain==2){
                    
                }
            else do {
                
                System.out.println("Back to menu?(1=yes 2=no):");
                y = input.nextInt();
                if (y == 1) {
                    tryAgain = 0;
                } else if (y == 2) {
                    tryAgain = 0;
                } else {
                    System.out.println("Please input 1 or 2!!");
                }
            } while (y != 1 && y != 2);
        } while (tryAgain == 0);
    }

}
