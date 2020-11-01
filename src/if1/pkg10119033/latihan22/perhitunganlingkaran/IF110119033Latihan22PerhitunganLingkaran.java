/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung jari-jari, luas dan keliling lingkaran
 */
public class IF110119033Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    
    static String diameter;
    final static double PHI = 3.14;
    static Scanner scanner = new Scanner (System.in);
    
    
    static void inputDiameter() {
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukan nilai diameter lingkaran : ");
        diameter = scanner.next();
        while (!(diameter.matches("[0-9]*"))) {
            System.out.println("Nilai Diameter Tidak Sesuai.");
            System.out.println();
            System.out.print("Masukan nilai diameter lingkaran : ");
            diameter = scanner.next();
        }
        System.out.println();
    }
    
    static double hitungJariJari(String paramDiameter) {
        return Double.parseDouble(paramDiameter) / 2;
    }
    
    static double hitungLuas(String paramDiameter) {
        return PHI * hitungJariJari(paramDiameter) * hitungJariJari(paramDiameter);
    }
    
    static double hitungKeliling(String paramDiameter) {
        return PHI * Double.parseDouble(paramDiameter);
    }
    
    static void tampilHasil() {
        System.out.println("===Hasil Perhitungan Lingkaran===");
        System.out.println("Jari-jari Lingkaran\t= " + hitungJariJari(diameter));
        System.out.printf("Luas Lingkaran\t\t= %.2f%n", hitungLuas(diameter));
        System.out.printf("Keliling Lingkaran\t= %.2f%n", hitungKeliling(diameter));
        System.out.println("(Developed by : Dandi Ahmadin)");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputDiameter();
        tampilHasil();
    }
    
}
