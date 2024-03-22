/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
/**
 *
 * @author Rhisma Syahrul Putra
 */
// Kelas Segitiga
class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    // Konstruktor tanpa parameter
    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    // Konstruktor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Getter dan setter
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }

    // Menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Menghitung keliling segitiga
    public double getKeliling() {
        return alas + sisi + sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        
        int pilihan;
        
        System.out.println("Masukan Angka Untuk Melihat Hasil Dari Segitiga:");
        System.out.println("1. Segitiga 1");
        System.out.println("2. Segitiga 2");
        System.out.println("3. Segitiga 3");
        System.out.println("0. Exit\n");
            
        System.out.println("Masukan Nomor: ");
        pilihan = input.nextInt();
            
        switch (pilihan) {
            case 1:
                System.out.println("Segitiga 1:");
                System.out.println("Alas: " + segitiga1.getAlas());
                System.out.println("Tinggi: " + segitiga1.getTinggi());
                System.out.println("Sisi: " + segitiga1.getSisi());
                System.out.println("Luas: " + segitiga1.getLuas());
                System.out.println("Keliling: " + segitiga1.getKeliling());
                break;
            case 2:
                System.out.println("Segitiga 2:");
                System.out.println("Alas: " + segitiga2.getAlas());
                System.out.println("Tinggi: " + segitiga2.getTinggi());
                System.out.println("Sisi: " + segitiga2.getSisi());
                System.out.println("Luas: " + segitiga2.getLuas());
                System.out.println("Keliling: " + segitiga2.getKeliling());
                break;
            case 3:
                System.out.println("Segitiga 3:");
                System.out.println("Alas: " + segitiga3.getAlas());
                System.out.println("Tinggi: " + segitiga3.getTinggi());
                System.out.println("Sisi: " + segitiga3.getSisi());
                System.out.println("Luas: " + segitiga3.getLuas());
                System.out.println("Keliling: " + segitiga3.getKeliling());
                break;
            default:
                System.out.println("Input yang anda masukan tidak valid");
                break;
            }
    }
    
}
