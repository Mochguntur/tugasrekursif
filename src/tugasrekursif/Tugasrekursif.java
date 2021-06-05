/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrekursif;

/**
 *
 * @author VivoBook
 */
import java.util.Scanner;
public class Tugasrekursif {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan= new Scanner (System.in);
        System.out.println("Menampilkan Deret angka");
        System.out.print("Masukan Batas Nilai :");
        int nilai = masukan.nextInt();
        cetakAngka(nilai);}
    
    static void cetakAngka (int angka){
        System.out.println(angka);
        if(angka<=1){
            return;}
        angka=angka-2;
        cetakAngka(angka);
        }
        
        
        // TODO code application logic here
    }
    
50

