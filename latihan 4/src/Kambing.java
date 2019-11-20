/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
  * @author ASUS
 * NAMA                 : FAIZAL RACHMAN
 * KELAS                : TI-1B
 * NIM                  : A2.1900061
 * Deskripsi Program    : kambing
 */
public class Kambing {
    
    public void tambahKambing() {
        //deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        
    }
    public static void main(String[] args){
        
        
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        
    }
    
}
