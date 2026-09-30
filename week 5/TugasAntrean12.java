import java.util.Scanner;

public class TugasAntrean12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Akademik Kampus ===");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Masukkan kode layanan: ");
        int kode = sc.nextInt();

        System.out.println();
        switch (kode) {
            case 1:
                System.out.println("Legalisir Ijazah: Loket A");
                break;
            case 2: 
                System.out.println("Surat Keterangan Aktif Kuliah: Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT: Loket C");
                break;
            case 4: 
                System.out.println("Pengajuan Cuti Akademik: Loket D");
                break;
            default:
                System.out.println("Layanan tidak tersedia");
                break;
        }
        System.out.println();
        sc.close();
    }
}
