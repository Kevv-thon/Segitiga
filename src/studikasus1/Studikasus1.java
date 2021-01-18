/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

/**
 *
 * @author LENOVO
 */
public class Studikasus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mencari luas segitiga");
        System.out.println("Selamat berhitung");
        System.out.println("");
        Segitiga tiga = new Segitiga();
        tiga.input();
        tiga.hitung();
        
        System.out.println(tiga.hasil());
    }
    
}
