/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts5;

/**
 *
 * @author Sthevan Reynaldo Simak Lando(10116541) PBO-12
 */
public class Segitiga implements BangunDatar {

    private int luas;
    private int keliling;
    private int sisiAb;
    private int sisiBc;
    private int sisiCa;
    private int alas;
    private int tinggi;

    public void Segitiga(int sisiAb, int sisiBc, int sisiCa, int alas, int tinggi) {
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCa = sisiCa;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    public void hitungLuas(){
       luas=alas*tinggi/2;
System.out.println("luas Segitiga  ="+luas); 
    }
    public void hitungKeliling(){
       keliling=sisiAb+sisiBc+sisiCa;
System.out.println("Keliing Segitiga  ="+keliling); 
    }
}
