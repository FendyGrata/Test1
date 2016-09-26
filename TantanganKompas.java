/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tantangankompas;

import java.util.Scanner;

/**
 *
 * @author Phantom
 */
public class TantanganKompas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, i, j, k, ulang = 0;
        do {
            do {
                System.out.print("input x:");
                x = input.nextInt();
                if ((x % 2 == 1) && (x >= 0)) {
                    ulang = 1;
                } else {
                    System.out.println("\nPlease input odd number");
                }
            } while (ulang == 0);

//            for (i = 1; i < (x + 1) / 2; i++) {
//                for (j = i; j < (x + 1) / 2; j++) {
//                    System.out.print(" ");
//                }
//                for (k = 1; k <= 2 * i - 1; k++) {
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }
            x = x + 2;
            for (i = (x - 1) / 2; i > 1; i--) {
                for (k = (x + 2) / 2; k >= i; k--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (i = 1; i < (x + 1) / 2; i++) {
                for (k = (x + 1) / 2; k >= i; k--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            do {
                System.out.print(" ulang? (1=yes,2=no):");
                ulang = input.nextInt();
                if (ulang == 1) {
                    ulang = 1;
                } else if (ulang == 2) {
                    ulang = 2;
                } else {
                    System.out.println("Please input 1 or 2!!!");
                    ulang = 3;
                }
                
            } while (ulang == 3);

        } while (ulang == 1);
    }

}
