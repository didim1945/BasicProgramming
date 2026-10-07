import java.util.Scanner;

public class tes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;

        System.out.println("=== CEK DANA PENGHARGAAN MAHASISWA ===");

        // Input data mahasiswa
        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen yang diupload (0-4) : ");
        jumlahDokumen = sc.nextInt();

        // Cek jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            // Kegiatan perlombaan
            System.out.print("Peringkat juara (1, 2, 3, atau 0 jika bukan juara) : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : Dokumen tidak lengkap (kurang "
                        + kurang + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : Dokumen lengkap.");
                System.out.println("Dana penghargaan diberikan.");
            } else {

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : Bukan juara 1, 2, atau 3.");
                System.out.println("Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            // Kegiatan PKM
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : Dokumen tidak lengkap (kurang "
                        + kurang + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else if (statusPKM == 1) {

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : Dokumen lengkap dan PKM lolos pendanaan.");
                System.out.println("Dana penghargaan diberikan.");
            } else {

                System.out.println("\n=== HASIL PEMERIKSAAN ===");
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Status         : PKM tidak lolos pendanaan.");
                System.out.println("Dana penghargaan tidak diberikan.");
            }

        } else {

            // Kegiatan lainnya
            System.out.println("\n=== HASIL PEMERIKSAAN ===");
            System.out.println("Nama mahasiswa : " + namaMahasiswa);
            System.out.println("Status         : Kegiatan di luar ketentuan.");
            System.out.println("Dana penghargaan tidak diberikan.");
        }

        sc.close();
    }
}