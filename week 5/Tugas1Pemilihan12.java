import java.util.Scanner;

public class Tugas1Pemilihan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("=== Cetak KRS SIAKAD ===");
        System.out.print("Apakah UKT sudah lunas (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifiksi" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        sc.close();
    }
}