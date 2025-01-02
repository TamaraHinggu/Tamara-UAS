/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author USER
 */
public class Bank {
    int saldo,simpanUang,ambilUang;
    private int total;
    public Bank (int saldo){
        this.saldo = saldo;
        System.out.println("selamat datang di bank ALI");
        System.out.println("saldo saat ini : Rp" +saldo);
    }
    void simpanUang (int simpanUang){
        System.out.println("Simpan Uang : Rp" +simpanUang);
        int hasil = saldo+ simpanUang;
        System.out.println("saldo saat ini : Rp" + hasil);
    }
    void ambilUang (int ambilUang){
        this.total = 60000;
        System.out.println("Ambil Uang : Rp" + ambilUang);
        int hasil = total - ambilUang;
        System.out.println("saldo saat ini : Rp" + hasil);
    }
}
