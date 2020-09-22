package tugas2.pl.singleton;

public class ConverterHexToDesimal {
    private static ConverterHexToDesimal instance = new ConverterHexToDesimal();

    private ConverterHexToDesimal(){}
    
    public static ConverterHexToDesimal getInstance(){
        return instance;
    }
    
    public void HexToDesimal(String hex, String hexawal){
        int hexhasil = Integer.parseInt(hex,16);
        System.out.println("\nHasil Konversi Bilangan Hexadesimal "+hexawal+" ke Desimal Adalah "+hexhasil);
        System.out.println("");
    }
}
