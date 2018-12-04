/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.pkg2;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AGUSTINA
 */
public class Responsi2 {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        menu_awal();
    }

    //global variable
    static Scanner sc = new Scanner(System.in);
    static String[] kereta = {"Gajayana", "Argo Wilis","Prameks"};
    static String[]  keberangkatan = {"10.00 - 12.30", "12.45 - 14.55", "15.00 - 17.30", "17.30 - 19.45", "20.00 - 22.30"};
    static int harga = 35000;
    static char ulang;

    public static void menu_awal() {
        int pilih_menu;
        ulang = 'S';
        do {
            System.out.println("========== Bioskop XXI ==========");
            System.out.println("1.\tkereta");
            System.out.println("2.\tKeberangkatan");
            System.out.println("3.\tTransaksi");
            System.out.println("=================================");
            System.out.print("Pilih : ");

            pilih_menu = sc.nextInt();

            System.out.println("");
            switch (pilih_menu) {
                case 1:
                    kereta();
                    break;
                case 2:
                    keberangkatan();
                    break;
                case 3:
                    transaksi();
                    break;

                default:
                    System.out.println("Inputan salah!");
            }
        } while (ulang == 'Y' || ulang == 'y');
    }

    public static void kereta() {
        System.out.println("No | kereta");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "\t| " + kereta[x]);
        }
        System.out.print("ingin kembali ke menu awal ?(Y/T) ");
        ulang = sc.next().charAt(0);
    }

    public static void keberangkatan() {
        System.out.println("No. | Jadwal");
        for (int x = 0; x < keberangkatan.length; x++) {
            System.out.println((x + 1) + "   | " + keberangkatan[x]);
        }
        System.out.print("ingin kembali ke menu awal ?(Y/T) ");
        ulang = sc.next().charAt(0);
    }

    public static void transaksi() {
        System.out.println("========== Transaksi ==========");
        System.out.println("No, | Judul Film");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "   | " + kereta[x]);
        }
        System.out.println("===============================");
        System.out.print("Pilih : ");
        int pilih_kereta = sc.nextInt();

        System.out.println("");
        System.out.println("No. | Jadwal");
        for (int x = 0; x < keberangkatan.length; x++) {
            System.out.println((x + 1) + "   | " + keberangkatan[x]);
        }
        System.out.print("Pilih : ");
        int pilih_keberangkatan = sc.nextInt();
        int kapasitas = 0;
        System.out.println("Pilih Gerbong (1-3) : ");
        int Gerbong = sc.nextInt();
        switch (Gerbong) {
            case 1:
                kapasitas = 30;
                break;
            case 2:
                kapasitas = 35;
                break;
            case 3:
                kapasitas = 40;
                break;
        }
        System.out.println("");
        int kursi;

        do {
            System.out.println("Jumlah Kursi : ");
            System.out.println("");
            kursi = sc.nextInt();
            if (kursi > kapasitas) {
                System.out.println("jumlah kursi yang dipesen melebihi kapasitas yang tersedia."
                        + "Ulangi memasukkan jumlah kursi.");
            }
        } while (kursi > kapasitas);

        int total = kursi * harga;
        System.out.println("===============================");
        System.out.println(" Judul Film\t: " + kereta[(pilih_kereta - 1)]);
        System.out.println(" Studio\t\t: " + Gerbong);
        System.out.println(" Jadwal Film\t: " + keberangkatan[(pilih_keberangkatan - 1)]);
        System.out.println(" Kursi\t\t: " + kursi);
        System.out.println(" Total Bayar\t: " + total);
        System.out.println("===============================");
        System.out.print(" Bayar\t: ");
        int bayar = sc.nextInt();
        if (bayar < total) {
            System.out.println("Maaf, Uang anda kurang");
        } else {
            int kembalian = bayar - total;
            System.out.println(" Kembalian\t: " + kembalian);
        }
        System.out.println("");

    }
}
