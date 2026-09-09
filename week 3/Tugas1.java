import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

    int lamaCicilan;
    double harga, uangMuka, sisaHarga, totalBunga, bunga = 0.02, cicilanPokok, cicilanPerBulan;

    System.out.print("Masukkan harga laptop: ");
    harga = sc.nextDouble();
    System.out.print("Masukkan uang muka: ");
    uangMuka = sc.nextDouble();
    System.out.print("Masukkan lama cicilan (bulan): ");
    lamaCicilan = sc.nextInt();

    sisaHarga = harga - uangMuka;
    cicilanPokok = (sisaHarga / lamaCicilan);
    totalBunga = sisaHarga * bunga; 
    cicilanPerBulan = cicilanPokok + totalBunga;

    System.out.print("Jumlah cicilan yang harus dibayar Rina per bulan adalah Rp. " + cicilanPerBulan);

    sc.close();

    }
}