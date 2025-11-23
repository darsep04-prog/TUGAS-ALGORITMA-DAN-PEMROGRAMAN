import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        String golongan;
        int jamLembur;
        double gajiPokok = 0, gajiLembur, totalGaji;

        while (true) {
            System.out.println("Masukkan Gologan Karyawan (A/B/C) : ");
            golongan = input.next();
            if (golongan.equalsIgnoreCase("A")) {
                gajiPokok = 5000000;
                break;
            } else if (golongan.equalsIgnoreCase("B")) {
                gajiPokok = 6500000;
                break;
            } else if (golongan.equalsIgnoreCase("C")) {
                gajiPokok = 9500000;
                break;
            } else {
            System.out.println("Anda Memasukan Golongan Gaji Yang Tidak Valid!");
            }
        }
           System.out.print("Masukkan Jam Lembur : ");
            jamLembur = input.nextInt();
            if (jamLembur == 1) {
                gajiLembur = 0.30 * gajiPokok;
            }else if (jamLembur == 2) {
                gajiLembur = 0.32 * gajiPokok;
            }else if (jamLembur == 3) {
                gajiLembur = 0.34 * gajiPokok;
            }else if (jamLembur == 4) {
                gajiLembur = 0.36 * gajiPokok;
            }else if (jamLembur >= 5) {
                gajiLembur = 0.38 * gajiPokok;
            }else {
                gajiLembur = 0;

            }   totalGaji = gajiPokok + gajiLembur;
            System.out.println("----------------------------------");
        System.out.println("Golongan: " + golongan.toUpperCase());
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Gaji Lembur: Rp " + gajiLembur);
        System.out.println("Total Penghasilan: Rp " + totalGaji);
        System.out.println("===========Terima Kasih============");
            
    } 
}