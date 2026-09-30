import java.util.Scanner;

public class Tugas2PemilihanIf12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSkS;
        
        System.out.print("Masukkan jumlah SKS: ");
        jumlahSkS = sc.nextInt();

        if (jumlahSkS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
        sc.close();
    }   
}