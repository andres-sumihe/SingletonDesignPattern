package tugas2.pl.singleton;

public class ConverterBinaryToHex {
    private static ConverterBinaryToHex instance = new ConverterBinaryToHex();
    
    private ConverterBinaryToHex(){}
    
    public static ConverterBinaryToHex getInstance(){
        return instance;
    }
    
    public void BinaryToHex(String binary, String binaryawal){
        int binary1 = Integer.parseInt(binary,2);
        String binaryhasil = Integer.toHexString(binary1);
        System.out.println("\nHasil Konversi Bilangan Biner "+binaryawal+" ke Hexadesimal Adalah "+binaryhasil);
        System.out.println("");
    }
}
