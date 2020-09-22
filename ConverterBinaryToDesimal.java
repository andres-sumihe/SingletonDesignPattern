package tugas2.pl.singleton;

public class ConverterBinaryToDesimal {
    private static ConverterBinaryToDesimal instance = new ConverterBinaryToDesimal();

    private ConverterBinaryToDesimal(){}

    public static ConverterBinaryToDesimal getInstance(){
        return instance;
    }

    public void BinaryToDesimal(String binary, String binaryawal){
        int binaryhasil = Integer.parseInt(binary,2);
        System.out.println("\nHasil Konversi Bilangan Biner "+binaryawal+" ke Desimal Adalah "+binaryhasil);
        System.out.println("");
    }
}
