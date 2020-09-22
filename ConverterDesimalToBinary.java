/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.pl.singleton;

/**
 *
 * @author ACER
 */
public class ConverterDesimalToBinary {
    private static ConverterDesimalToBinary instance= new ConverterDesimalToBinary();
    
    private ConverterDesimalToBinary(){}
    
    public  static ConverterDesimalToBinary getInstance(){
        return instance;
    }
    
    public void DesimalToBinary(int desimal){
        String Biner = Integer.toBinaryString(desimal);
        System.out.println("\nHasil Konversi Bilangan Desimal "+desimal+" ke Biner Adalah "+Biner);
        System.out.println("");
    }
}
