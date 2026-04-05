package SourcePackage.Latihan;
import java.util.Scanner;
public class Latihan1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float realisasi, kehadiran, tugas, uts, uas, total;
    float b_kehadiran, b_tugas, b_uts, b_uas;

    //S1 Statment Perintah
    System.out.print("Masukan realisasi: ");
    realisasi = input.nextFloat();
    System.out.print("Masukan kehadiran: ");
    kehadiran = input.nextFloat();
    System.out.print("Masukan tugas: ");
    tugas = input.nextFloat();
    System.out.print("Masukan uts: ");
    uts = input.nextFloat();
    System.out.print("Masukan uas: ");
    uas = input.nextFloat();

    //P1 Proses 1
    b_kehadiran = (kehadiran / realisasi) * 10;
    b_tugas = (tugas * 20) / 100;
    b_uts = (uts * 30) / 100;
    b_uas = (uas * 40) / 100;

    //menjumlahkan semua bobot
    total = b_kehadiran + b_tugas + b_uts + b_uas;

    //S2 Statement Informasi
    System.out.println("\n=== DATA INFORMASI NILAI ===");
    System.out.println("Realiasi : " + realisasi);
    System.out.println("Kehadiran : " + kehadiran);
    System.out.println("Tugas : " + tugas);
    System.out.println("UTS : " + uts);
    System.out.println("UAS : " + uas);
    System.out.println("-----------------------------");
    System.out.println("Total Nilai Akhir: " + total);
    
    input.close();
  }
}