public class TriangleX(maikel) {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int arry[][] = new int[x][x];
        int i, j, k = 0;
        for (i = 0; i < x; i++) {
            for (j = 0; j <= i; j++) {
                arry[i][j] = k;
                k++;
                System.out.printf("%02d ", arry[i][j]);
            }
            System.out.println("");
        }

    }
}