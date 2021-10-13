package inheritance;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        DaftarGaji gaji = new DaftarGaji(4);
        Pegawai pw1 = new Pegawai("1", "Annisa Aulia","Malang", 150000);
        Pegawai pw2 = new Pegawai("2", "Ana Qanitah", "Lawang", 50000);
        Pegawai pw3 = new Pegawai("3", "Alfinza", "Singosari", 75000);
        Dosen D1 = new Dosen("4", "Bu Dwi", "Surabaya", 100000);
        D1.setSKS(10);
        D1.getGajiD();
        
        gaji.addPegawai(pw1);
        gaji.addPegawai(pw2);
        gaji.addPegawai(pw3);
        gaji.addPegawai(D1);
        gaji.printSemuaGaji();
    }
}
