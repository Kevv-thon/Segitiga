/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Segitiga {
    Scanner masuk = new Scanner(System.in);
    double alas;
    double tinggi;
    double hasil;
    String hitung;
    
            
    void input() {
        
        System.out.print("Masukkan alas : ");
        alas = masuk.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi = masuk.nextDouble();
    
    }
    void hitung() {
        hasil = (alas * tinggi)/2;                
    }    
    String hasil() {
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Hasil dari perhitungan luas segitiga : "+hasil);
        return "=========================================";
    }
}
