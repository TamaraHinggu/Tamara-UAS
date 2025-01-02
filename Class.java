/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER
 */
public class Class {
    // Atribut kelas
    private String namaKelas;
    private int jumlahSiswa;
    private String[] daftarSiswa;

    // Konstruktor
    public KelasKu(String namaKelas, int kapasitas) {
        this.namaKelas = namaKelas;
        this.jumlahSiswa = 0;
        this.daftarSiswa = new String[kapasitas];
    }

    // Metode untuk menambahkan siswa
    public void tambahSiswa(String namaSiswa) {
        if (jumlahSiswa < daftarSiswa.length) {
            daftarSiswa[jumlahSiswa] = namaSiswa;
            jumlahSiswa++;
            System.out.println(namaSiswa + " telah ditambahkan ke kelas " + namaKelas);
        } else {
            System.out.println("Kelas sudah penuh, tidak bisa menambahkan siswa baru.");
        }
    }

    // Metode untuk menampilkan daftar siswa
    public void tampilkanDaftarSiswa() {
        System.out.println("Daftar Siswa di Kelas " + namaKelas + ":");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println((i + 1) + ". " + daftarSiswa[i]);
        }
    }

    // Metode untuk mendapatkan nama kelas
    public String getNamaKelas() {
        return namaKelas;
    }

    // Metode untuk mendapatkan jumlah siswa
    public int getJumlahSiswa() {
        return jumlahSiswa;
    }
}
   

