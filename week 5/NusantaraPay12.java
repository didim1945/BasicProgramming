import java.util.Scanner;

public class NusantaraPay12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String status;
        int limit = 10000;

        System.out.println("\n=== Nusantara Pay: Sistem Keamanan Transaksi ===");
        System.out.print("\nStatus Akun (Normal/Suspicius/Black-listed): ");
        String statusAkun = sc.nextLine();
        System.out.print("Masukkan nominal transaksi: ");
        double nominal = sc.nextDouble();
        System.out.print("Masukkan sisa saldo: ");
        double sisaSaldo = sc.nextDouble();
        System.out.print("Apakah transaksi di luar negeri? (True/False): ");
        boolean isBedaNegara = sc.nextBoolean();
        System.out.print("Masukkan jam transaksi: ");
        double jam = sc.nextDouble();

        if (statusAkun.equalsIgnoreCase("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > sisaSaldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > limit) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara == true && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if (jam >= 0 && jam <= 4 && nominal > 1000) {
            status = "REQUIRED_OTP_NIGHT";
        } else if (statusAkun.equalsIgnoreCase("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }
        System.out.print("\nStatus Akun: " + status);
        System.out.println();
        sc.close();
    } 
}