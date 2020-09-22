package tugas2.pl.singleton;

public class ConverterHexToBinary {
    private static ConverterHexToBinary instance = new ConverterHexToBinary();
    
    private ConverterHexToBinary(){}
    
    public static ConverterHexToBinary getInstance(){
        return instance;
    }
    
    public void HexToBinary(String hex, String hexawal){
        int hex1 = Integer.parseInt(hex,16);
        String hexhasil = Integer.toBinaryString(hex1);
        System.out.println("\nHasil Konversi Bilangan Hexadesimal "+hexawal+" ke Oktal Adalah "+hexhasil);
        System.out.println("");
    }
}
