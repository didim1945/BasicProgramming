public class kacuk {
    public static void main(String[] args) {
        
        int[][] a = {{3, 7, 2}, {9, 1, 5}};
        int total = 0;
        
        for (int i = 0; i < a.length; i++) {
            int totalBaris = 0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
                totalBaris += a[i][j];
                total += a[i][j];
            }
            System.out.print(totalBaris);
            System.out.println();
        }
        
        for (int j = 0; j < a[0].length; j++) {
            int totalKolom = 0;
            for (int i = 0; i < a.length; i++) {
                //System.out.print(" " + a[i][j] + " ");
                totalKolom += a[i][j];
            }
            System.out.print(" " + totalKolom);
        }

        
        System.out.println(" " + total);
        
    }
}
