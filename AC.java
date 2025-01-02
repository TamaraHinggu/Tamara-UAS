/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author USER
 */
public class AC {
    private int temperature; // suhu AC
    private boolean isOn;   //status AC(nyala/mati)
    
    //konstruktor
    public AC(){
        this.temperature = 24; //suhu default
        this.isOn = false;     //AC dalam keadaan mati
    }
    
    //metode untuk menyalakan AC
    public void turnOn(){
        isOn = true;
        System.out.println("AC dinyalakan");
    }
    
    //metode mematikan AC
    public void turnOff(){
        isOn = false;
        System.out.println("AC dimatikan");
    }
    
    //metode mengatur suhu
    public void setTemperature(int temp){
        if (isOn){
            if (temp > 16 && temp < 30){ //rentang suhu yang diperbolehkan
                temperature = temp;
                System.out.println("suhu AC diatur ke " + temperature + "°C");
            }else{
                System.out.println("suhu tidak valid. harap masukan suhu antara 16°C hingga 30°C.");
            }
        }else{
            System.out.println("AC dalam keadaan mati.Nyalakan Ac terlebih dahulu.");
            }
        }
    //metode untuk menampilkan status AC
    public void getStatus(){
        String status = isOn ? "ON" : "OFF";
        System.out.println("Status AC: " + status + ", suhu saat ini: " + temperature + "°C");
        
    }
}

