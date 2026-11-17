import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs [] = new int [10];
        int total = 0;
        double rata;
        String predikat = " ";

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata = total / (double) nilaiMhs.length;
        System.out.println("Total nilai : " + total);
        System.out.println("Rata-rata   : " + rata);
        if (rata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        
        int tertinggi = nilaiMhs [0];
        int terendah = nilaiMhs [0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs [i] > tertinggi) {
                tertinggi = nilaiMhs [i];
            }
            if (nilaiMhs [i] < terendah) {
                terendah = nilaiMhs [i];
            }
        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Predikat kelas  : " + predikat);
        sc.close();
    }
}
