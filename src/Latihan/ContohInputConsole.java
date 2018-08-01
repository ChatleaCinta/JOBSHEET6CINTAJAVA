/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.io.Console;
public class ContohInputConsole {
 public static void main(String[] args) {
     String nama;
     int usia;
     String alamat;
     // membuat objek console
     Console cinta = System.console();
     // mengisi variabel nama usia alamat dengan console
     System.out.print("Inputkan nama anda: ");
     nama = cinta.readLine();
     System.out.print("Inputkan usia: ");
     usia = Integer.parseInt(cinta.readLine());
     System.out.print("Inputkan alamat anda: ");
     alamat = cinta.readLine();
     // mengampilkan isi variabel nama usia dan alamat
     System.out.println("Nama kamu adalah: " + nama);
     System.out.println("Saat ini berusia " + usia + " tahun");
     System.out.println("Alamat kamu berada di: " + alamat);
 }  
}

