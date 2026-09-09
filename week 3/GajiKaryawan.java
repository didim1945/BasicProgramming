import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;
        
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;

        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan Anda adalah Rp.  " + bonus);
        System.out.print("Gaji yang diterima adalah Rp. " + totGaji);

        sc.close();
    }
}