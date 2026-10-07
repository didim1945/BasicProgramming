import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        String status = " ";
        int jumlDokumen;
        int juara;

        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen (0-4) : ");
        jumlDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlDokumen < 4) {
                int kurang = 4 - jumlDokumen;
                status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan";
            } else {
                System.out.print("Peringkat juara (1, 2, 3 atau 0 jika bukan juara) : ");
                juara = sc.nextInt();
                if (juara >= 1 && juara <= 3) {
                    status = "Dana penghargaan diberikan";
                } else {
                    status = "Dana penghargaan tidak diberikan";
                }
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
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

        }

        System.out.println(status);
    }
}
