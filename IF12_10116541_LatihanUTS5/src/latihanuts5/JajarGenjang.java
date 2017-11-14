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
public class JajarGenjang implements BangunDatar {

    private int luas, keliling;
    private int sisiAb, sisiBc, sisiCd, sisiDa, alas, tinggi;

    public void JajarGenjang(int ab, int bc, int cd, int da, int alas, int tinggi) {
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCd = cd;
        this.sisiDa = da;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
        System.out.println("luas jajar genjang  =" + luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (sisiAb + sisiDa);
        System.out.println("keliling jajar genjang  =" + keliling);
    }
}
