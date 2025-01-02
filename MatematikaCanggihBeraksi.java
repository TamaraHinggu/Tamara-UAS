/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ThinkAgain
 */
public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();
        mtkCanggih.modulus(50, 3);
        mtkCanggih.modulus(100, 4, 2);
        mtkCanggih.modulus(150.5, 6.5);
        mtkCanggih.modulus(450.4, 5.6, 2.5);
        
        mtkCanggih.pertambahan(23, 34);
        mtkCanggih.pertambahan(12, 28, 14);
        mtkCanggih.pertambahan(3.4, 4.9);
        mtkCanggih.pertambahan(12.5, 28.7, 14.2);
        
        mtkCanggih.pengurangan(23, 34);
        mtkCanggih.pengurangan(12, 28, 14);
        mtkCanggih.pengurangan(3.4, 4.9);
        mtkCanggih.pengurangan(12.5, 28.7,14.2);
        
        mtkCanggih.perkalian(23, 34);
        mtkCanggih.perkalian(12, 28, 14);
        mtkCanggih.perkalian(3.4, 4.9);
        mtkCanggih.perkalian(12.5, 28.7, 14.2);
        
        mtkCanggih.pembagian(23, 34);
        mtkCanggih.pembagian(12, 28, 14);
        mtkCanggih.pembagian(3.4, 4.9);
        mtkCanggih.pembagian(12.5, 28.7, 14.2);
    }
    
}