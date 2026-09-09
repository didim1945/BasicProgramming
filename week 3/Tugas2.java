import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lembar;
        int biayaCetak = 500;
        int biayaPenjilidan = 5000;
        int totalBiaya;

        System.out.print("Masukkan banyak lembar: ");
        lembar = sc.nextInt();

        totalBiaya = (lembar * biayaCetak) + biayaPenjilidan;

        System.out.println("Total biaya yang harus dibayar adalah Rp. " + totalBiaya);

        sc.close();
    }
}