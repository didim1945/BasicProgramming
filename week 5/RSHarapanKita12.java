import java.util.Scanner;

public class RSHarapanKita12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String status;

        System.out.println("\n=== UGD RS Harapan Kita: Alokasi Ruang Darurat ===");
        System.out.print("Masukkan SpO2 (%): ");
        double spo2 = sc.nextDouble();
        System.out.print("Masukkan Sisa Bed ICU: ");
        int sisaBedICU = sc.nextInt();
        System.out.print("Masukkan tekanan darah sistolik: ");
        int tekananDarah = sc.nextInt();
        System.out.print("Apakah kondisi pasien tidak sadar? (true/false): ");
        boolean pasien = sc.nextBoolean();
        System.out.print("Masukkan suhu: ");
        int suhu = sc.nextInt();
        System.out.print("Apakah memiliki koromoid? (true/false): ");
        boolean koromoid = sc.nextBoolean();
        System.out.print("Masukkan usia pasien: ");
        int usia = sc.nextInt();
        System.out.print("Masukkan laju napas per menit: ");
        int napas = sc.nextInt();

        if (spo2 < 85) {
            if (sisaBedICU > 0) {
                status = "ICU";
            } else {
                status = "UGD_VENTILATOR_MOBIL";      
            }
        } else if ((spo2 >= 85 && spo2 <= 89) || (tekananDarah < 90 || tekananDarah> 180) || (pasien == true )) {
            status = "RESUSITASI_UGD";
        } else if ((spo2 >= 90 && spo2 <= 94 || suhu > 39) && koromoid == true && usia >= 65) {
            status = "HCU_ISOLASI";
        } else if (spo2 >= 90 && spo2 <= 94 || napas > 24) {
            status = "RAWAT_INAP_UMUM";
        } else {
            status = "RAWAT_JALAN";
        }
        System.out.println("\n=== Status Pasien: " + status + " ===");
        sc.close();
    }
}
