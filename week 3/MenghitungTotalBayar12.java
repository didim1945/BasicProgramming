import  java.util.Scanner;

public class MenghitungTotalBayar12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga: ");
        harga = sc.nextDouble();

        potongan = harga * diskon;
        jml_bayar = harga - potongan;

        System.out.print("Jumlah yang harus Anda bayar adalah Rp." + jml_bayar);

        sc.close();
    }
}