/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasussegitiga;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Void {
    int alas, tinggi, hasil;
    String judul = "Silahkan menghitung luas segitga";
    String judul(){
        return judul;
    }
    void hitung (){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang alas segitiga = ");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi segitiga = ");
        tinggi = input.nextInt();
    }
    int hasil(){
        hasil = alas*tinggi/2;
        return hasil;
    }
}
