package tugas2.pl.singleton;

public class ConverterDesimalToHex {
    private static ConverterDesimalToHex instance = new ConverterDesimalToHex();

    private ConverterDesimalToHex(){}
    
    public static ConverterDesimalToHex getInstance(){
        return instance;
    }
    
    public void DesimalToHex(int desimal){
       String Hex = Integer.toHexString(desimal);
       System.out.println("\nHasil Konversi Bilangan Desimal "+desimal+" ke Hexadesimal Adalah "+Hex);
       System.out.println("");
    }
}
