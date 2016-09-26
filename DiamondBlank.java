package diamondblank;

import java.util.Scanner;

/**
 *
 * @author 16IS
 */
public class DiamondBlank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, ulang = 0, i, j, k, l;
        do {
            System.out.print("input x:");
            x = input.nextInt();
            if ((x % 2 == 1) && (x >= 0)) {
                ulang = 1;
            } else {
                System.out.println("\nPlease input odd number");
            }
        } while (ulang == 0);
//       
//       
        for (i = 0; i < (x + 1) / 2; i++) {
            for (k = (x + 6) / 2; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = (x - 1) / 2; i >= 1; i--) {
            for (k = (x + 7) / 2; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 3; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
