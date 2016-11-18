package internet_examples.formatting;


public class AppFormat {
    public static void main(String[] args) {
        int[][] multyplyTab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multyplyTab[i][j] = (i + 1) * (j + 1);
                //System.out.print(multyplyTab[i][j] + "\t");
                System.out.printf("%4d", multyplyTab[i][j]);
            }
            System.out.println();
        }
    }
}
