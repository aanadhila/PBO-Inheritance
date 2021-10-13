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
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public int gaji;

    public Pegawai(String nip, String nama, String alamat, int gaji) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }
    
    public int getGaji(){
     return gaji;
    }   
}
