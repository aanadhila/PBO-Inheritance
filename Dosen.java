/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author LENOVO
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS = super.gaji;

    public Dosen(String nip, String nama, String alamat, int tarif) {
        super(nip, nama, alamat, tarif);
    }
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    public int getGajiD(){
        super.gaji = (this.jumlahSKS * this.TARIF_SKS);
        return gaji;
    }
}
