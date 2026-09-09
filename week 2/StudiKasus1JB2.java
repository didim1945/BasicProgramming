import java.util.Scanner;

public class StudiKasus1JB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganAnak, jumlahAnak;
        double danaPensiun = 0.10;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan tunjangan anak: ");
        tunjanganAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak:");
        jumlahAnak = sc.nextInt();

        double totalGaji = (gajiPokok - (gajiPokok * danaPensiun)) + (tunjanganAnak * jumlahAnak);

        System.out.print("Gaji bersih Pak Danur perbulannya adalah " + totalGaji);
    }
}
