import java.util.Scanner;

public class AsistenPraktikum12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("\nApakah status mahasiswa aktif? (true/false): ");
        boolean status = sc.nextBoolean();
        System.out.print("Apakah memiliki ada sanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();
        System.out.println();

        if (status == true && ! sanksi) {
            System.out.print("Masukkan nilai daspro: ");
            int nilaiDaspro = sc.nextInt();
            System.out.print("Apakah mahasiswa memiliki sertifikasi kompetensi pemrograman? ");
            boolean sertifKompetensi = sc.nextBoolean();
            if (nilaiDaspro >= 80 || sertifKompetensi == true) {
                System.out.print("Masukkan niai wawancara: ");
                int wawancara = sc.nextInt();
                if (wawancara >= 75) {
                    System.out.println("\n=== MAHASISWA DITERIMA ===\n");
                } else {
                    System.out.println("\n === GAGAL! Status: nilai wawancara kurang dari 75 ===\n");
                }
            } else {
                System.out.println("\n === GAGAL! Status: nilai daspro kurang dari 80 atau tidak memiliki sertifikasi kompetensi pemrograman ===\n");
            }
        } else {
            System.out.println("\n=== GAGAL! Status: mahasiswa tidak aktif atau memiliki sanksi akademik ===\n");
        }
        sc.close(); 
    }
}
