/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ThinkAgain
 */
public class MatematikaCanggih extends Matematika {
    void modulus(double a, double b, double c){
        double hasil = a%b%c;
        System.out.println("Hasil modulus double : " + hasil);
    }
    
    void modulus(int a, int b, int c){
        int hasil = a%b%c;
        System.out.println("Hasil modulus int: " + hasil);
    }
    
    void modulus(double a, double b){
        double hasil = a%b;
        System.out.println("Hasil modulus double : " + hasil);
    }
    
    void modulus(int a, int b){
        int hasil = a%b;
        System.out.println("Hasil modulus int: " + hasil);
}
}
