public class StudiKasus1Jobsheet2 {
    public static void main(String[] args) {

        int gajiPokok = 5000000;
        int tunjanganAnak = 100000;
        int jumlahAnak = 4;
        double danaPensiun = 0.10;
        
        double totalGaji = (gajiPokok - (gajiPokok * danaPensiun)) + (tunjanganAnak * jumlahAnak);

        System.out.println("Gaji bersih Pak Danur perbulannya adalah " + totalGaji);
        

    }
}
