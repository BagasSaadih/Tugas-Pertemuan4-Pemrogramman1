package SourcePackage.Latihan;
import java.util.Scanner;

public class Latihan3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== PROGRAM HITUNG DISKON MAHASISWA ===");

    // S1: INPUT
    System.out.print("Masukan Pengeluaran Makan  :  ");
    double makan = input.nextDouble();
    System.out.print("Masukan Pengeluaran Transport  :  ");
    double transport = input.nextDouble();
    System.out.print("Masukan Pengeluaran Belanja  :  ");
    double belanja = input.nextDouble();

    // P1: PROSES
    // 1. Total sebelum diskon 
    double totalSebelum = makan + transport + belanja;
    // 2. Besar diskon (10% dari total)
    double diskon = totalSebelum * 10 / 100;
    // 3. Total setelah diskon dipotong
    double totalSetelah = totalSebelum - diskon;

    // S2 : OUTPUT MENJAWAB 3 PERTANYAAN
    System.out.println("\n=== RINCIAN PEMBAYARAN ===");
    System.out.println("1. Total pengeluaran sebelum diskon : Rp " + totalSebelum);
    System.out.println("2. Besar diskon yang didapatkan : Rp " + diskon);
    System.out.println("3. Total pembayaran setelah diskon : Rp " + totalSetelah);

    input.close();
  }
}
