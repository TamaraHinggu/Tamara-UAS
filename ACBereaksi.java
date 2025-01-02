/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author USER
 */
public class ACBereaksi {
   // metode utama untuk menjalankan progeam
    public static void main(String[] args){
        AC ac = new AC();
        
        ac.getStatus(); //menampilkan status awal AC
        ac.turnOn();    //menyalakan AC
        ac.setTemperature(20); //mengatur suhu
        ac.getStatus();  //menampilkan status AC setelah pengaturan suhu
        ac.setTemperature(35);  //mencoba mengatur suhu diluar rentang
        ac.turnOff():  //mematikan AC
        ac.getStatus();  //menampilkan status AC setelah dimatikan
    }
}
