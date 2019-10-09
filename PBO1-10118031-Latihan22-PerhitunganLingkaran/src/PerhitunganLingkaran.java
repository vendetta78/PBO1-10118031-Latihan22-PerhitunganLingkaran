
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung Lingkaran
 */
public class PerhitunganLingkaran {

    public static void main(String[] args) {
        System.out.println("=======Perhitungan Lingkaran===========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        while (!scanner.hasNextDouble()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            scanner.next();
        }
        diameter = scanner.nextDouble();
        System.out.println("=======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + (diameter / 2) + " cm");
        System.out.println("Luas Lingkaran = " + (3.14 * (diameter / 2) * (diameter / 2)) + " cm");
        System.out.println("Keliling Lingkaran = " + (3.14 * diameter) + " cm");
    }

}
