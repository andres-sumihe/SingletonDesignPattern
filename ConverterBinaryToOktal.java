package tugas2.pl.singleton;

public class ConverterBinaryToOktal {
    private static ConverterBinaryToOktal instance = new ConverterBinaryToOktal();
    
    private ConverterBinaryToOktal(){}
    
    public static ConverterBinaryToOktal getInstance(){
        return instance;
    }
    
    public void BinaryToOktal(String binary, String binaryawal){
        int binary1 = Integer.parseInt(binary,2);
        String binaryhasil = Integer.toOctalString(binary1);
        System.out.println("\nHasil Konversi Bilangan Biner "+binaryawal+" ke Oktal Adalah "+binaryhasil);
        System.out.println("");
    }
}
