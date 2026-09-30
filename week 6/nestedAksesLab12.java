import java.util.Scanner;

public class nestedAksesLab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen,
        asistenLab;

        System.out.print("\nApakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        
        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("\nApakah punya izin dosen? (true/false): ");
            punyaIzinDosen = sc.nextBoolean();
            System.out.print("Apakah asisten lab? (true/false): ");
            asistenLab = sc.nextBoolean();
            if (punyaIzinDosen || asistenLab) {
                System.out.println("\nAkses laboratorium diberikan\n");
            } else {
                System.out.println("\nAkses ditolak: membutuhkan izin dosen atau status asisten lab\n");;
            }
        } else {
            System.out.println("\nAkses ditolak: status mahasiswa tidak memenuhi syarat\n");;
        }
        sc.close();
    }
}