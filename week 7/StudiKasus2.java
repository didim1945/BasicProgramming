import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        String status = " ";
        int jumlDokumen = 0;
        int juara = 0;

        System.out.println("\n=== CEK DANA PENGHARGAAN MAHASISWA ===");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen (0-4) : ");
            jumlDokumen = sc.nextInt();
            if (jumlDokumen < 4) {
                int kurang = 4 - jumlDokumen;
                status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan";
            } else {
                System.out.print("Peringkat juara (1, 2, 3 atau 0 jika bukan juara) : ");
                juara = sc.nextInt();
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Peringkat juara : " + juara);
                    status = "Dana penghargaan diberikan";
                } else {
                    status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan";
                }
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen (0-4) : ");
            jumlDokumen = sc.nextInt();
            if (jumlDokumen < 4) {
                int kurang = 4 - jumlDokumen;
                status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan";
            } else {
                System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos) : ");
                int pendanaan =  sc.nextInt();
                if (pendanaan == 1) {
                    status = "Dana penghargaan diberikan";
                } else {
                    status = "Dana penghargaan tidak diberikan";
                }
            }
        } else {
            status = "Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan";
        }
        System.out.println("\n=== HASIL PEMERIKSAAN ===");
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Jenis kegiatan \t : " + jenisKegiatan.toUpperCase());
        System.out.println("Jumlah dokumen\t : " + jumlDokumen);
        System.out.println("Juara\t\t : " + juara);
        System.out.println("Status\t\t : " + status);
        System.out.println();
        sc.close();
    }
}
