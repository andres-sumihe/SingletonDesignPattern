package tugas2.pl.singleton;

public class ConverterHexToOktal {
    private static ConverterHexToOktal instance = new ConverterHexToOktal();
    
    private ConverterHexToOktal(){}
    
    public static ConverterHexToOktal getInstance(){
        return instance;
    }
    
    public void HexToOktal(String hex, String hexawal){
        int hex1 = Integer.parseInt(hex,16);
        String hexhasil = Integer.toOctalString(hex1);
        System.out.println("\nHasil Konversi Bilangan Hexadesimal "+hexawal+" ke Oktal Adalah "+hexhasil);
        System.out.println("");
    }
}
