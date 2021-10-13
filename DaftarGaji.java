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
public class DaftarGaji {
    public Pegawai listPegawai[];
    public int i;
    
   public DaftarGaji(int jumlah){
        this.listPegawai = new Pegawai[jumlah];
    }
    void addPegawai(Pegawai pegawai){
        if(i < listPegawai.length){
            listPegawai[i] = pegawai;
            i++;
        }else{
            System.out.println("Tidak bisa memasukkan data"
                    + "karna data sudah penuh");
        }
    }
    void printSemuaGaji(){
        for (Pegawai pegawai : listPegawai) {
            System.out.println("Nip     :" + pegawai.nip);
            System.out.println("Nama    :"+ pegawai.getNama());
            System.out.println("Alamat  :"+pegawai.alamat);
            System.out.println("Gaji    :"+pegawai.getGaji());
            
        }
    }
}
