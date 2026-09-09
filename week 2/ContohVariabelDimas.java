public class ContohVariabelDimas {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "bermain game";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 19;
        double ipk = 3.24, tinggi = 173;
        System.out.println("Salah satu hobi Saya adalah" + "\t" + salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai?" + "\t" + isPandai);
        System.out.println("Jenis kelamin:" + "\t" + jenisKelamin);
        System.out.println("Umurku saat ini:" + "\t" + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}