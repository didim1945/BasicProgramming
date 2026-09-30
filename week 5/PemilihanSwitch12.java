import java.util.Scanner;

public class PemilihanSwitch12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cetak KRS SIAKAD ===");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS emester 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 ditapilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 ditapilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditapilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditapilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 ditapilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 ditapilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 ditapilkan");
                break;
            default:
                System.out.println("Semester tidak valid");
        }
        sc.close();
    }
}