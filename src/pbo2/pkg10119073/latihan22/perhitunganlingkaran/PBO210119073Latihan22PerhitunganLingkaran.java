package pbo2.pkg10119073.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * lingkaran
 *
 */

public class PBO210119073Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkam nilai diameter lingkaran : ");
        Scanner nilaiD = new Scanner(System.in);
        int Diameter;
        
        while(!nilaiD.hasNextInt()){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukkan nilai lingkaran : ");
            nilaiD.next();
        }
        
        Diameter = nilaiD.nextInt();
        int r = Diameter / 2;
        double phi = 3.14159;
        double luas = phi * r * r;
        double keliling = 2 * phi * r;
        
        System.out.println("");
        System.out.println("====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "  +r+ " cm");
        System.out.println("Luas Lingkaran      = " +String.format("%.2f", luas)+ " cm");
        System.out.println("Keliling Lingkaran  = " +String.format("%.2f", keliling)+ " cm"); 
    }
    
}