package SourcePackage.Latihan;
import java.util.Scanner;

public class Latihan2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("=== PROGRAM PERSENTASE PENGELUARAN ===");
    
    //S1 INPUT
    System.out.print("Masukkan biaya Makan  :  ");
    double makan = input.nextDouble();
    System.out.print("Masukkan biaya Transport  :  ");
    double transport = input.nextDouble();
    System.out.print("Masukkan biaya Belanja  :  ");
    double belanja = input.nextDouble();

    //P1 PROSES 
    // Hitung total semua pengeluaran
    double total = makan + transport + belanja;

    // Hitung persentase masing masing
    double p_makan = (makan / total) * 100;
    double p_transport = (transport / total) * 100;
    double p_belanja = (belanja / total) * 100;

    // S2: OUTPUT
    System.out.println("\n=== HASIL PERSENTASE ===");
    System.out.println("Total Pengeluaran : Rp " + total);
    System.out.println("Persentase Makan : " + p_makan + "%");
    System.out.println("Persentase Transport : " + p_transport + "%");
    System.out.println("Persentase belanja : " + p_belanja + "%");

    input.close();
  }
}
