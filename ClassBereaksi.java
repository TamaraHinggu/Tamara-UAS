/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author USER
 */
public class ClassBereaksi {
    public static void main(String[] args) {
        KelasKu kelas1 = new KelasKu("Kelas 10A", 5);
        kelas1.tambahSiswa("Ali");
        kelas1.tambahSiswa("Budi");
        kelas1.tambahSiswa("Citra");
        kelas1.tampilkanDaftarSiswa();
    }
}
