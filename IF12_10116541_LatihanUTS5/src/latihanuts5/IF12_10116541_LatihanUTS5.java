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
public class IF12_10116541_LatihanUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      JajarGenjang JG=new JajarGenjang();
      JG.JajarGenjang(50,60,70,80,100,120);
      Segitiga SG=new Segitiga();
      SG.Segitiga(50,60,70,100,120);
      JG.hitungLuas();
      JG.hitungKeliling();
      SG.hitungLuas();
      SG.hitungKeliling();
    }
    
}
