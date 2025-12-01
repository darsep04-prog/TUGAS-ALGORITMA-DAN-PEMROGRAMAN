import java.util.Scanner;

public class Tugas3 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    //Array gaji pokok (index 0=A, 1=B, 2=C)
    int[] gaji = {5000000, 6500000, 9500000};

    //Array persen lembur
    int[] persenLembur = {30, 32, 34, 36, 38};

    //Input golongan
    System.out.print("Masukan Golongan (A/B/C): ");
    String gol = input.nextLine().toUpperCase();

    //Tentukan index golongan
    int indexGolongan = -1;

    if (gol.equals("A")) {
        indexGolongan = 0;
    } else if (gol.equals("B")) {
        indexGolongan = 1;
    } else if (gol.equals("C")) {
        indexGolongan = 2;
    } else {
        System.out.println("Golongan Tidak Valid");
        return;
    }
    // Ambil gaji pokok sesuai golongan
    int gajiPokok = gaji[indexGolongan];

    //Input jam lembur
    System.out.print("Masukan Jumlah Jam Lembur: ");
    int jamLembur = input.nextInt();

    //Tentukan persen lembur berdasarkan jam
    int persen = 0;

    if (jamLembur == 1) {
        persen = persenLembur[0];
    } else if (jamLembur == 2) {
        persen = persenLembur[1];
    } else if (jamLembur == 3) {
        persen = persenLembur[2];
    } else if (jamLembur == 4) {
        persen = persenLembur[3];
    } else if (jamLembur == 5) {
        persen = persenLembur[4];
    } else {
        persen = 0;
    }
    
    //Hitung gaji lembur
    double gajiLembur = (gajiPokok * persen / 100.0);

    //Total gaji
    double totalGaji = gajiPokok + gajiLembur;

    //Output hasil
    System.out.println("====HASIL PERHITUNGAN GAJI====");
    System.out.println("Golongan        : " + gol);
    System.out.println("Gaji Pokok      : Rp." + gajiPokok);
    System.out.println("Jam Lembur      :" + jamLembur);
    System.out.println("Persen Lembur   : " + persen + "%");
    System.out.println("Gaji Lembur     : Rp." + gajiLembur);
    System.out.println("Total Gaji      : Rp" + totalGaji);
    System.out.println("=========TERIMA KASIH=========");
}
}
